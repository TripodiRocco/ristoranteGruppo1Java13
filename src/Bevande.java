public class Bevande {
    private String description;
    private double price;

    public Bevande(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

     public void stampaBevande(){
         System.out.println(this.description + "   € " + this.price);
    }
}
