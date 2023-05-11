import java.util.ArrayList;

public class Comande {
    private ArrayList<PrimiPiatti> primi ;
    private ArrayList<SecondiPiatti> secondi;
    private ArrayList<Dessert> dessert;
    private ArrayList<Bevande> bevande;
    private static int numeroComanda = 0;
    private int numeroTavolo;




    public Comande(){

        this.primi = new ArrayList<>();
        this.secondi = new ArrayList<>();
        this.bevande = new ArrayList<>();
        this.dessert = new ArrayList<>();
        this.numeroComanda ++;
    }

    public Comande(int numeroTavolo,ArrayList<PrimiPiatti> primi, ArrayList<SecondiPiatti> secondi, ArrayList<Dessert> desserts,
                   ArrayList<Bevande> bevande ){
        this.numeroTavolo = numeroTavolo;
        this.primi = new ArrayList<>(primi);
        this.secondi = new ArrayList<>(secondi);
        this.dessert = new ArrayList<>(desserts);
        this.bevande = new ArrayList<>(bevande);
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

    public void setPrimi(ArrayList<PrimiPiatti> primi) {
        this.primi = primi;
    }

    public void setSecondi(ArrayList<SecondiPiatti> secondi) {
        this.secondi = secondi;
    }

    public void setDessert(ArrayList<Dessert> dessert) {
        this.dessert = dessert;
    }

    public void setBevande(ArrayList<Bevande> bevande) {
        this.bevande = bevande;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }



    public void printComande(){
        System.out.println("Numero Tavolo : " + numeroTavolo);

        for(PrimiPiatti p : primi){
            System.out.println(p.printPrimiPiatti());
        }

        System.out.println();
        for(SecondiPiatti s : secondi){
            System.out.println(s.printSecondi());
        }
        System.out.println();

        for(Dessert d : dessert){
            System.out.println(d.printDessert());
        }
        System.out.println();

        for(Bevande b : bevande){
            System.out.println(b.printBevande());
        }
        System.out.println();
        System.out.println("Numero di comande totali = " + numeroComanda);
    }

}
