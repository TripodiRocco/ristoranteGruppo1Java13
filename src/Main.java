import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        ArrayList<PrimiPiatti> primi  = new ArrayList<>();
        ArrayList<SecondiPiatti> secondi = new ArrayList<>();
        ArrayList<Dessert> dessert = new ArrayList<>();
        ArrayList<Bevande> bevande = new ArrayList<>();


        PrimiPiatti spaghetti = new PrimiPiatti("Spaghetti al pomodoro", 10);
        PrimiPiatti penne = new PrimiPiatti("Penne al sugo", 8);
        PrimiPiatti paccheri = new PrimiPiatti("Paccheri allo scoglio", 16);

        primi.add(penne);
        primi.add(spaghetti);
        primi.add(paccheri);


        SecondiPiatti carne = new SecondiPiatti("Carne arrosto", 14);
        SecondiPiatti pesce = new SecondiPiatti(("Pesce alla griglia"), 19);

        secondi.add(pesce);
        secondi.add(carne);


        Dessert tortino = new Dessert("Tortino al cioccolato", 6);
        Dessert torta = new Dessert("Torta alle mele", 4);

        dessert.add(torta);
        dessert.add(tortino);

        Bevande acqua = new Bevande("Acqua naturale", 2);
        Bevande cocaCola = new Bevande(("Coca cola"),4);

        bevande.add(acqua);
        bevande.add(cocaCola);


        /**
         *  Comande comanda1 = new Comande(1, null, secondi, dessert, bevande);
         *
         *         comanda1.printComande();
         *
         *         Comande comanda2 = new Comande(6, primi, secondi, dessert, bevande);
         *
         *         comanda2.printComande();
         */



        //SECONDO METODO CON INSERIMENTO DA SETTER (in questo modo si evita di avere valori null nel caso non si inserisca una portata)

        // Menu menu3 = new Menu(0, null, null, dessert, bevande);

        System.out.println("\nSECONDA STAMPA \n");
        Comande comanda3 = new Comande();


    }
}