import java.util.ArrayList;
import java.util.List;

public class Ristorante{

    private String nomeRistorante;
    private String nomeMenu;
    private String nomeChef;
    private int capienza;

    private List<Menu> menu;
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
        System.out.println("Ristorante: " + nomeRistorante + "\n" + "Di: " + nomeChef + "\n" + "N.posti: " +  capienza);
    }

}
