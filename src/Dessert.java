public class Dessert {
    private String dessertName;
    private double price;

    public Dessert(String dessertName, double price) {
        this.dessertName = dessertName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDessertName() {
        return dessertName;
    }

    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    public void printDessert(Dessert namePrice){
        System.out.println("*****");
        System.out.println(namePrice.getDessertName());
        System.out.println("€ "+namePrice.getPrice());
        /*System.out.println("*****");*/
    }

}
