/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principalfuncionariointerface;

/**
 *
 * @author Aluno
 */
public class PrincipalFuncionarioInterface {

    public static void main(String[] args) {
    Motoboy motoboy1 = new Motoboy("Adsa2312", "Ruan", "04/08/2002", Sexo.MASCULINO, Setor.OPERACOES, 3233);
    Diretor diretor1 = new Diretor("Marcos", "21/05/1991", Sexo.MASCULINO, Setor.RECURSOS_HUMANOS, 4566);

        System.out.println(motoboy1.getSalarioFinal());
        System.out.println(diretor1.getSalarioFinal());
    }
}
