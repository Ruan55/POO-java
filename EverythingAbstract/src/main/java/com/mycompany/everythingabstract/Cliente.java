/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.everythingabstract;

/**
 *
 * @author Aluno
 */
public class Cliente extends Fisica{
    
    private String protocoloAtendimento;

    public Cliente(String protocoloAtendimento, Sexo sexo, EstadoCivil estadocivil, String datanascimento, String nome, String telefone, String email, Endereco endereco) {
        super(sexo, estadocivil, datanascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nInformações Cliente:"+
               "\nProtocoloAtendimento: " + protocoloAtendimento;
    }

    
    
}
