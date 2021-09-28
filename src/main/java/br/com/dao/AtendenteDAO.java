/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.jdbc.ConnectionFactory;
import br.com.model.Atendente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AtendenteDAO {

    //Cadastro de atendentes
    public void cadastrarAtendente(Atendente ate) {
        //Definir o comando SQL
        String sql = "INSERT INTO tb_atendentes (nome, login, senha) VALUES (?,?,?)";

        //Abrir conexão
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection conexao = factory.obtemConexao()) {
            //Pré Compila o codigo
            PreparedStatement ps = conexao.prepareStatement(sql);

            //Preencher dados
            ps.setString(1, ate.getNome());
            ps.setString(2, ate.getLogin());
            ps.setString(3, ate.getSenha());

            //Executa comando
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Atendente cadastrado com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //remoção de atendentes      
    public void excluirAtendente(Atendente ate) {
        //Definir o comando SQL
        String sql = "DELETE FROM tb_atendentes WHERE login = ?";

        //Abrir conexao
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection conexao = factory.obtemConexao()) {
            //Pré Compila o codigo
            PreparedStatement ps = conexao.prepareStatement(sql);

            //Preencher dados

            ps.setString(1, ate.getLogin());

            //Executa comando
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Atendente removido com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

        public String loginAtendente(String userLogin, String userSenha) {

        //Abrir conexao
        ConnectionFactory factory = new ConnectionFactory();
        
            //Definindo o comando SQL
            String sql = "SELECT * FROM tb_atendentes WHERE login = ?";
            
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
