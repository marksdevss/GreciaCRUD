package DAOs;

import ConexaoSQL.GreciaSQL;
import Models.TitansModels;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TitansDAO {

    public void CriarTiTans(TitansModels tm) {

        String sql = "INSERT INTO Titas (nome_titans,descricao_titans,poderes_titan) VALUES (?,?,?)";

        Connection c = null;
        PreparedStatement ps = null;

        try {

            c = ConexaoSQL.GreciaSQL.ConexaoBD();
            ps = c.prepareStatement(sql);

            ps.setString(1, tm.getNome_titans());
            ps.setString(2, tm.getDescricao_titans());
            ps.setString(3, tm.getPoderes_titan());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Titan criado com  sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<TitansModels> MostrarTitans() {

        String sql = "SELECT * FROM Titas";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<TitansModels> tms = new ArrayList<>();

        try {

            connection = ConexaoSQL.GreciaSQL.ConexaoBD();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                TitansModels tm = new TitansModels();

                tm.setId_titans(resultSet.getInt("id_titans"));
                tm.setNome_titans(resultSet.getString("nome_titans"));
                tm.setDescricao_titans(resultSet.getString("descricao_titans"));
                tm.setPoderes_titan(resultSet.getString("poderes_titan"));

                tms.add(tm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return tms;

    }

    public void DeletarTitans(int id_titans) {

        String sql = "DELETE FROM Titas WHERE id_titans = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConexaoSQL.GreciaSQL.ConexaoBD();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id_titans);

            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }

    }

}
