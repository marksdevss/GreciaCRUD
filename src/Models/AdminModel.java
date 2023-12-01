package Models;

public class AdminModel {

    private int id_login;
    private String usuario;
    private String senha;

    public AdminModel() {
    }

    public AdminModel(int id_login, String usuario, String senha) {
        this.id_login = id_login;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
