public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private double salario;

    public Pessoa(String nome, int idade, double altura, double peso, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getSalario() {
        return salario;
    }
}
