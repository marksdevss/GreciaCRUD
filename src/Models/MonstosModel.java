package Models;

public class MonstosModel {

    private int id_monstros;
    private String nome_monstro;
    private String descricao_monstro;
    private String especie;

    public MonstosModel() {
    }

    public MonstosModel(int id_monstros, String nome_monstro, String descricao_monstro, String especie) {
        this.id_monstros = id_monstros;
        this.nome_monstro = nome_monstro;
        this.descricao_monstro = descricao_monstro;
        this.especie = especie;
    }

    public int getId_monstros() {
        return id_monstros;
    }

    public void setId_monstros(int id_monstros) {
        this.id_monstros = id_monstros;
    }

    public String getNome_monstro() {
        return nome_monstro;
    }

    public void setNome_monstro(String nome_monstro) {
        this.nome_monstro = nome_monstro;
    }

    public String getDescricao_monstro() {
        return descricao_monstro;
    }

    public void setDescricao_monstro(String descricao_monstro) {
        this.descricao_monstro = descricao_monstro;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
}
