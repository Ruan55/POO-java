/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.everythingabstract2;

/**
 *
 * @author Aluno
 */
public class Medico extends Funcionario{
    
    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, id, nome, telefone, email, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCrm: " + crm;
    }
    
}
