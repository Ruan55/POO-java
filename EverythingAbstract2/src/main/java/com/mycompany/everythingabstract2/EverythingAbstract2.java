/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.everythingabstract2;

/**
 *
 * @author Aluno
 */
public class EverythingAbstract2 {

    public static void main(String[] args) {
    Cliente cliente1 = new Cliente(3123, Sexo.FEMININO, EstadoCivil.CASADO, "13/03/1997", 3123, "Camilla", "3321-2133", "sa@gmail.com",
    new Endereco("Rua 2", "5", "N/A", "3123132", "Camaçari", UnidadeFederativa.BAHIA));
    PrestacaoServico prestacaoServico1 = new PrestacaoServico("05/02/2024", "05/02/2025", "3123131", "321312", 4535, "Nvidia", "3243-6575", "Nvidia@gmail.com",
    new Endereco("Rua 213", "22", "N/A", "32132", "São Paulo", UnidadeFederativa.SAO_PAULO));
    Fornecedor fornecedor1 = new Fornecedor("Placa de video", "312321", "231312", 7688, "Caio", "3212-0343", "Caaw@gmail.com",
    new Endereco("Rua 23", "432", "N/A", "12321", "São Paulo", UnidadeFederativa.SAO_PAULO));
    Engenheiro engenheiro1 = new Engenheiro("3123", "31231", "321312", "321312", Setor.ENGENHARIA, 3213, 321, "Diego", "3213-3213", "Di1@gmail.com",
    new Endereco("Rua 21", "32", "N/A", "32132", "Maringá", UnidadeFederativa.RIO_DE_JANEIRO));
    Medico medico1 = new Medico("3123", "32132", "453543", "23432", Setor.SAUDE, 5767, 3334, "Luana", "3231-3123", "Lu12@gmail.com",
    new Endereco("Rua B", "32", "N/A", "31231", "Salvador", UnidadeFederativa.BAHIA));
    Advogado advogado1 = new Advogado("31231", "31231", "31233", "31231", Setor.JURIDICO, 3123, 766, "Ronald", "6787-2344", "R9@gmail.com",
    new Endereco("Rua C", "76", "N/A", "32132", "Salvador", UnidadeFederativa.BAHIA));
    
        System.out.println(cliente1.toString());
        System.out.println(prestacaoServico1.toString());
        System.out.println(fornecedor1.toString());
        System.out.println(engenheiro1.toString());
        System.out.println(medico1.toString());
        System.out.println(advogado1.toString());
        
    }
}
