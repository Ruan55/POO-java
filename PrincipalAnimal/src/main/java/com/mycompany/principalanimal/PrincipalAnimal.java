/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principalanimal;

/**
 *
 * @author Aluno
 */
public class PrincipalAnimal {

    public static void main(String[] args) {
    Cachorro cachorro1 = new Cachorro();
    Gato gato1 = new Gato();
    Galo galo1 = new Galo();
    Pato pato1 = new Pato();
    
        System.out.println("Cachorro: " + cachorro1.emitirSom());
        System.out.println("Gato: " + gato1.emitirSom());
        System.out.println("Galo: " + galo1.emitirSom());
        System.out.println("Pato: " + pato1.emitirSom());
        
        System.out.println("Cachorro: " + cachorro1.comer());
        System.out.println("Gato: " + gato1.comer());
        System.out.println("Galo: " + galo1.comer());
        System.out.println("Pato: " + pato1.comer());
    
    }
}
