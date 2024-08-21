/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractpeople;

/**
 *
 * @author Aluno
 */
public class Fisica extends PeopleAbstract1{
    
    private String cpf;
    private String rg;
    private String dataNascimento;

    public Fisica(String cpf, String rg, String dataNascimento, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
    @Override
    public String toString() {
        return "\nDados pessoa fisica: " +
                super.toString() +
                "\ncpf: " + cpf + 
                "\nrg: " + rg + 
                "\ndataNascimento: " + dataNascimento;
    }
    
}
