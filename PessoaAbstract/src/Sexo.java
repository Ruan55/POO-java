public enum Sexo {

    MASCULINO("Masculino", 'M'),
    FEMININO("FEMININO", 'F');

   private String texto;
   private char caractere;

    Sexo(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaractere() {
        return caractere;
    }

    @Override
    public String toString() {
        return "\nSexo: " +
                super.toString() +
                "\nTexto: " + texto +
                "\nCaractere: " + caractere;
    }
}
