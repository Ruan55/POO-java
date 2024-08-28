/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalfuncionariointerface;

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario{
    
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "\nMotoboy: " + 
                "\nCarteiraDeHabilitacao: " + carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }

}
