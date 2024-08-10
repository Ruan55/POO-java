public class Main {
    public static void main(String[] args) {
    Livros livro1 = new Livros("O assassinato no expresso oriente", "Agatha Christie", 240, 23.13);
    Livros livro2 = new Livros("A arte da guerra", "Sun Tzu", 160, 10.73);

        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Número de páginas: " + livro1.getNumero());
        System.out.println("Preço do livro: " + livro1.getPreco());

        System.out.println("Titulo: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Número de páginas: " + livro2.getNumero());
        System.out.println("Preço do livro: " + livro2.getPreco());

    }
}