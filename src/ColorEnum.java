public enum ColorEnum {

     ANSI_RED ("\u001B[31m","sfondo rosso");

    private final String codice;

    private final String descrizione;
    ColorEnum(String codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getCodice() {
        return codice;
    }
}
