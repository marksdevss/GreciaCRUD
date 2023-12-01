package ConexaoSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class GreciaSQL {

    
    
    private static final String DATABASEURL = "jdbc:mysql://localhost:3306/olimpio";
    private static final String USER = "root";

    private static final String PASSWORD = "";

    public static Connection ConexaoBD() throws Exception {

        return DriverManager.getConnection(DATABASEURL, USER, PASSWORD);

    }

    public static void main(String[] args) throws Exception {

        Connection connection = ConexaoBD();

        if (connection != null) {
            JOptionPane.showMessageDialog(null, "Conexao Obtida com sucesso");

            connection.close();
        }
    }

}
