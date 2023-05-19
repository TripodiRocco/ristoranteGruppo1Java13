
public class PrimoPiatto  extends Portata {
    boolean alDente;

    public PrimoPiatto(String nome,String descrizione, double prezzo) {
        super(nome, descrizione, prezzo);
    }

    public boolean getIsAlDente() {
        return alDente;
    }

    public void setAlDente(boolean alDente) {
        this.alDente = alDente;
    }


    public void printPrimoPiatto() {
        super.printPortata();
        System.out.println(alDente);
    }
}
