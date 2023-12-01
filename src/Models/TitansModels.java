package Models;

public class TitansModels {

    private int id_titans;
    private String nome_titans;
    private String descricao_titans;
    private String poderes_titan;

    public TitansModels() {
    }

    public TitansModels (int id_titans, String nome_titans, String descricao_titans, String poderes_titan) {
        this.id_titans = id_titans;
        this.nome_titans = nome_titans;
        this.descricao_titans = descricao_titans;
        this.poderes_titan = poderes_titan;
    }

    public int getId_titans() {
        return id_titans;
    }

    public void setId_titans(int id_titans) {
        this.id_titans = id_titans;
    }

    public String getNome_titans() {
        return nome_titans;
    }

    public void setNome_titans(String nome_titans) {
        this.nome_titans = nome_titans;
    }

    public String getDescricao_titans() {
        return descricao_titans;
    }

    public void setDescricao_titans(String descricao_titans) {
        this.descricao_titans = descricao_titans;
    }

    public String getPoderes_titan() {
        return poderes_titan;
    }

    public void setPoderes_titan(String poderes_titan) {
        this.poderes_titan = poderes_titan;
    }

}