package DAOs;

import ConexaoSQL.GreciaSQL;
import Models.AdminModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import java.sql.Connection;

public class LoginDAO {

    public ResultSet LoginAdministrador(AdminModel am) {

        String sql = "SELECT * FROM Login WHERE usuario = ? and senha = ? ";

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            con = ConexaoSQL.GreciaSQL.ConexaoBD();
            ps = con.prepareStatement(sql);

            ps.setString(1, am.getUsuario());
            ps.setString(2, am.getSenha());

            rs = ps.executeQuery();

        } catch (Exception e) {
            System.out.println("Erro autenticacao do administrador " + e);
        }

        return rs;
    }

}
