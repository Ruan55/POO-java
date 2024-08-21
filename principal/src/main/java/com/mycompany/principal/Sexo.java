/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Aluno
 */
public enum Sexo {
    
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    private String texto;
    private char caractere;

    private Sexo(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }

    public char getCaractere() {
        return caractere;
    }

    public String getTexto() {
        return texto;
    }

    
}
