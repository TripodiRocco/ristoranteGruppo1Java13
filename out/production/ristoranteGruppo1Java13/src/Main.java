import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        ArrayList<PrimoPiatto> primi  = new ArrayList<>();
        ArrayList<SecondiPiatti> secondi = new ArrayList<>();
        ArrayList<Dessert> dessert = new ArrayList<>();
        ArrayList<Bevande> bevande = new ArrayList<>();


        PrimoPiatto spaghetti = new PrimoPiatto("Spaghetti al pomodoro", 10);
        PrimoPiatto penne = new PrimoPiatto("Penne al sugo", 8);
        PrimoPiatto paccheri = new PrimoPiatto("Paccheri allo scoglio", 16);

        spaghetti.printPrimoPiatto();
        penne.printPrimoPiatto();
        paccheri.printPrimoPiatto();


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



        /**
         *  Comande comanda1 = new Comande(1, null, secondi, dessert, bevande);
         *
         *         comanda1.printComande();
         *
         *         Comande comanda2 = new Comande(6, primi, secondi, dessert, bevande);
         *
         *         comanda2.printComande();
         */





    }
}