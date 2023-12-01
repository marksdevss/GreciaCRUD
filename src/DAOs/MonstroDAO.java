package DAOs;

import ConexaoSQL.GreciaSQL;
import Models.MonstosModel;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MonstroDAO {

    public void CriarMitos(MonstosModel mm) {

        String sql = "INSERT INTO Monstros (nome_monstro,descricao_monstro,especie) VALUES (?,?,?)";

        Connection c = null;
        PreparedStatement ps = null;

        try {

            c = ConexaoSQL.GreciaSQL.ConexaoBD();
            ps = c.prepareStatement(sql);

            ps.setInt(1, mm.getId_monstros());
            ps.setString(2, mm.getDescricao_monstro());
            ps.setString(3, mm.getEspecie());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Monstros criado com  sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<MonstosModel> MostrarMonstros() {

        String sql = "SELECT * FROM Monstros";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<MonstosModel> mms = new ArrayList<>();

        try {

            connection = ConexaoSQL.GreciaSQL.ConexaoBD();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                MonstosModel mm = new MonstosModel();

                mm.setId_monstros(resultSet.getInt("id_monstros"));
                mm.setNome_monstro(resultSet.getString("nome_monstro"));
                mm.setDescricao_monstro(resultSet.getString("descricao_monstro"));
                mm.setEspecie(resultSet.getString("especie"));

                mms.add(mm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mms;

    }

}
