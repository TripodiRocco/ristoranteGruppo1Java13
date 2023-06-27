import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.sql.Timestamp;

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

        Tavolo tavolo1 = new Tavolo(TipoTavolo.TAVOLO_DA_4, 1);


        Cliente cliente1 = new Cliente("Vincenzo", "Merola", "V.merola", 348);
        Cliente cliente2 = new Cliente("Giuseppe", "Bronzellino", "G.Bronzellino", 333);
        Cliente cliente3 = new Cliente("Rocco", "Tripodi", "R.tripodi", 399);
        Cliente cliente4 = new Cliente("Pietro", "Benedicenti", "P.benedicenti", 345);

        Cliente cliente5 = new Cliente("Vincenzo" ,"Merola", "V.merola", 348);

        //STAMPO PRENOTAZIONI
        System.out.println("PRENOTAZIONI:  ");



        String t1 = "27-06-2023";
        String t2 = "28-06-2023";

        Prenotazione prenotazione = new Prenotazione(cliente1, new Tavolo((TipoTavolo.TAVOLO_DA_4), 3));
        prenotazione.addPrenotazione(cliente2,  new Tavolo((TipoTavolo.TAVOLO_DA_4), 3));


        Prenotazione prenotazione2 = new Prenotazione(cliente3, tavolo1);
        prenotazione2.addPrenotazione(cliente4, tavolo1);
        prenotazione2.addPrenotazione(cliente5, tavolo1);

        develhope.addPrenotazione(t1, prenotazione);
        develhope.addPrenotazione(t2, prenotazione2);


        develhope.stampaPrenotazioni();
        System.out.println();

        develhope.cancellaPrenotazioneCliente(t1, cliente1);

        System.out.println("RISTAMPO LE PRENOTAZIONI DOPO ELIMINAZIONE\n");

        develhope.stampaPrenotazioni();
    }
}