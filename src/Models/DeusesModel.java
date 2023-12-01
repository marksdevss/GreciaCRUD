package Models;

public class DeusesModel {

    private int id_deuses;
    private String nome_deuses;
    private String descricao_deuses;
    private String poder;

    public DeusesModel() {
    }

    public DeusesModel(int id_deuses, String nome_deuses, String descricao_deuses, String poder) {
        this.id_deuses = id_deuses;
        this.nome_deuses = nome_deuses;
        this.descricao_deuses = descricao_deuses;
        this.poder = poder;
    }

    public int getId_deuses() {
        return id_deuses;
    }

    public void setId_deuses(int id_deuses) {
        this.id_deuses = id_deuses;
    }

    public String getNome_deuses() {
        return nome_deuses;
    }

    public void setNome_deuses(String nome_deuses) {
        this.nome_deuses = nome_deuses;
    }

    public String getDescricao_deuses() {
        return descricao_deuses;
    }

    public void setDescricao_deuses(String descricao_deuses) {
        this.descricao_deuses = descricao_deuses;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

}
