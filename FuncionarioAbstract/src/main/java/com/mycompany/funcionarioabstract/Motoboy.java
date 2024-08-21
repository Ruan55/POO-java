/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionarioabstract;

/**
 *
 * @author Aluno
 */
public class Motoboy extends AbstractFuncionario1{
    
    private String cnh;

    public Motoboy(String cnh, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    @Override
    public String toString() {
        return "\nDados motovoy:" + 
                super.toString() +
                "\nCnh: " + cnh;
    }
    
}
