public class SecondoPiatto extends Portata {

    static int id_secondoPiatto;
    final TipoPortata secondi = TipoPortata.SECONDI;
    boolean alSangue;


    public SecondoPiatto(String nome, String descrizione, double prezzo, boolean alSangue){
        super(nome, descrizione, prezzo);
        this.alSangue=alSangue;
        id_secondoPiatto++;
    }

    public int getId_secondoPiatto(){
        return id_secondoPiatto;
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
