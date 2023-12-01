package DAOs;

import ConexaoSQL.GreciaSQL;
import Models.MitosModel;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MitosDAO {

  public void CriarMitos(MitosModel mm) {

        String sql = "INSERT INTO Mitos (titulo_mito,descricao_mitos,deuses_envolvidos,herois_envolvidos) VALUES (?,?,?,?)";

        Connection c = null;
        PreparedStatement ps = null;

        try {

            c = ConexaoSQL.GreciaSQL.ConexaoBD();
            ps = c.prepareStatement(sql);

            ps.setString(1, mm.getTitulo_mito());
            ps.setString(2, mm.getDescricao_mitos());
            ps.setString(3, mm.getDeuses_envolvidos());
            ps.setString(4, mm.getHerois_envolvidos());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Mitos criado com  sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<MitosModel> MostrarMitos() {

        String sql = "SELECT * FROM Mitos";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<MitosModel> mms = new ArrayList<>();

        try {

            connection = ConexaoSQL.GreciaSQL.ConexaoBD();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                MitosModel mm = new MitosModel();

                mm.setId_mito(resultSet.getInt("id_mito"));
                mm.setTitulo_mito(resultSet.getString("titulo_mito"));
                mm.setDescricao_mitos(resultSet.getString("descricao_mitos"));
                mm.setDeuses_envolvidos(resultSet.getString("deuses_envolvidos"));
                mm.setHerois_envolvidos(resultSet.getString("herois_envolvidos"));

                mms.add(mm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mms;

    }
    
    
    
}
