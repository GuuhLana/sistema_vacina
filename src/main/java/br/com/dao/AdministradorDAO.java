
package br.com.dao;

import br.com.jdbc.ConnectionFactory;
import br.com.model.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AdministradorDAO {
    
    
        //Cadastro de administradores
    public void cadastrarAdm(Administrador adm) {
        //Definir o comando SQL
        String sql = "INSERT INTO tb_administrador (nome, login, senha) VALUES (?,?,?)";

        //Abrir conexão
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection conexao = factory.obtemConexao()) {
            //Pré Compila o codigo
            PreparedStatement ps = conexao.prepareStatement(sql);

   
            //Preencher dados
            ps.setString(1, adm.getNome());
            ps.setString(2, adm.getLogin());
            ps.setString(3, adm.getSenha());

            //Executa comando
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Administrador cadastrado com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
        //Remoção de administradores    
    public void excluirAdm(Administrador adm) {
        //Definir o comando SQL
        String sql = "DELETE FROM tb_administrador WHERE login = ?";

        //Abrir conexao
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection conexao = factory.obtemConexao()) {
            //Pré Compila o codigo
            PreparedStatement ps = conexao.prepareStatement(sql);

            //Preencher dados

            ps.setString(1, adm.getLogin());

            //Executa comando
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Administrador removido com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
        //Login administrador
    public String loginAdm(String userLogin, String userSenha) {

        //Abrir conexao
        ConnectionFactory factory = new ConnectionFactory();
        
            //Definindo o comando SQL
            String sql = "SELECT * FROM tb_administrador WHERE login = ?";
            
        try (Connection conexao = factory.obtemConexao(); PreparedStatement ps = conexao.prepareStatement(sql);) {


            //Preencher dados
            ps.setString(1, userLogin);
            ResultSet rs = ps.executeQuery();

            if (rs != null && rs.next()) {
                String senha = rs.getString("senha");
                
                //Mesma coisa que userSenha == senha
                if (userSenha.equals(senha)) {
                    return null;
                } else {
                    return "Senha incorreta";
                }

            } else{
                return "Usuário incorreto";
            }

            
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        
    }


}
