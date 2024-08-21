/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionarioabstract;

/**
 *
 * @author Aluno
 */
public class FuncionarioAbstract {

    public static void main(String[] args) {
    Motoboy motoboy1 = new Motoboy("000032132", "Maldini", "23123132", "1321312321", 4560);
    Engenheiro engenheiro1 = new Engenheiro("213123", "Materazzi", "231231132", "12321321", 2300);
    Medico medico1 = new Medico("2312321", "Cannavaro", "23312321", "23213123", 5670);
    
        System.out.println(motoboy1.toString());
        System.out.println(engenheiro1.toString());
        System.out.println(medico1.toString());
        
    }
}
