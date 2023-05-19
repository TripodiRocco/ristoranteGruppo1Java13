public class SecondoPiatto extends Portata {

    //nota: aggiungere campi specifici
    public SecondoPiatto(String nome, String descrizione, double prezzo){
        super(nome, descrizione, prezzo);
    }


    public void printSecondoPiatto() {
        System.out.println( "Secondo Piatto : " + getNome() + " Descrizione: " + getDescrizione() + " Prezzo: " + getPrezzo());
    }


}
