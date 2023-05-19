public class Dessert extends Portata{
    public Dessert(String nome, String descrizione, double prezzo){
        super(nome, descrizione, prezzo);
    }


    public void printDessert() {
        System.out.println( "Dessert : " + getNome() + " Descrizione: " + getDescrizione() + " Prezzo: " + getPrezzo());
    }


}

