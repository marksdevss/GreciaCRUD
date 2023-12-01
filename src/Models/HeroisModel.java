package Models;

public class HeroisModel {

    private int id_herois;
    private String nome_herois;
    private String descricao_herois;
    private String poder;

    public HeroisModel() {
    }

    public HeroisModel(int id_herois, String nome_herois, String descricao_herois, String poder) {
        this.id_herois = id_herois;
        this.nome_herois = nome_herois;
        this.descricao_herois = descricao_herois;
        this.poder = poder;
    }

    public int getId_herois() {
        return id_herois;
    }

    public void setId_herois(int id_herois) {
        this.id_herois = id_herois;
    }

    public String getNome_herois() {
        return nome_herois;
    }

    public void setNome_herois(String nome_herois) {
        this.nome_herois = nome_herois;
    }

    public String getDescricao_herois() {
        return descricao_herois;
    }

    public void setDescricao_herois(String descricao_herois) {
        this.descricao_herois = descricao_herois;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

}
