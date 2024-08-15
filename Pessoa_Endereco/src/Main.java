public class Main {
    public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa(21313, "Ruan", 22, "3333-4444", "asfdafas@gmail.com", Sexo.MASCULINO);
    Endereco endereco1 = new Endereco("Rua A", "33", "0", "33333-444", "Salvador", UnidadeFederativa.BAHIA);

        System.out.println("\nDados do cliente");
        System.out.println("Id: " + pessoa1.getId());
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Telefone: " + pessoa1.getTelefone());
        System.out.println("Email: " + pessoa1.getEmail());
        System.out.println("Sexo: " + pessoa1.getSexo().getTexto());

        System.out.println("\nDados do endereço");
        System.out.println("Logradouro: " + endereco1.getLogradouro());
        System.out.println("Número: " + endereco1.getNumero());
        System.out.println("Complemento: " + endereco1.getComplemento());
        System.out.println("Cep: " + endereco1.getCep());
        System.out.println("Unidade Federativa: " + endereco1.getUnidadefederativa().getSigla());

    }
}