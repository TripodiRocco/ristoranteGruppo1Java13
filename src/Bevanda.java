public class Bevanda extends Portata {

    private double capacityInCl;

    public Bevanda(String nome, String descrizione, double prezzo ) {
        super(nome, descrizione, prezzo);
    }

    public double getCapacityInCl() {
        return capacityInCl;
    }

    public void setCapacityInCl(double capacityInCl) {
        this.capacityInCl = capacityInCl;
    }


    public void printBevanda() {
        System.out.println( "Bevanda : " + getNome() + " Descrizione: " + getDescrizione() + " Prezzo: " + getPrezzo());
    }
}

