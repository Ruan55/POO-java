/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.everythingabstract;

/**
 *
 * @author Aluno
 */
public abstract class Fisica extends PessoaAbstract{
    
       protected Sexo sexo;
       protected EstadoCivil estadocivil;
       protected String datanascimento;

    public Fisica(Sexo sexo, EstadoCivil estadocivil, String datanascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadocivil = estadocivil;
        this.datanascimento = datanascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public EstadoCivil getEstadocivil() {
        return estadocivil;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSexo: " + sexo.getTexto() + 
                "\nEstadocivil: " + estadocivil.getTexto() + 
                "\nDatanascimento: " + datanascimento;
    }
    
}
