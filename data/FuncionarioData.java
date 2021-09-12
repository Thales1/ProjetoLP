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

/**
 *
 * @author thale
 */
public class FuncionarioData extends Conexao {

    public FuncionarioData() throws SQLException, ClassNotFoundException {
    }

    public boolean cadastrarFuncionario(Funcionario func) throws Exception {
        String sql = "Insert into Funcionario (cpf, nome_func, email, senha) values (?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, func.getCpf());
        ps.setString(2, func.getNome_func());
        ps.setString(3, func.getEmail());
        ps.setString(4, func.getSenha());
        return ps.executeUpdate() > 0;
    }

    public ArrayList<Funcionario> pesquisar(String pesq) throws Exception {
        ArrayList<Funcionario> lista = new ArrayList<>();
        String sql = "select * from funcionario where nome_func like '" + pesq + "%'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Funcionario obj = new Funcionario(rs.getString("cpf"), rs.getString("nome_func"),
                    rs.getString("email"), rs.getString("senha"));
            lista.add(obj);
        }

        return lista;
    }

    public boolean editar(Funcionario obj) throws Exception {
        String sql = "Update funcionario set nome_func=?, email=?, senha=?"
                + " where cpf=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNome_func());
        ps.setString(2, obj.getEmail());
        ps.setString(3, obj.getSenha());
        ps.setString(4, obj.getCpf());
        return ps.executeUpdate() > 0;
    }

    public boolean excluir(String cpf) throws Exception {
        String sql = "Delete from funcionario where cpf=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, cpf);
        return ps.executeUpdate() > 0;
    }

}
