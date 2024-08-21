/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractpeople;

/**
 *
 * @author Aluno
 */
public class AbstractPeople {

    public static void main(String[] args) {
    Fisica fisica1 = new Fisica("12321321", "23132131", "05/11/1993", "João", "3333-4444");
    Juridica juridica1 = new Juridica("23 453 211/ 0001-78", "123456789", "João Ferramentas", "2312-6575");
    
        System.out.println(fisica1.toString());
        
        System.out.println(juridica1.toString());
    }
}
