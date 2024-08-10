public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ruan", 22, 1.80, 62, 700);
        Pessoa pessoa2 = new Pessoa("Fernanda", 21, 1.71, 56, 4000);
        Pessoa pessoa3 = new Pessoa("Paulo", 33, 1.93, 78, 5600);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Altura: " + pessoa1.getAltura());
        System.out.println("Peso: " + pessoa1.getPeso());
        System.out.println("Salario: " + pessoa1.getSalario());

        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Altura: " + pessoa2.getAltura());
        System.out.println("Peso: " + pessoa2.getPeso());
        System.out.println("Salario: " + pessoa2.getSalario());

        System.out.println("Nome: " + pessoa3.getNome());
        System.out.println("Idade: " + pessoa3.getIdade());
        System.out.println("Altura: " + pessoa3.getAltura());
        System.out.println("Peso: " + pessoa3.getPeso());
        System.out.println("Salario: " + pessoa3.getSalario());

    }
}