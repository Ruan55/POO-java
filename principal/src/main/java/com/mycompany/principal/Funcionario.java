/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String matricula;
    private String dataDeNascimento;
    private Sexo sexo;
    private Setor setor;
    private double salario;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Funcionario(int id, String nome, String cpf, String rg, String matricula, String dataDeNascimento, Sexo sexo, Setor setor, double salario, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "\nFuncionario: " + 
                "\nid: " + id + 
                "\nNome: " + nome + 
                "\ncpf: " + cpf + 
                "\nrg: " + rg + 
                "\nmatricula: " + matricula + 
                "\ndataDeNascimento: " + dataDeNascimento + 
                "\nsexo: " + sexo.getTexto() + 
                "\nsetor: " + setor.getTexto() + 
                "\nsalario: " + salario + 
                "\ntelefone: " + telefone + 
                "\nemail: " + email + 
                "\nendereco: " + endereco;
    }
    
    
    
}
