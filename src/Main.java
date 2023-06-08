import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {



        Portata spaghetti = new PrimoPiatto("Spaghetti", "Pomodoro fresco", 10, true);
        Portata carne = new SecondoPiatto("Filetto", "Pepe verde", 14.5, true);
        Portata acqua = new Bevanda("Acqua", "Naturale", 2.5, 0.5);
        Portata tortino = new Dessert("Tortino", "Cioccolato bianco", 4, true);
        Portata pesce = new SecondoPiatto("Pesce", "Merluzzo" , 12, false);



        Menu menuDiCarne = new Menu("Menu di carne", TipoEnum.CARNE, ColorEnum.ANSI_RED);
        menuDiCarne.addPortata(spaghetti);
        menuDiCarne.addPortata(carne);
        menuDiCarne.addPortata(acqua);
        menuDiCarne.addPortata(tortino);

        Menu menuDiPesce = new Menu("Menu di pesce", TipoEnum.PESCE,ColorEnum.ANSI_RED);
        menuDiPesce.addPortata(spaghetti);
        menuDiPesce.addPortata(acqua);
        menuDiPesce.addPortata(tortino);

        Ristorante develhope = new Ristorante( "DevelHope", "ChefDevelop", 30);
        develhope.addMenu(menuDiCarne);
        develhope.addMenu(menuDiPesce);

        develhope.printInfoRistorante();


        develhope.addPrenotazione(new Cliente("Vincenzo", "Merola", "V.merola", 348),
        new Tavolo((TipoTavolo.TAVOLO_DA_4), 4));

        develhope.addPrenotazione(new Cliente("Giuseppe", "Bronzellino", "G.Bronzellino", 555),
                new Tavolo((TipoTavolo.TAVOLO_DA_4), 3));

        develhope.stampaPrenotazioni();
    }
}