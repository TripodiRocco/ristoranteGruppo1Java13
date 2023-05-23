public class Dessert extends Portata{
    final TipoPortata dessert = TipoPortata.DESSERT;
    private boolean lattosio;

    public Dessert(String nome, String descrizione, double prezzo,boolean lattosio) {
        super(nome, descrizione, prezzo);
        this.lattosio= lattosio;
    }

    public TipoPortata getDessert() {
        return dessert;
    }

    public boolean isLattosio() {
        return lattosio;
    }

    public void setLattosio(boolean lattosio) {
        this.lattosio = lattosio;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        if(lattosio){
            System.out.println("è presente lattosio");}
        else {System.out.println(" senza lattosio");}
    }
}

