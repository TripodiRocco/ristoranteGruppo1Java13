public class Main {

    public static void main(String[] args) {
        //stampare il menù
        String nameOfRestaurant = "Ristorante ManJava";
        System.out.println(nameOfRestaurant);

        System.out.println();


        Bevanda bevanda1 = new Bevanda("Acqua minerale", 1.00);
        bevanda1.printBevanda();

    }
}
