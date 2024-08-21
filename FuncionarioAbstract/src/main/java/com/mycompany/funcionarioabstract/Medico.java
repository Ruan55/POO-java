/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionarioabstract;

/**
 *
 * @author Aluno
 */
public class Medico extends AbstractFuncionario1{
    
    private String crm;

    public Medico(String crm, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    @Override
    public String toString() {
        return "\nDados medico:" + 
                super.toString() +
                "\nCrm: " + crm;
    }
    
}
