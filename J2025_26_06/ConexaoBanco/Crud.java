/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J2025_26_06.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author BRUNOCESARSILVADESOU
 */
public class Crud {
    public static boolean registrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (email, senha) VALUES (?, ?)";
        
        try(Connection con = Conexao.conectar();
            PreparedStatement stmt = con.prepareStatement(sql)) {
            
            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getSenha());
            return true;
        } catch(SQLException error) {
            System.out.println(error.getMessage());
            return false;
        }
    }
}
