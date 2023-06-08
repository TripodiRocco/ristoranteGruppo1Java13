public class Tavolo {
    private TipoTavolo numeroPosti;
    private int numeroTavolo;

    public Tavolo(TipoTavolo numeroPosti, int numeroTavolo) {
        this.numeroPosti = numeroPosti;
        this.numeroTavolo = numeroTavolo;
    }


    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public TipoTavolo getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(TipoTavolo numeroPosti) {
        this.numeroPosti = numeroPosti;
    }
}
