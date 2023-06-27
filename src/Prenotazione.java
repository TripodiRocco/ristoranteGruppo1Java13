
import java.util.HashMap;

public class Prenotazione {


    private HashMap<Cliente, Tavolo> prenotazione ;


    public Prenotazione(Cliente cliente, Tavolo tavolo){
       this.prenotazione = new HashMap<>();
       prenotazione.put(cliente, tavolo);
    }

    public HashMap<Cliente, Tavolo> getPrenotazione() {
        return prenotazione;
    }

    public void addPrenotazione(Cliente cliente, Tavolo tavolo){
            this.prenotazione.put(cliente, tavolo);
        }

       public void stampaPrenotazione(){
           for  (Cliente c: prenotazione.keySet()) {
                System.out.println(c + " " + prenotazione.get(c));
            }
        }

        public void cancellaPrenotazione(Cliente cliente){
            System.out.println("Cancello il cliente " + cliente.getNome());
            this.prenotazione.remove(cliente);
        }


}
