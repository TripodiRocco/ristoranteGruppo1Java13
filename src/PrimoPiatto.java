
public class PrimoPiatto  extends Menu{
    boolean alDente;

    public PrimoPiatto(String description, double price) {
        super(description, price);
    }

    public boolean getIsAlDente() {
        return alDente;
    }

    public void setAlDente(boolean alDente) {
        this.alDente = alDente;
    }

    public void printPrimoPiatto() {
        System.out.println("Primo Piatto : " + getDescription()+" ----- Price : " + getPrice());
    }
}
