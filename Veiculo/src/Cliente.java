public class Cliente {

    private String nome;
    private int idade;
    private int cpf;
    private String endereco;
    private int telefone;

    public Cliente(String nome, int idade, int cpf, String endereco, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }
}
