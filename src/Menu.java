import java.util.ArrayList;

public class Menu {
    private ArrayList<PrimiPiatti> primi;
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

    public ArrayList<PrimiPiatti> getPrimi() {
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


    //TODO sistemare
    public void printMenu() {
        //TODO nome menù e tipo quindi bisogna fare un enum del tipo(vegano, ecc ecc)
        System.out.println("Numero Tavolo : " + numeroTavolo);

        for (PrimiPiatti p : primi) {
            System.out.println(p.printPrimiPiatti());
        }

        System.out.println();
        for (SecondiPiatti s : secondi) {
            System.out.println(s.printSecondi());
        }
        System.out.println();

        for (Dessert d : dessert) {
            System.out.println(d.printDessert());
        }
        System.out.println();

        for (Bevande b : bevande) {
            System.out.println(b.printBevande());
        }
        System.out.println();
        System.out.println("Numero di comande totali = " + numeroComanda);
    }


}
