/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Funcionario;
import model.Pedido;
import model.Produto;
import model.ProdutoPedido;

/**
 *
 * @author thale
 */
public class PedidoData extends Conexao {

    public PedidoData() throws SQLException, ClassNotFoundException {
    }

    public boolean cadastrarPedido(Pedido pedido) throws Exception {
        GastoData gastoData = new GastoData();

        Funcionario func = gastoData.buscaFuncNome(pedido.getCpfFuncionario());
        pedido.setCpfFuncionario(func.getCpf());

        String sql = "Insert into pedido (nome_cliente, cpf_func) values (?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, pedido.getNome_cliente());
        ps.setString(2, pedido.getCpfFuncionario());
        ps.executeUpdate();

        String sql2 = "select idpedido from pedido where nome_cliente =? and cpf_func =?";
        PreparedStatement ps2 = getConexao().prepareStatement(sql2);
        ps2.setString(1, pedido.getNome_cliente());
        ps2.setString(2, pedido.getCpfFuncionario());
        ResultSet rs = ps2.executeQuery();
        while (rs.next()) {
            pedido.setIdPedido(rs.getInt("idpedido"));
            cadastrarPedidoProduto(pedido);
        }

        return true;
    }

    public boolean cadastrarPedidoProduto(Pedido pedido) throws Exception {
        for (ProdutoPedido produtoPedido : pedido.getProdutoPedido()) {
            String sql = "insert into produto_pedido (id_produto, id_pedido, qtd) values (?,?,?)";
            PreparedStatement ps = getConexao().prepareStatement(sql);
            ps.setInt(1, produtoPedido.getId_produto());
            ps.setInt(2, pedido.getIdPedido());
            ps.setInt(3, produtoPedido.getQtd());

            ps.executeUpdate();
        }

        return true;
    }

    public ArrayList<Pedido> pesquisar(String pesq) throws Exception {
        ArrayList<Pedido> lista = new ArrayList<>();
        String sql = "select * from pedido p inner join produto_pedido pp on (p.idPedido = pp.id_pedido) "
                + "where nome_cliente like '" + pesq + "%'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            boolean existe = false;
            ProdutoPedido produtoPedido = new ProdutoPedido(rs.getInt("id_produto"), rs.getInt("id_pedido"), rs.getInt("qtd"));
            Pedido obj = new Pedido(rs.getInt("idPedido"), new ArrayList<>(), rs.getString("nome_cliente"),
                    rs.getString("cpf_func"));
            for (Pedido ped : lista) {
                int idPedido = ped.getProdutoPedido().get(0).getId_pedido();
                if (idPedido == rs.getInt("id_pedido")) {
                    ped.adicionarPedidoProduto(produtoPedido);
                    existe = true;
                }
            }
            if (!existe) {
                obj.adicionarPedidoProduto(produtoPedido);
                lista.add(obj);
            }
        }
        return lista;
    }

    public Produto pesquisaProduto(int id) throws Exception {
        Produto prod = new Produto();
        String sql = "select * from produto where idProduto=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            prod = new Produto(rs.getInt("idProduto"), rs.getString("nome_produto"), rs.getDouble("valor_produto"));
        }

        return prod;
    }

    public boolean editar(Pedido obj) throws Exception {
        GastoData gastoData = new GastoData();
        Funcionario func = gastoData.buscaFuncNome(obj.getCpfFuncionario());

        boolean pedidoInserido = false, deletado = false, prodPedInserido = false;
        //Salvando na tabela pedido
        String sql = "Update pedido set cpf_func=?, nome_cliente=? "
                + " where idPedido=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, func.getCpf());
        ps.setString(2, obj.getNome_cliente());
        ps.setInt(3, obj.getIdPedido());
        if (ps.executeUpdate() > 0) {
            pedidoInserido = true;
        };

        //Excluindo os produtos da tabela produto_pedido
        String sql2 = "Delete from produto_pedido where id_pedido=?";
        PreparedStatement ps2 = getConexao().prepareStatement(sql2);
        ps2.setInt(1, obj.getIdPedido());
        if (ps2.executeUpdate() > 0) {
            deletado = true;
        };
        obj.getProdutoPedido().size();
        prodPedInserido = cadastrarPedidoProduto(obj);

        return (pedidoInserido && deletado && prodPedInserido);

    }

    public boolean excluir(int id) throws Exception {
        String sql = "Delete from produto_pedido where id_pedido=?; "
                + "Delete from pedido where idPedido=?;";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        ps.setInt(2, id);
        return ps.executeUpdate() > 0;
    }

}
