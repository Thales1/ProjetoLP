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
import model.Gasto;

/**
 *
 * @author thale
 */
public class GastoData extends Conexao {

    public GastoData() throws SQLException, ClassNotFoundException {
    }

    public boolean cadastrarGasto(Gasto gasto) throws Exception {
        Funcionario func = buscaFuncNome(gasto.getCpf_funcionario());
        gasto.setCpf_funcionario(func.getCpf());

        String sql = "Insert into Gasto (cpf_funcionario, valor_gasto, descricao_gasto, dia_gasto) values (?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, gasto.getCpf_funcionario());
        ps.setDouble(2, gasto.getValor_gasto());
        ps.setString(3, gasto.getDescricao_gasto());
        ps.setString(4, gasto.getDia_gasto());
        return ps.executeUpdate() > 0;
    }

    public ArrayList<Gasto> pesquisar(String pesq) throws Exception {
        ArrayList<Gasto> lista = new ArrayList<>();
        String sql = "select * from gasto where descricao_gasto like '%" + pesq + "%'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Gasto obj = new Gasto(rs.getInt("id_gasto"), rs.getDouble("valor_gasto"), rs.getString("descricao_gasto"),
                    rs.getString("dia_gasto"), rs.getString("cpf_funcionario"));
            lista.add(obj);
        }

        return lista;
    }

    public boolean editar(Gasto obj) throws Exception {
        Funcionario func = buscaFuncNome(obj.getCpf_funcionario());
        obj.setCpf_funcionario(func.getCpf());

        String sql = "Update gasto set valor_gasto=?,descricao_gasto=?,dia_gasto=?,cpf_funcionario=?"
                + " where id_gasto=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setDouble(1, obj.getValor_gasto());
        ps.setString(2, obj.getDescricao_gasto());
        ps.setString(3, obj.getDia_gasto());
        ps.setString(4, obj.getCpf_funcionario());
        ps.setInt(5, obj.getId_gasto());
        return ps.executeUpdate() > 0;
    }

    public boolean excluir(int id) throws Exception {
        String sql = "Delete from gasto where id_gasto=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        return ps.executeUpdate() > 0;
    }

    public ArrayList<Funcionario> buscaFuncionarios() throws Exception {
        ArrayList<Funcionario> listaFunc = new ArrayList<>();

        String sql = "select * from funcionario";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Funcionario func = new Funcionario(rs.getString("cpf"), rs.getString("nome_func"), rs.getString("email"), rs.getString("senha"));
            listaFunc.add(func);
        }

        return listaFunc;
    }

    public Funcionario buscaFuncionario(String cpf) throws Exception {
        Funcionario func = new Funcionario();

        String sql = "select * from funcionario where cpf=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, cpf);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            func = new Funcionario(rs.getString("cpf"), rs.getString("nome_func"), rs.getString("email"), rs.getString("senha"));
        }

        return func;
    }

    public Funcionario buscaFuncNome(String nome) throws Exception {
        Funcionario func = new Funcionario();
        String sql = "select * from funcionario where nome_func = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, nome);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            func = new Funcionario(rs.getString("cpf"), rs.getString("nome_func"), rs.getString("email"), rs.getString("senha"));
        }

        return func;
    }

}
