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
/*

        DAOportata portata = new DAOsecondoPiatto();
        portata.createTable();
        ecc...
        quindi si potrebbe creare una classe DAOportata astratta ed estendere
        DAOsecondoPiatto da DAOportata ??????????

        DAOsecondoPiatto sc = new DAOsecondoPiatto();
        sc.createTable();
        sc.insertSecondoPiatto();
        sc.readSecondiPiatti();
*/

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


        Cliente cliente1 = new Cliente("Vincenzo", "Merola", "V.merola", 348);
        Cliente cliente2 = new Cliente("Giuseppe", "Bronzellino", "G.Bronzellino", 333);


        develhope.addPrenotazione(cliente1,new Tavolo((TipoTavolo.TAVOLO_DA_4), 4));

        develhope.addPrenotazione(cliente2, new Tavolo((TipoTavolo.TAVOLO_DA_4), 3));

        //STAMPO PRENOTAZIONI
        System.out.println("PRENOTAZIONI:  ");
        develhope.stampaPrenotazioni();
        System.out.println();

        //CANCELLO CLIENTE
        System.out.println("CANCELLO PRENOTAZIONE");
        develhope.cancellaPrenotazione(cliente1);
        System.out.println();

        System.out.println("RISTAMPO PRENOTAZIONI");
        develhope.stampaPrenotazioni();

    }
}