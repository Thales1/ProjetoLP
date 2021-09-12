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
import model.Produto;

/**
 *
 * @author thale
 */
public class ProdutoData extends Conexao {

    public ProdutoData() throws SQLException, ClassNotFoundException {
    }

    public boolean cadastrarProduto(Produto produto) throws Exception {
        String sql = "Insert into Produto (nome_produto, valor_produto) values (?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, produto.getNome_produto());
        ps.setDouble(2, produto.getValor_produto());
        return ps.executeUpdate() > 0;
    }

    public ArrayList<Produto> pesquisar(String pesq) throws Exception {
        ArrayList<Produto> lista = new ArrayList<>();
        String sql = "select * from produto where nome_produto like '" + pesq + "%'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Produto obj = new Produto(rs.getInt("idProduto"), rs.getString("nome_produto"),
                    rs.getDouble("valor_produto"));
            lista.add(obj);
        }

        return lista;
    }

    public boolean editar(Produto obj) throws Exception {
        String sql = "Update produto set nome_produto=?,valor_produto=?"
                + " where idProduto=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNome_produto());
        ps.setDouble(2, obj.getValor_produto());
        ps.setInt(3, obj.getIdProduto());
        return ps.executeUpdate() > 0;
    }
    
    public boolean excluir(int id) throws Exception {
        String sql="Delete from produto where idproduto=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,id);
        return ps.executeUpdate()>0;
    }

}
