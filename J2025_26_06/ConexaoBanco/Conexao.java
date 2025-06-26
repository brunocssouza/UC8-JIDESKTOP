/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package J2025_26_06.ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author BRUNOCESARSILVADESOU
 */
public class Conexao {

    private static Connection connection;

    private static final String URL = "jdbc:mysql://localhost:3306/banco1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static Connection conectar() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
                System.out.println("Conectado ao Banco de Dados");
            }
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }

        return connection;
    }

    public static void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS usuarios("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "email VARCHAR(255) NOT NULL UNIQUE,"
                + "senha VARCHAR(255) NOT NULL)";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada!");
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    }
}
