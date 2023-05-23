
public class PrimoPiatto  extends Portata {
    final TipoPortata primi = TipoPortata.PRIMI;
    private boolean alDente;

    public PrimoPiatto(String nome,String descrizione, double prezzo,boolean alDente){
        super(nome, descrizione, prezzo);
        this.alDente=alDente;
    }

    public boolean getIsAlDente() {
        return alDente;
    }

    public void setAlDente(boolean alDente) {
        this.alDente = alDente;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        if (alDente){
            System.out.println("è al dente");
        }else {
            System.out.println("non si puo mangiare");
        }
    }
}
