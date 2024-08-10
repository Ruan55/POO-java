public class Main {
    public static void main(String[] args) {
        Pets pet1 = new Pets("Tusk", 2, "Husky siberiano", "Médio", "Ração Premier Fórmula para Cães Adultos de Raças Grandes Sabor Frango Light");
        Pets pet2 = new Pets("Xabi Alonso", 4, "Vira-lata", "Médio", "Ração N&D Raças Médias Adultos. A N&D Ancestral Grain");

        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade());
        System.out.println("Raça: " + pet1.getRaca());
        System.out.println("Porte: " + pet1.getPorte());
        System.out.println("Alimentação: " + pet1.getAlimentacao());

        System.out.println("Nome: " + pet2.getNome());
        System.out.println("Idade: " + pet2.getIdade());
        System.out.println("Raça: " + pet2.getRaca());
        System.out.println("Porte: " + pet2.getPorte());
        System.out.println("Alimentação: " + pet2.getAlimentacao());

    }
}