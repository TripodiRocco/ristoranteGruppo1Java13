public class Main {

    public static void main(String[] args) {
        //stampare il menù
        String nameOfRestaurant = "Ristorante ManJava";
        System.out.println(nameOfRestaurant);

        PrimiPiatti.printPrimiPiatti();





        Bevande.stampaBevande();
        Dessert tiramisu = new Dessert("Tiramisu'", 4.00);
        Dessert parfait = new Dessert("Parfait di mandorle", 5.00);

        tiramisu.printDessert(tiramisu);
        tiramisu.printDessert(parfait);
    }
}