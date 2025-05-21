package J2025_20_05.Array.Exercicios;

public class Usuario {
    private String email;
    private String senha;

    Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
}
// instnaciar um usuario e usa-lo como parametro no metodo anterior.