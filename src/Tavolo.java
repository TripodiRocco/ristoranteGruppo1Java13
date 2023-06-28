public class Tavolo {
    private TipoTavolo tipoTavolo;
    private int numeroTavolo;

    @Override
    public String toString() {
        return tipoTavolo.getName();
    }

    public Tavolo(TipoTavolo tipoTavolo, int numeroTavolo) {
        this.tipoTavolo = tipoTavolo;
        this.numeroTavolo = numeroTavolo;
    }


    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public TipoTavolo getTipoTavolo() {
        return tipoTavolo;
    }

    public int getTavolo(){
        return tipoTavolo.getCapienza();
    }

    public void setTipoTavolo(TipoTavolo tipoTavolo) {
        this.tipoTavolo = tipoTavolo;
    }
}
