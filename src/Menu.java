import java.util.ArrayList;

public class Menu {
    private ArrayList<PrimoPiatto> primi;
    private ArrayList<SecondiPiatti> secondi;
    private ArrayList<Dessert> dessert;
    private ArrayList<Bevande> bevande;
    private static int numeroComanda = 0;

    public Menu() {
        this.primi = new ArrayList<>();
        this.secondi = new ArrayList<>();
        this.bevande = new ArrayList<>();
        this.dessert = new ArrayList<>();
        this.numeroComanda++;
    }

    public ArrayList<PrimoPiatto> getPrimi() {
        return primi;
    }

    public ArrayList<SecondiPiatti> getSecondi() {
        return secondi;
    }

    public ArrayList<Dessert> getDessert() {
        return dessert;
    }

    public ArrayList<Bevande> getBevande() {
        return bevande;
    }

    public static int getNumeroComanda() {
        return numeroComanda;
    }

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    //TODO fare metodi add e remove
    PrimoPiatto.



    //TODO sistemare
    public void printMenu() {
        //TODO nome menù e tipo quindi bisogna fare un enum del tipo(vegano, ecc ecc)
        System.out.println("Numero Tavolo : " + numeroTavolo);

        for (PrimoPiatto p : primi) {
            p.printPrimoPiatto();
        }

        System.out.println();
        for (SecondiPiatti s : secondi) {
            s.printSecondi();
        }
        System.out.println();

        for (Dessert d : dessert) {
            d.printDessert();
        }
        System.out.println();

        for (Bevande b : bevande) {
            b.printBevande();
        }
        System.out.println();
        System.out.println("Numero di comande totali = " + numeroComanda);
    }


}
