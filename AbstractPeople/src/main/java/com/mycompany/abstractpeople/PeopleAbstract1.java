/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractpeople;

/**
 *
 * @author Aluno
 */
public abstract class PeopleAbstract1 {
    
    protected String nome;
    protected String telefone;

    public PeopleAbstract1(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + 
                "\nTelefone: " + telefone;
    }
    
    
    
}
