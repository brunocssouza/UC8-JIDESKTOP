/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package J2025_26_06.ConexaoBanco;

/**
 *
 * @author BRUNOCESARSILVADESOU
 */
public class ConexaoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Conexao.conectar();
        Conexao.criarTabela();
        
        Usuario usuario = new Usuario("brunin@gmail.com", "senha123");
        Crud.registrarUsuario(usuario);
    }
}
