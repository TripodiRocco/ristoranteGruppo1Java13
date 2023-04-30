
public class PrimiPiatti {
      private String description;
      private double price;

      public PrimiPiatti(String description, double price) {
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
      public static void printPrimiPiatti() {
            PrimiPiatti primoPiatto = new PrimiPiatti("Pasta in bianco",5.00);
            System.out.println(primoPiatto.getDescription() + "                      €" + primoPiatto.getPrice());

            primoPiatto.setDescription("Trofie al pesto");
            primoPiatto.setPrice(8.00);
            System.out.println(primoPiatto.getDescription() + "                      €" + primoPiatto.getPrice());

            primoPiatto.setDescription("Lasagne alla bolognese");
            primoPiatto.setPrice(12.00);
            System.out.println(primoPiatto.getDescription() + "               €" + primoPiatto.getPrice());

            primoPiatto.setDescription("Gnocchi alla romana");
            primoPiatto.setPrice(9.00);
            System.out.println(primoPiatto.getDescription() + "                  €" + primoPiatto.getPrice());

            primoPiatto.setDescription("Pappardelle al ragù di cinghiale");
            primoPiatto.setPrice(13.00);
            System.out.println(primoPiatto.getDescription() + "     €" + primoPiatto.getPrice());
      }
}
