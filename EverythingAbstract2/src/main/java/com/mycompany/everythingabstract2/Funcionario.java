/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.everythingabstract2;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario extends PessoaAbsctract{
    
   protected String cpf;
   protected String rg;
   protected String matricula;
   protected Setor setor;
   protected double salario;

    public Funcionario(String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
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

    public Setor getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCpf: " + cpf + 
                "\nRg: " + rg + 
                "\nMatricula: " + matricula + 
                "\nSetor: " + setor + 
                "\nSalario: " + salario;
    }
    
    
    
}
