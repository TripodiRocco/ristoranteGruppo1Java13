import java.util.ArrayList;
import java.util.List;

public class Ristorante{

    private String nomeRistorante;

    private String nomeMenu;

    private List<Menu> menu;
    public Ristorante(String nomeRistorante){
        this.nomeRistorante = nomeRistorante;
        this.menu = new ArrayList<>();
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

    public void addMenu( Menu m) {
        menu.add(m);
    }



    public void printMenu() {
        System.out.println("Ristorante: \n\t" +  nomeRistorante + "\n\n");
        for (Menu m : menu) {
            m.printMenu();
            System.out.println();
        }
    }
}
