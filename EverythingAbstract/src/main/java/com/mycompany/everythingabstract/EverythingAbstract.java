/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.everythingabstract;

/**
 *
 * @author Aluno
 */
public class EverythingAbstract {

    public static void main(String[] args) {
    Cliente cliente1 = new Cliente("231331", Sexo.MASCULINO, EstadoCivil.SOLTEIRO, "04/08/2002", "Ruan", "3333-4444", "saad@gmail.com",
    new Endereco("Rua A", "30", "N/A", "3242344", "Salvador", UnidadeFederativa.BAHIA));
    PrestacaoServico prestacaoServico1 = new PrestacaoServico("03/06/2024", "03/06/2025", "32132", "21312312", "Microsoft", "2132-4243", "microsoft@gmail.com",
    new Endereco("Rua T", "45", "N/A", "231321", "Bangu", UnidadeFederativa.RIO_DE_JANEIRO));
    
        
        System.out.println(cliente1.toString());
        
        System.out.println("\n");
        
        System.out.println(prestacaoServico1.toString());
    
    }
}
