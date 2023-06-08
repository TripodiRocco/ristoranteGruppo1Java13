import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ristorante{

    //TODO prenotazione serve un numero capienza massima, poi serve fare una struttura che leghi due oggetti: tavolo e cliente
    //quindi creare le classi tavolo e cliente con i loro attributi(aiuto: i tavoli devono avere un enum o un valore per il numero
    //di posti, il controlla da fare è di evitare l'overbooking
    private String nomeRistorante;
    private String nomeMenu;
    private String nomeChef;

    //TODO sistemare solo oggetti
    private int capienza;

    private List<Menu> menu;

    private HashMap<Cliente, Tavolo> prenotazione = new HashMap<>();

    public Ristorante(String nomeRistorante, String nomeChef, int capienza){
        this.nomeRistorante = nomeRistorante;
        this.menu = new ArrayList<>();
        this.nomeChef = nomeChef;
        this.capienza = capienza;
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

    public int getCapienza() {
        return capienza;
    }

    public void setCapienza(int capienza) {
        this.capienza = capienza;
    }

    public void addMenu(Menu m) {
        menu.add(m);
    }

    public void printInfoRistorante(){
        System.out.println("Ristorante: " + nomeRistorante + "\n" + "Di: " + nomeChef + "\n" + "N.posti: " +  capienza + "\n");

        for(Menu m : menu){
            m.printMenu();
            System.out.println();
        }
    }

        public void addPrenotazione(Cliente cliente, Tavolo tavolo){
            this.prenotazione.put(cliente, tavolo);
        }

       /* public void stampaPrenotazioni(){
            for (Cliente c: prenotazione.keySet()) {
                System.out.println(c + " " + prenotazione.get(c));
            }
        }

        */
}
