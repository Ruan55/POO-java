/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalfuncionario;

/**
 *
 * @author Aluno
 */
public abstract class CargoDeConfianca extends Funcionario{
    
    private Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.bonificacao = bonificacao;
    }


    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargoDeConfianca: " + 
                "\nBonificacao: " + bonificacao;
    }
  
}
