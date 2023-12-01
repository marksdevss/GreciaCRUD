package DAOs;

import ConexaoSQL.GreciaSQL;
import Models.HeroisModel;
import javax.swing.*;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HeroisDAO {

    public void CriarHerois(HeroisModel hm) {

        String sql = "INSERT INTO Herois (nome_herois, descricao_herois,poder) VALUES (?,?,?)";

        Connection c = null;
        PreparedStatement ps = null;

        try {

            c = ConexaoSQL.GreciaSQL.ConexaoBD();
            ps = c.prepareStatement(sql);

            ps.setString(1, hm.getNome_herois());
            ps.setString(2, hm.getDescricao_herois());
            ps.setString(3, hm.getPoder());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Heroi criado com  sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<HeroisModel> MostrarHerois() {

        String sql = "SELECT * FROM Herois";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<HeroisModel> hms = new ArrayList<>();

        try {

            connection = ConexaoSQL.GreciaSQL.ConexaoBD();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                HeroisModel hm = new HeroisModel();

                hm.setId_herois(resultSet.getInt("id_herois"));
                hm.setNome_herois(resultSet.getString("nome_herois"));
                hm.setDescricao_herois(resultSet.getString("descricao_herois"));
                hm.setPoder(resultSet.getString("poder"));

                hms.add(hm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return hms;

    }

}
