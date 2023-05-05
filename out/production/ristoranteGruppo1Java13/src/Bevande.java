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
        //TODO rivedere e parlarne insieme tra di voi
        System.out.println(this.description + "                 " + "€ " + bevande.price);

        bevande.setDescription("Amari");
        bevande.setPrice(8.00);
        System.out.println(bevande.getDescription() + "                          " + "€ " + bevande.getPrice());

        bevande.setDescription("Liquori");
        bevande.setPrice(7.00);
        System.out.println(bevande.getDescription() + "                        " + "€ " + bevande.getPrice());

        bevande.setDescription("Caffè");
        bevande.setPrice(4.00);
        System.out.println(bevande.getDescription() + "                          " + "€ " + bevande.getPrice());

        bevande.setDescription("Thè ed infusi");
        bevande.setPrice(6.00);
        System.out.println(bevande.getDescription() + "                  " + "€ " + bevande.getPrice());

        bevande.setDescription("Coca Cola");
        bevande.setPrice(5.00);
        System.out.println(bevande.getDescription() + "                      " + "€ " + bevande.getPrice());

        bevande.setDescription("Fanta");
        bevande.setPrice(5.00);
        System.out.println(bevande.getDescription() + "                          " + "€ " + bevande.getPrice());

        bevande.setDescription("Sprite");
        bevande.setPrice(5.00);
        System.out.println(bevande.getDescription() + "                         " + "€ " + bevande.getPrice());
    }
}
