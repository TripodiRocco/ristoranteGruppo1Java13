import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String nomeMenu;

    private TipoEnum tipoMenu;
    private List<Portata> listaPortate;

    private  ColorEnum colorEnum;

    public Menu(String nomeMenu, TipoEnum tipoMenu, ColorEnum colorEnum){
        this.nomeMenu = nomeMenu;
        this.tipoMenu = tipoMenu;
        this.colorEnum = colorEnum;
        this.listaPortate = new ArrayList<>();
    }

    public String getNomeMenu() {
        return nomeMenu;
    }

    public void setNomeMenu(String nomeMenu) {
        this.nomeMenu = nomeMenu;
    }

    public void addPortata(Portata portata){
        listaPortate.add(portata);
    }


    public List<Portata> getListaPortate() {
        return listaPortate;
    }


    public void setListaPortate(List<Portata> listaPortate) {
        this.listaPortate = listaPortate;
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

        System.out.print("TIPO MENU: ");
        /*
            switch (tipoMenu){
                case CARNE -> System.out.println("Menu di carne\n");
                case PESCE -> System.out.println("Menu di pesce\n");
                case VEGANO -> System.out.println("Menu vegano\n");
                case VEGETARIANO -> System.out.println("Menu vegetariano\n");
            }
         */
            System.out.println(tipoMenu.getName());

            System.out.println("PRIMI PIATTI: \n");
            for (Portata p : listaPortate) {
                if (p instanceof PrimoPiatto) {
                    p.printPortata(this.colorEnum);
                }
            }
            System.out.println("\nSECONDI PIATTI: \n");
            for (Portata p: listaPortate) {
                    if (p.getClass() == SecondoPiatto.class){
                        p.printPortata(this.colorEnum);
                    }
            }
            System.out.println("\nDESSERT: \n");
            for (Portata p: listaPortate) {
                    if (p.getClass() == Dessert.class){
                        p.printPortata(this.colorEnum);
                    }
            }
            System.out.println("\nBEVANDE: \n");
            for (Portata p: listaPortate) {
                    if (p.getClass() == Bevanda.class){
                        p.printPortata(this.colorEnum);
                    }
            }
        }
    }





