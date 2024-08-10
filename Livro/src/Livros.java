public class Livros {

    private String titulo;
   private String autor;
    private int numero;
   private double preco;

    public Livros(String titulo, String autor, int numero, double preco) {

        this.titulo = titulo;
        this.autor = autor;
        this.numero = numero;
        this.preco = preco;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumero() {
        return numero;
    }

    public double getPreco() {
        return preco;
    }
}
