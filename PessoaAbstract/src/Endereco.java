public class Endereco{

   private String logradouro;
   private String numero;
   private String complemento;
   private String cep;
   private String cidade;
   private UnidadeFederativa uf;

    public Endereco(String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogradouro(){
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "\nEndereco: " +
                super.toString() +
                "\nLogradouro: " + logradouro +
                "\nNumero: " + numero +
                "\nComplemento: " + complemento +
                "\nCep: " + cep +
                "\nCidade: " + cidade +
                "\nUf: " + uf;
    }
}
