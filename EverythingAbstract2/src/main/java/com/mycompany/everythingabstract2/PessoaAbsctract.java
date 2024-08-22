/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.everythingabstract2;

/**
 *
 * @author Aluno
 */
public abstract class PessoaAbsctract {
    
   protected int id;
   protected String nome;
   protected String telefone;
   protected String email;
   protected Endereco endereco;

    public PessoaAbsctract(int id, String nome, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
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
        return "\nId: " + id + 
                "\nNome: " + nome + 
                "\nTelefone: " + telefone + 
                "\nEmail: " + email + 
                "\nEndereco: " + endereco;
    }
    
    
    
}
