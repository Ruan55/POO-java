/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalfuncionariointerface;

/**
 *
 * @author Aluno
 */
public class Diretor extends Funcionario implements Contratacao{
    
   // Constante 
   private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "\nDiretor: " + 
                "\nPREMIO: " + PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        double SalarioFinal = 0;
        SalarioFinal  = super.salarioBase * PREMIO;
        SalarioFinal += super.salarioBase;
        return SalarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("=== Admitindo funcionario ===");
        System.out.println("Dados funcionario: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("=== Admitindo funcionario ===");
        System.out.println("Dados funcionario: ");
        System.out.println(funcionario.toString());
    }

}
