package br.com.dao;

import br.com.jdbc.ConnectionFactory;
import br.com.model.Pacientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;

public class PacientesDAO {

    //Cadastro de paciente
    public void cadastrarPacientes(Pacientes p) {
        //Definir o comando SQL
        String sql = "INSERT INTO tb_pacientes (nome, idade, profissao, endereco) VALUES (?,?,?,?)";

        //Abrir conexão
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection conexao = factory.obtemConexao()) {
            //Pré Compila o codigo
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, p.getNome());
            ps.setInt(2, p.getIdade());
            ps.setInt(3, p.getProfissao());
            ps.setString(4, p.getEndereco());

            //Executa comando
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //Criando confirmação de vacinação
    public void confirmarVacinacao(Pacientes p) {

        //Definir o comando SQL
        String sql = "UPDATE tb_pacientes SET vacinado = 1, data_de_vacinacao = ? WHERE nome = ?";

        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);

        //Abrir conexão
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection conexao = factory.obtemConexao()) {
            //Pré Compila o codigo
            PreparedStatement ps = conexao.prepareStatement(sql);

            //Preencher dados
            ps.setString(1, data);
            ps.setString(2, p.getNome());

            //Executa comando
            ps.execute();
            ps.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //Remoção de Pacientes    
    public void excluirPacientes(Pacientes p) {
        //Definir o comando SQL
        String sql = "DELETE FROM tb_pacientes WHERE nome= ?";

        //Abrir conexao
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection conexao = factory.obtemConexao()) {
            //Pré Compila o codigo
            PreparedStatement ps = conexao.prepareStatement(sql);

            //Preencher dados
            ps.setString(1, p.getNome());

            //Executa comando
            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Paciente removido com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<Pacientes> listarPacientes() {
        try {

            ConnectionFactory factory = new ConnectionFactory();

            Connection conexao = factory.obtemConexao();

            //Criar lista
            List<Pacientes> lista = new ArrayList<>();

            //Criar comando SQL
            String sql = "SELECT * FROM tb_pacientes";

            //Organizar e executar
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //Todo comando SELECT será executado e gravado em outro objeto (ResultSet)
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pacientes p = new Pacientes();
                p.setNome(rs.getString("nome"));
                p.setIdade(rs.getInt("idade"));
                p.setProfissao(rs.getInt("profissao"));
                p.setEndereco(rs.getString("endereco"));
                p.setVacinado(rs.getInt("vacinado"));
                p.setDataDeVacinacao(rs.getString("data_de_vacinacao"));

                lista.add(p);

            }
            return lista;

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }

    }

    public List<Pacientes> buscarData(int idade1, int idade2) {
        List<Pacientes> lista = new ArrayList<>();
        String sql = "SELECT * FROM tb_pacientes WHERE idade BETWEEN ? AND ? AND vacinado = 1";

        //Abrir conexão
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection conexao = factory.obtemConexao()) {
            //Pré Compila o codigo
            PreparedStatement ps = conexao.prepareStatement(sql);

            //Preencher dados
            ps.setInt(1, idade1);
            ps.setInt(2, idade2);


            //Todo comando SELECT será executado e gravado em outro objeto (ResultSet)
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pacientes p = new Pacientes();
                p.setNome(rs.getString("nome"));
                p.setIdade(rs.getInt("idade"));
                p.setProfissao(rs.getInt("profissao"));
                p.setEndereco(rs.getString("endereco"));
                p.setVacinado(rs.getInt("vacinado"));
                p.setDataDeVacinacao(rs.getString("data_de_vacinacao"));

                lista.add(p);
                
            }
            //Executa comando
            ps.execute();
            ps.close();

            return lista;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
