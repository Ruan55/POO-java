/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalfuncionario;

/**
 *
 * @author Aluno
 */
public class Gerente extends CargoDeConfianca{
    
    private double valorBonificacao = (salario * bonificacao.getValor());

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nSalario final: " + GetSalarioFinal();
    }

    @Override
    public double GetSalarioFinal() {
        return (salario + valorBonificacao);
    }
    
}
