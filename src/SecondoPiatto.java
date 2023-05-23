public class SecondoPiatto extends Portata {
    final TipoPortata secondi = TipoPortata.SECONDI;
    boolean alSangue;

    //nota: aggiungere campi specifici
    public SecondoPiatto(String nome, String descrizione, double prezzo, boolean alSangue){
        super(nome, descrizione, prezzo);
        this.alSangue=alSangue;
    }

    public boolean isAlSangue() {
        return alSangue;
    }

    public void setAlSangue(boolean alSangue) {
        this.alSangue = alSangue;
    }

    public TipoPortata getSecondi() {
        return secondi;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        if (alSangue){
            System.out.println("è al sangue");
        }else {
            System.out.println("non è al sangue");
        }
    }


}
