/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacaomatematica;

/**
 *
 * @author Aluno
 */
public class OperacaoMatematica {

    public static void main(String[] args) {
    Soma soma1 = new Soma();
    Subtracao subtracao1 = new Subtracao();
    Multiplicacao multiplicacao1 = new Multiplicacao();
    Divisao divisao1 = new Divisao();
    
        System.out.println("+" + soma1.calcular(2 ,2));
        System.out.println(subtracao1.calcular(2, 2));
        System.out.println(multiplicacao1.calcular(2,2));
        System.out.println(divisao1.calcular(2, 2));
        
    }
}
