/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.everythingabstract2;

/**
 *
 * @author Aluno
 */
public class Engenheiro extends Funcionario{
    
    private String crea;

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, id, nome, telefone, email, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCrea: " + crea;
    }
    
}
