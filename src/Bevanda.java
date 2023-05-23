public class Bevanda extends Portata {
    final TipoPortata bevande = TipoPortata.BEVANDE;
    private double capacityInCl;

    public Bevanda(String nome, String descrizione, double prezzo,double capacityInCl ) {
        super(nome, descrizione, prezzo);
        this.capacityInCl=capacityInCl;
    }

    public TipoPortata getBevande() {
        return bevande;
    }

    public double getCapacityInCl() {
        return capacityInCl;
    }

    public void setCapacityInCl(double capacityInCl) {
        this.capacityInCl = capacityInCl;
    }


    @Override
    public void printPortata() {
        super.printPortata();
        System.out.println("il contenuto è pari a: "+ capacityInCl+"ml");
    }
}

