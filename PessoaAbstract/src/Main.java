public class Main {
    public static void main(String[] args) {
    Fisica fisica1 = new Fisica("Ruan", "3333-4444", "asdfas@gmail.com",
    new Endereco("Rua A", "12", "N/A", "1232123", "Salvador", UnidadeFederativa.BAHIA), Sexo.MASCULINO, "04/02/1981");
    Juridica juridica1 = new Juridica("Ruan Ferramentas", "3333-2222", "asdfsa@gmail.com",
    new Endereco("Rua C", "23", "N/A", "3123213", "Salvador", UnidadeFederativa.BAHIA), "21313213", "213231");

        System.out.println(fisica1.toString());

        System.out.println(juridica1.toString());

    }
}