/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalfuncionario;

/**
 *
 * @author Aluno
 */
public class Motorista extends Funcionario{
    
    private String carteiraDeHabilitacao;

    public Motorista(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCarteiraDeHabilitacao: " + carteiraDeHabilitacao;
    }

    public double getSalarioFinal() {
        return super.salario;
    }
    
}
