
package br.com.jdbc;

import java.sql.Connection;


public class TesteConexao {
    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        Connection c = factory.obtemConexao();
        System.out.println("Conexao feita com sucesso!!");
    }
}
