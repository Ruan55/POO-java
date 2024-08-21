/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionarioabstract;

/**
 *
 * @author Aluno
 */
public class Engenheiro extends AbstractFuncionario1{
    
    private String crea;

    public Engenheiro(String crea, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    @Override
    public String toString() {
        return "\nDados engenheiro: " + 
                super.toString() +
                "\nCrea: " + crea;
    }
    
    
    
}
