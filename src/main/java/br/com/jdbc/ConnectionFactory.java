
package br.com.jdbc;

    import java.sql.Connection;
    import java.sql.DriverManager;

    public class ConnectionFactory {
       private String  usuario = "projeto";
       private String  senha = "123";
       private String host = "localhost";
       private String porta = "3306";
       private String bd= "bdprojeto";


       public  Connection obtemConexao(){
           try {
               Connection c = DriverManager.getConnection ("jdbc:mysql://" + host + ":" + porta + "/" + bd + "?useTimezone=true&serverTimezone=America/Sao_Paulo", usuario, senha);
           return c;
           }
           catch(Exception ex) {
               ex.printStackTrace();
               return null;
           }
        }

    }

