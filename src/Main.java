import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) throws SQLException {

        Portata spaghetti = new PrimoPiatto("Spaghetti", "Pomodoro fresco", 10, true);
        Portata spaghetto = new PrimoPiatto("spaghettone","allo scoglio", 12,true);
        Portata carne = new SecondoPiatto("Filetto", "Pepe verde", 14.5, true);
        Portata acqua = new Bevanda("Acqua", "Naturale", 2.5, 0.5);
        Portata tortino = new Dessert("Tortino", "Cioccolato bianco", 4, true);
        Portata pesce = new SecondoPiatto("Pesce", "Merluzzo" , 12, false);


  /*      DAOportata portata = new DAOsecondoPiatto();
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

        Tavolo tavolo1 = new Tavolo(TipoTavolo.TAVOLO_DA_8, 1);
        Tavolo tavolo2 = new Tavolo(TipoTavolo.TAVOLO_DA_2, 1);
        Tavolo tavolo3 = new Tavolo(TipoTavolo.TAVOLO_DA_6, 1);
        Tavolo tavolo4 = new Tavolo(TipoTavolo.TAVOLO_DA_4, 1);
        Tavolo tavolo5 = new Tavolo(TipoTavolo.TAVOLO_DA_30,1);

        Cliente cliente1 = new Cliente("Vincenzo", "Merola", "V.merola", 348);
        Cliente cliente2 = new Cliente("Giuseppe", "Bronzellino", "G.Bronzellino", 333);
        Cliente cliente3 = new Cliente("Rocco", "Tripodi", "R.tripodi", 399);
        Cliente cliente4 = new Cliente("Pietro", "Benedicenti", "P.benedicenti", 345);
        Cliente cliente5 = new Cliente("Vincenzo" ,"Merola", "V.merola", 348);

        //STAMPO PRENOTAZIONI
        System.out.println("PRENOTAZIONI:  ");

        String t1 = "27-06-2023";
        String t2 = "28-06-2023";
        String t3 = "29-06-2023";
        String t4 = "30-06-2023";
        String t5 = "31-06-2023";


        Prenotazione prenotazione1 = new Prenotazione();
        prenotazione1.addPrenotazione(cliente2, tavolo1);
        prenotazione1.addPrenotazione(cliente4, tavolo2);
        prenotazione1.addPrenotazione(cliente5, tavolo3);

        Prenotazione prenotazione2 = new Prenotazione();
        prenotazione2.addPrenotazione(cliente4, tavolo1);


        Prenotazione prenotazione3 = new Prenotazione();
        prenotazione3.addPrenotazione(cliente3,tavolo1);
        prenotazione3.addPrenotazione(cliente1, tavolo1);

        Prenotazione prenotazione4 = new Prenotazione();
        prenotazione4.addPrenotazione(cliente1, tavolo4);

        Prenotazione prenotazioneFull = new Prenotazione();
        prenotazioneFull.addPrenotazione(cliente1, tavolo5);
        prenotazioneFull.addPrenotazione(cliente1,tavolo4);
        prenotazioneFull.addPrenotazione(cliente3,tavolo4);


        develhope.addPrenotazione(t1, prenotazione1);
        develhope.addPrenotazione(t2, prenotazione2);
        develhope.addPrenotazione(t3,prenotazione3);
        develhope.addPrenotazione(t4, prenotazione4);
        develhope.addPrenotazione(t5, prenotazioneFull);

        develhope.stampaPrenotazioni();

        System.out.println();
        System.out.println("TAVOLI DISPONIBILI AL "+ t1 + " " + develhope.getNumeroTavoliDisponibili(t1));
        System.out.println("TAVOLI DISPONIBILI AL " + t2 + " " + develhope.getNumeroTavoliDisponibili(t2));
        System.out.println("TAVOLI DISPONIBILI AL "+ t3 + " " + develhope.getNumeroTavoliDisponibili(t3));
        System.out.println("TAVOLI DISPONIBILI AL "+ t4 + " " + develhope.getNumeroTavoliDisponibili(t4));
        System.out.println("TAVOLI DISPONIBILI AL "+ t5 + " " + develhope.getNumeroTavoliDisponibili(t5));
        System.out.println();


        develhope.cancellaPrenotazioneCliente(t1, prenotazione1);
        System.out.println("RISTAMPO LE PRENOTAZIONI DOPO ELIMINAZIONE\n");

        develhope.stampaPrenotazioni();
        System.out.println();
        System.out.println("TAVOLI DISPONIBILI AL "+ t1 + " " + develhope.getNumeroTavoliDisponibili(t1));
        System.out.println("TAVOLI DISPONIBILI AL " + t2 + " " + develhope.getNumeroTavoliDisponibili(t2));
        System.out.println("TAVOLI DISPONIBILI AL "+ t3 + " " + develhope.getNumeroTavoliDisponibili(t3));
        System.out.println("TAVOLI DISPONIBILI AL "+ t4 + " " + develhope.getNumeroTavoliDisponibili(t4));
        System.out.println("TAVOLI DISPONIBILI AL "+ t5 + " " + develhope.getNumeroTavoliDisponibili(t5));
        System.out.println();

        DAOprimoPiatto primo = new DAOprimoPiatto();
        //primo.createTable();
        //primo.insertPrimoPiatto((PrimoPiatto)spaghetto );
        //primo.readPrimiPiatti();
        //primo.updateTable((PrimoPiatto)spaghetti ,((PrimoPiatto) spaghetti).getId_primopiatto());
        //primo.deletePrimoPiatto(spaghetti.getNome());


    }
}