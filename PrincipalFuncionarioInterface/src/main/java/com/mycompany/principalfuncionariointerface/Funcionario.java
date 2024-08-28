/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalfuncionariointerface;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario {
    
   protected String nome;
   protected String dataNascimento;
   protected Sexo sexo;
   protected Setor setor;
   protected double salarioBase;

    public Funcionario(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    // A implementação não é obrigatória.
    public abstract double getSalarioFinal();

    @Override
    public String toString() {
        return "\nFuncionario: " + 
                "\nNome: " + nome + 
                "\nDataNascimento: " + dataNascimento + 
                "\nSexo: " + sexo.getTexto() + 
                "\nSetor: " + setor.getNome() + 
                "\nSalarioBase: " + salarioBase;
    }

}
