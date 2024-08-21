public enum UnidadeFederativa {

    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");

    String texto;
    String sigla;

    UnidadeFederativa(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public String getSigla() {
        return sigla;
    }

    @Override
    public String toString() {
        return "\nUnidadeFederativa: " +
                super.toString() +
                "\nTexto: " + texto +
                "\nSigla: " + sigla;
    }
}
