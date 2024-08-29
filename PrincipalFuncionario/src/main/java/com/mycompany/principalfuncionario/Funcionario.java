/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalfuncionario;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario {
 
   protected String nome;
   protected String cpf;
   protected String rg;
   protected Endereco endereco;
   protected Setor setor;
   protected Sexo sexo;
   protected double salario;
   protected String dataNascimento;

    public Funcionario(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.setor = setor;
        this.sexo = sexo;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public Setor getSetor() {
        return setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public double getSalario() {
        return salario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public abstract double GetSalarioFinal();
    
    @Override
    public String toString() {
        return  super.toString() + 
                "\nNome: " + nome + 
                "\nCpf: " + cpf + 
                "\nRg: " + rg + 
                "\nEndereco: " + endereco + 
                "\nSetor: " + setor.getNome() + 
                "\nSexo: " + sexo.getTexto() + 
                "\nSalario: " + salario +
                "\nSalario Final: " + GetSalarioFinal() +
                "\nDataNascimento: " + dataNascimento;
    }

}
