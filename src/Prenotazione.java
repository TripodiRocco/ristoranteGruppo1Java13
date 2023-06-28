
import java.util.HashMap;

public class Prenotazione {

    private int tipoTavoloPrenotato;

    public void setFull(boolean full) {
        isFull = full;
    }

    private boolean isFull = false;
    private HashMap<Cliente, Tavolo> prenotazione ;

    public Prenotazione(){
        this.prenotazione = new HashMap<>();
    }
    public Prenotazione(Cliente cliente, Tavolo tavolo){

       this.prenotazione = new HashMap<>();
       if(!isFull) {
           prenotazione.put(cliente, tavolo);
           this.tipoTavoloPrenotato += tavolo.getTavolo();
       }else{
           System.out.println("\nNESSUN TAVOLO DISPONIBILE\n");
       }

    }


    public HashMap<Cliente, Tavolo> getPrenotazione() {
        return prenotazione;
    }

    public int getTipoTavoloPrenotato() {
        return this.tipoTavoloPrenotato;
    }


    public void addPrenotazione(Cliente cliente, Tavolo tavolo){
        if(!isFull) {
            this.prenotazione.put(cliente, tavolo);
            this.tipoTavoloPrenotato += tavolo.getTavolo();
        }
    }


       public void stampaPrenotazione(){
           for  (Cliente c: prenotazione.keySet()) {
                System.out.println(c + " " + prenotazione.get(c));
            }
        }

        public void cancellaPrenotazione(Cliente cliente){
            System.out.println("Cancello il cliente " + cliente.getNome());
            this.prenotazione.remove(cliente);
            isFull = false;
        }


}
