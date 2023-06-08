public class Cliente {
    private String nome;
    private String cognome;
    private String eMail;
    private int numeroTelefono;

    @Override
    public String toString() {
        return nome + " " + cognome + ":";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Cliente(String nome, String cognome, String eMail, int numeroTelefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.eMail = eMail;
        this.numeroTelefono = numeroTelefono;

    }
}
