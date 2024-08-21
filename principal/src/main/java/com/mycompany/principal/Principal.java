/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario(123, "Ruan", "23123133", "2312321-232", "23453", "04/08/2002", Sexo.MASCULINO, Setor.ENGENHARIA, 3400, "3333-4444", "asfas@gmail.com",
    new Endereco("Rua A", "32", "0", "21321-323", "Salvador", UnidadeFederativa.BAHIA));
    
    
        System.out.println("\nDados do funcionario");
        System.out.println(funcionario1.toString());
  
    }
 }

