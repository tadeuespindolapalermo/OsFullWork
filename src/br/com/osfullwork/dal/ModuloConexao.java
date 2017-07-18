package br.com.osfullwork.dal;

import java.sql.*;

public class ModuloConexao {
    
    // Método responsável por estabelecer a conexão com o banco
    public static Connection conector() {
        
        java.sql.Connection conexao; // variável que recebe o String de conexão
        String driver = "com.mysql.jdbc.Driver";// chama o Driver importado para Bibliotecas (conector)
        String url = "jdbc:mysql://localhost:3306/dbinfox"; // armazenando informações referente ao Banco
        String user = "root"; //armazenando informações referente ao Banco
        String password = "mysql1985"; //armazenando informações referente ao Banco
        
        // estabelecendo conexão com o Banco
        try {            
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (SQLException e) {                      
            return null;
        }
    }    
}