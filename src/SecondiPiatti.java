public class SecondiPiatti {
    private String description;
    private double price;

    public SecondiPiatti(String description, double price){
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

    public String printSecondi(){
        return "Secondo Piatto : " + description + " ----- price : " + price;
    }
}
