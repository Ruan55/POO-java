/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.everythingabstract2;

/**
 *
 * @author Aluno
 */
public class Cliente extends Fisica{
    
    private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, Sexo sexo, EstadoCivil estadocivil, String datanascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(sexo, estadocivil, datanascimento, id, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nProtocoloAtendimento: " + protocoloAtendimento;
    }
    
}
