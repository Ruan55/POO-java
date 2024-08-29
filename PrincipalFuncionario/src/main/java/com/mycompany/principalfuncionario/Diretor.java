/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalfuncionario;

/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca implements Contratacao{
    
    private final double PREMIO = 0.5;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPREMIO: " + PREMIO;
    }
    
    public double getSalarioFinal() {
        double SalarioFinal = 0;
        SalarioFinal  = super.salario * PREMIO;
        SalarioFinal += super.salario;
        return SalarioFinal;
    }

    public void admitir(Funcionario funcionario) {
        System.out.println("=== Admitindo funcionario ===");
        System.out.println("Dados funcionario: ");
        System.out.println(funcionario.toString());
    }

    public void demitir(Funcionario funcionario) {
        System.out.println("=== Admitindo funcionario ===");
        System.out.println("Dados funcionario: ");
        System.out.println(funcionario.toString());
    }
    
}
