/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principalfuncionario;

/**
 *
 * @author Aluno
 */
public class PrincipalFuncionario {

    public static void main(String[] args) {
    Advogado advogado1 = new Advogado("32132", "Paula", "3232233", "321321",
    new Endereco("Rua C", "32", "N/A", "323213", "Salvador", UnidadeFederativa.BAHIA), Setor.MARKETING, Sexo.FEMININO, 3213, "03/04/1999");
    Motorista motorista1 = new Motorista("asdf3237", "Tiago", "3213321", "31233",
    new Endereco("Rua I", "76", "N/A", "213123", "São Paulo", UnidadeFederativa.SAO_PAULO), Setor.OPERACOES, Sexo.MASCULINO, 1567, "17/08/1978");
    Gerente gerente1 = new Gerente(Bonificacao.GERENTE, "Jonatas", "323223", "3332121",
    new Endereco("Rua O", "2", "N/A", "3213", "Camaçari", UnidadeFederativa.BAHIA), Setor.RECURSOS_HUMANOS, Sexo.MASCULINO, 7899, "29/04/1966");
    Diretor diretor1 = new Diretor(Bonificacao.DIRETOR, "Arnaldo", "2321321", "321132",
    new Endereco("Rua G", "55", "N/A", "231341", "Bangu", UnidadeFederativa.RIO_DE_JANEIRO), Setor.RECURSOS_HUMANOS, Sexo.MASCULINO, 5677, "17/07/1977");
            
        
        System.out.println(advogado1);
        System.out.println(motorista1);
        System.out.println(gerente1);
        System.out.println(diretor1);
    
    }
}
