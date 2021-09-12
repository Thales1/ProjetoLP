/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author thale
 */
public class LoginData extends Conexao {

    public LoginData() throws SQLException, ClassNotFoundException {
    }

    public boolean realizarLogin(String email, String senha) throws Exception {
        boolean confirmaLogin = false;
        String sql = "select email, senha from funcionario where email like '" + email + "'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String emailFunc = rs.getString("email");
            String senhaFunc = rs.getString("senha");

            if (emailFunc.equals(email) && senhaFunc.equals(senha)) {
                confirmaLogin = true;
            }
        }

        return confirmaLogin;
    }
}
