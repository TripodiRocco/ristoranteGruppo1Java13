import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String nomeMenu;
    private final TipoEnum tipo;
    private List<Portata> listaPortate;

    public Menu(TipoEnum tipo){
        this.tipo = tipo;
        this.nomeMenu = nomeMenu;
        this.listaPortate = new ArrayList<>();
    }

    public void addPortata(Portata portata){
        listaPortate.add(portata);
    }

    public String getNomeMenu() {
        return nomeMenu;
    }

    public List<Portata> getListaPortate() {
        return listaPortate;
    }

    public void setNomeMenu(String nomeMenu) {
        this.nomeMenu = nomeMenu;
    }

    public void setListaPortate(List<Portata> listaPortate) {
        this.listaPortate = listaPortate;
    }

    public TipoEnum getTipo() {
        return tipo;
    }


    /**
     *
     */
    /*
    * Nota: stampa formattata come:
    *   PRIMI PIATTI:
    *       primo 1
    *       primo 2
    *   SECONDI PIATTI:
    *       secondo 1
    *       secondo 2
    *
    *                   trovare soluzione....
    * */
    public void printMenu(){
        switch (tipo){
            case PESCE -> System.out.println("Menu di pesce");
            case CARNE -> System.out.println("Menu di carne");
            case VEGANO -> System.out.println("Menu vegano");
            case VEGETARIANO -> System.out.println("Menu vegetariano");
        }
        for (Portata p : listaPortate) {
            if (p instanceof PrimoPiatto) {
                ((PrimoPiatto) p).printPrimoPiatto();
            }
            if (p instanceof SecondoPiatto) {
                ((SecondoPiatto) p).printSecondoPiatto();
            }
            if (p instanceof Bevanda) {
                ((Bevanda) p).printBevanda();
            }
            if(p instanceof Dessert){
                ((Dessert) p).printDessert();
            }
        }
    }



}
