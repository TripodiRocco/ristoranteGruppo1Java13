import java.util.ArrayList;

public class Menu {

    private String description;
    private double price;
    private ArrayList<Bevanda> bevande;
    private ArrayList<PrimoPiatto> primi;
    public Menu(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printMenu() {
        for (Bevanda b : bevande) {
            b.printBevanda();
        }
        for (PrimoPiatto p : primi) {
            p.printPrimoPiatto();
        }
    }
}
