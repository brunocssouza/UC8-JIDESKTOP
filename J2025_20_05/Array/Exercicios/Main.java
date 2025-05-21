package J2025_20_05.Array.Exercicios;

public class Main {
    public static void main(String[] args) {

        Usuario user = new Usuario("bruno@gmail.com", "12345");

        String[] userDados = criarArray(user);
        System.out.println(userDados[0] + " " + userDados[1]);
    }

    public static String[] criarArray(Usuario user) {
        return new String[]{user.getEmail(), user.getSenha()};
    }







}
