
package br.com.model;

import java.util.Date;



public class Pacientes {
    private String nome;
    private int idade;
    private int profissao;
    private String endereco;
    private String dataDeVacinacao;
    private int vacinado;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setProfissao(int profissao) {
        this.profissao = profissao;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataDeVacinacao(String dataDeVacinacao) {
        this.dataDeVacinacao = dataDeVacinacao;
    }
    
    public void setVacinado(int vacinado) {
        this.vacinado = vacinado;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getProfissao() {
        return profissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDataDeVacinacao() {
        return dataDeVacinacao;
    }
    
    public int getVacinado() {
        return vacinado;
    }
    
    
}
