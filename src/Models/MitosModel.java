package Models;

public class MitosModel {

    private int id_mito;
    private String titulo_mito;
    private String descricao_mitos;
    private String deuses_envolvidos;
    private String herois_envolvidos;

    public MitosModel() {
    }

    public MitosModel(int id_mito, String titulo_mito, String descricao_mitos, String deuses_envolvidos, String herois_envolvidos) {
        this.id_mito = id_mito;
        this.titulo_mito = titulo_mito;
        this.descricao_mitos = descricao_mitos;
        this.deuses_envolvidos = deuses_envolvidos;
        this.herois_envolvidos = herois_envolvidos;
    }

    public int getId_mito() {
        return id_mito;
    }

    public void setId_mito(int id_mito) {
        this.id_mito = id_mito;
    }

    public String getTitulo_mito() {
        return titulo_mito;
    }

    public void setTitulo_mito(String titulo_mito) {
        this.titulo_mito = titulo_mito;
    }

    public String getDescricao_mitos() {
        return descricao_mitos;
    }

    public void setDescricao_mitos(String descricao_mitos) {
        this.descricao_mitos = descricao_mitos;
    }

    public String getDeuses_envolvidos() {
        return deuses_envolvidos;
    }

    public void setDeuses_envolvidos(String deuses_envolvidos) {
        this.deuses_envolvidos = deuses_envolvidos;
    }

    public String getHerois_envolvidos() {
        return herois_envolvidos;
    }

    public void setHerois_envolvidos(String herois_envolvidos) {
        this.herois_envolvidos = herois_envolvidos;
    }

}
