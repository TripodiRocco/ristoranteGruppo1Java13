public class Main {

    public static void main(String[] args) {
        //stampare il menù
        String nameOfRestaurant = "Ristorante ManJava";
        System.out.println(nameOfRestaurant);


        //TODO eliminare tutte le chiamate statiche
        PrimiPiatti primiPiatti = new PrimiPiatti("Pasta", 10);
        PrimiPiatti primiPiatti2 = new PrimiPiatti("Pasta", 10);
        primiPiatti.printPrimiPiatti();

        System.out.println();

        Bevande.stampaBevande();






        Bevande bevande = new Bevande("acqua",23);
        bevande.stampaBevande();
        Dessert tiramisu = new Dessert("Tiramisu'", 4.00);
        Dessert parfait = new Dessert("Parfait di mandorle", 5.00);
        Dessert tortino = new Dessert("Tortino morbido al cioccolato fondente", 3.20);
        Dessert sorbetto = new Dessert("Sorbetto al limone", 2.00);

        tiramisu.printDessert(tiramisu);
        tiramisu.printDessert(parfait);
        tiramisu.printDessert(tortino);
        tiramisu.printDessert(sorbetto);
    }
}