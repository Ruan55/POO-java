public abstract class Pessoa {

    protected String nome;
    protected String telefone;
    protected String email;
    Endereco endereco;

    public Pessoa(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "\nPessoa: " +
                "\nNome: " + nome +
                "\nTelefone: " + telefone+
                "\nEmail: " + email +
                "\nEndereco: " + endereco;
    }
}
