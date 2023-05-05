
public class PrimiPiatti {
      private String firstDishes;
      private double price;

      public PrimiPiatti(String description, double price) {
            this.firstDishes = description;
            this.price = price;
      }
      public String getDescription() {
            return firstDishes;
      }
      public void setDescription(String description) {
            this.firstDishes = description;
      }
      public double getPrice() {
            return price;
      }
      public void setPrice(double price) {
            this.price = price;
      }
      public void printPrimiPiatti() {
            System.out.println(this.firstDishes + "   € " + this.price);  // <-- ho messo tre tabs prima del simbolo '€' e una sola dopo
      }
}
