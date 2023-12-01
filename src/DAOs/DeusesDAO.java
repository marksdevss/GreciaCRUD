package DAOs;

import ConexaoSQL.GreciaSQL;
import Models.DeusesModel;
import javax.swing.*;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DeusesDAO {

    public void CriarDeuses(DeusesModel dm) {

        String sql = "INSERT INTO Deuses(nome_deuses,descricao_deuses,poder) VALUES (?,?,?)";

        Connection c = null;
        PreparedStatement ps = null;

        try {

            c = ConexaoSQL.GreciaSQL.ConexaoBD();
            ps = c.prepareStatement(sql);

            ps.setString(1, dm.getNome_deuses());
            ps.setString(2, dm.getDescricao_deuses());
            ps.setString(3, dm.getPoder());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Deus(a) criado com sucesso! ");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public List<DeusesModel> MostrarDeuses() {

        String sql = "SELECT * FROM Deuses";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<DeusesModel> dms = new ArrayList<>();

        try {

            connection = ConexaoSQL.GreciaSQL.ConexaoBD();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                DeusesModel dm = new DeusesModel();

                dm.setId_deuses(resultSet.getInt("id_deuses"));
                dm.setNome_deuses(resultSet.getString("nome_deuses"));
                dm.setDescricao_deuses(resultSet.getString("descricao_deuses"));
                dm.setPoder(resultSet.getString("poder"));

                dms.add(dm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return dms;

    }

    public void DeletarDeuses(int id_deuses) {

        String sql = "DELETE FROM Deuses WHERE id_deuses = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConexaoSQL.GreciaSQL.ConexaoBD();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id_deuses);

            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }

    }

}
