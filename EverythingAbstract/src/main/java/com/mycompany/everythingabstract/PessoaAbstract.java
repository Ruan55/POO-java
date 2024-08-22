/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.everythingabstract;

/**
 *
 * @author Aluno
 */
public abstract class PessoaAbstract {
    
   protected String nome;
   protected String telefone;
   protected String email;
   protected Endereco endereco;

    public PessoaAbstract(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + 
                "\nTelefone: " + telefone + 
                "\nEmail: " + email + 
                "\nEndereco: " + endereco.toString();
    }
    
}
