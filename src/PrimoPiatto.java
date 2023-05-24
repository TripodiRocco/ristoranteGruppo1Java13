
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

    final String ANSI_CYAN = "\u001B[36m";
    final String ANSI_RESET = "\u001B[0m";

    @Override
    public void printPortata() {
        System.out.println("Menu " + ANSI_CYAN + TipoEnum.PESCE + "\n" + ANSI_RESET);

        super.printPortata();
        if (alDente){
            System.out.println("è al dente");
        }else {
            System.out.println("non si puo mangiare");
        }

    }
}
