import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ristorante {

    //TODO prenotazione serve un numero capienza massima, poi serve fare una struttura che leghi due oggetti: tavolo e cliente
    //quindi creare le classi tavolo e cliente con i loro attributi(aiuto: i tavoli devono avere un enum o un valore per il numero
    //di posti, il controlla da fare è di evitare l'overbooking
    private String nomeRistorante;
    private String nomeMenu;
    private String nomeChef;


    //TODO sistemare solo oggetti
    private int numeroTavoli;
    private int numeroTavoliDisponibili;
    private List<Menu> menu;

   // private HashMap<Cliente, Tavolo> prenotazione = new HashMap<>();
    private HashMap<String, Prenotazione> listaPrenotazioni = new HashMap<>();

    private HashMap<String, Integer> capienza = new HashMap<>();


    //HashMap<String, HashMap<Cliente, Tavolo> > pre;

    public Ristorante(String nomeRistorante, String nomeChef, int numeroTavoli){
        this.nomeRistorante = nomeRistorante;
        this.menu = new ArrayList<>();
        this.nomeChef = nomeChef;
        this.numeroTavoli = numeroTavoli;
    }

    public String getNomeRistorante() {
        return nomeRistorante;
    }
    public void setNomeRistorante(String nomeRistorante) {
        this.nomeRistorante = nomeRistorante;
    }
    public String getNomeMenu() {
        return nomeMenu;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public String getNomeChef() {
        return nomeChef;
    }

    public void setNomeChef(String nomeChef) {
        this.nomeChef = nomeChef;
    }

    public int getNumeroTavoli() {
        return numeroTavoliDisponibili;
    }

    public int getNumeroTavoliDisponibili(String dataPrenotazione){
        return capienza.get(dataPrenotazione);
    }
    public void setNumeroTavoli(int numeroTavoli) {
        this.numeroTavoli = numeroTavoli;
    }

    public void addMenu(Menu m) {
        menu.add(m);
    }

    public void printInfoRistorante(){
        System.out.println("Ristorante: " + nomeRistorante + "\n" + "Di: " + nomeChef + "\n" + "N.posti: " + numeroTavoli + "\n");

        for(Menu m : menu){
            m.printMenu();
            System.out.println();
        }
    }

    public void addPrenotazione(String data, Prenotazione prenotazione){
        numeroTavoliDisponibili = numeroTavoli;

        capienza.put(data, numeroTavoliDisponibili -= prenotazione.getTipoTavoloPrenotato());

        if((prenotazione.getTipoTavoloPrenotato() > capienza.get(data)) && capienza.get(data) != null){
            //System.out.println("capienza = " + prenotazione.getPrenotazione() + capienza.get(data));

            //!!!!!!!!!!!!!!!!!! VEDERE BENE !!!!!!!!!!!!!!!!!!
            capienza.put(data, capienza.get(data) - capienza.get(data));
            System.out.println("ERRORE NELLA PRENOTAZIONE "+ prenotazione.getPrenotazione() +  " TAVOLI NON DISPONIBILI");
            prenotazione.setFull(true);

        }else{
               this.listaPrenotazioni.put(data, prenotazione);
        }

    }


    public void stampaPrenotazioni(){
        for(String s : listaPrenotazioni.keySet()){

            System.out.println(s + " " + listaPrenotazioni.get(s).getPrenotazione());
        }
    }

    public void cancellaPrenotazioneCliente(String data, Prenotazione prenotazione){
        int x = prenotazione.getPrenotazione().get(prenotazione.getCliente()).getTavolo();
        System.out.println("N TAVOLO = " + x);
        listaPrenotazioni.get(data).cancellaPrenotazione(prenotazione.getCliente());
        capienza.put(data, capienza.get(data) + x);
    }


}
