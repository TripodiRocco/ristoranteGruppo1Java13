public class Main {

    public static void main(String[] args) {

        String nameOfRestaurant = "Ristorante ManJava";
        System.out.println(nameOfRestaurant);

        PrimiPiatti pastaInBianco = new PrimiPiatti("Pasta in bianco", 5.00);
        PrimiPiatti trofieAlPesto = new PrimiPiatti("Trofie al pesto", 7.00);
        PrimiPiatti gnocchiAllaRomana = new PrimiPiatti("Gnocchi alla romana", 9.00);
        PrimiPiatti lasagne = new PrimiPiatti("Lasagne", 10.00);
        PrimiPiatti pappardelleAlRagùDiCinghiale = new PrimiPiatti("Pappardelle Al ragù di cinghiale", 11.00);

        pastaInBianco.printPrimiPiatti();
        trofieAlPesto.printPrimiPiatti();
        gnocchiAllaRomana.printPrimiPiatti();
        lasagne.printPrimiPiatti();
        pappardelleAlRagùDiCinghiale.printPrimiPiatti();


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