public class Bevanda extends Menu {

    private double capacityInCl;

    public Bevanda(String description, double price) {
        super(description, price);
    }

    public double getCapacityInCl() {
        return capacityInCl;
    }

    public void setCapacityInCl(double capacityInCl) {
        this.capacityInCl = capacityInCl;
    }

    public void printBevanda(){
        System.out.println("Bevanda : " + getDescription() + "_____price : " + getPrice());
    }
}
