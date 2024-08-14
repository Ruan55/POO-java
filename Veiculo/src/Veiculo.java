public class Veiculo {

    private String placa;
    private String cor;
    private int numeroDePassageiros;
    private int capacidadeDeTanque;
    private double velocidadeMaxima;
    private double consumoMedio;

    public Veiculo(String placa, String cor, int numeroDePassageiros, int capacidadeDeTanque, double velocidadeMaxima, double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeDeTanque = capacidadeDeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    public int getCapacidadeDeTanque() {
        return capacidadeDeTanque;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }
}
