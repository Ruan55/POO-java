public class Juridica extends Pessoa{

    String cnpj;
    String inscricaoEstadual;

    public Juridica(String nome, String telefone, String email, Endereco endereco, String cnpj, String inscricaoEstadual) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "\nJuridica: " +
                super.toString() +
                "\nCnpj: " + cnpj +
                "\nInscricaoEstadual: " + inscricaoEstadual;
    }
}
