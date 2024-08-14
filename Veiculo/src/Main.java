public class Main {
    public static void main(String[] args) {
    Veiculo veiculo = new Veiculo("BRA2E19", "Preto", 4, 65, 120, 13.6);
    Cliente cliente = new Cliente("Ruan", 22, 123456789, "Valeria, Salvador", 12312321);

        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Cor: " + veiculo.getCor());
        System.out.println("Número de passageiros: " + veiculo.getNumeroDePassageiros());
        System.out.println("Capacidade do tantque: " + veiculo.getCapacidadeDeTanque());
        System.out.println("Velocidade máxima: " + veiculo.getVelocidadeMaxima());
        System.out.println("Consumo médio: " + veiculo.getConsumoMedio());

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelefone());

    }
}