/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integradorfinanças.CONEXAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bruno.costa2
 */
public class ConexaoDB {
    
    private final String url = "jdbc:postgresql://localhost/GestaoDeCustos";
    
    private final String user = "postgres";
    
    //lembrar de avisar quando mudar o Password ao usar em casa!!
    
    private final String password = "postgres";
    
    private Connection conn;
    private PreparedStatement pstmt;
    private Statement stmt;
    private ResultSet rs;
    
    public Connection open() {
        conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Parabéns conectado com sucesso");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
    
    public void close() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void inserir(String tabela, String valores) {
        try {
    // Abrindo a conexão com o banco
            open();
    // Instanciando o objeto statement (stmt)
            stmt = conn.createStatement();
    // Executando uma instrução SQL.
            stmt.executeUpdate(
                    "INSERT INTO "+ tabela+" VALUES "+valores+"");
                   
    // Fechando a conexão com o banco
            close();
        } catch (SQLException e) {
    // Fechando a conexão com o banco
            close();
            
            e.printStackTrace();
            
        }
    }
    
    public ResultSet buscarDados(String tabela) {
        try {
            open();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+tabela+"");
            return rs;
        } catch (SQLException e) {
            close();
            e.printStackTrace();
        }
        return null;
    }
    
    public void inserirNaTabela(){
        try {
            open();
            stmt = conn.createStatement();
            stmt.executeQuery("select * from");
            
            close();
             } catch (SQLException e) {
    // Fechando a conexão com o banco
            close();
            
            e.printStackTrace();
            
        }
            
           
        
    }
    
     public static void main(String[] args) throws SQLException {
        ConexaoDB app = new ConexaoDB();
        app.open();
        app.close();
        //app.inserir(tabela, valores);
        //app.alterar();
        //app.imprimirAlunos();
        //app.excluir("email != ' '");
    }

  
}
