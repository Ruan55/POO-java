public class Fisica extends Pessoa{

    Sexo sexo;
    String dataNascimento;

    public Fisica(String nome, String telefone, String email, Endereco endereco, Sexo sexo, String dataNascimento) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "\nFisica: " +
                super.toString() +
                "\nsexo: " + sexo +
                "\ndataNascimento: " + dataNascimento;
    }
}
