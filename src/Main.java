public class Main {

    public static void main(String[] args) {

        String nameOfRestaurant = "Ristorante ManJava";
        System.out.println(nameOfRestaurant);

        System.out.println();


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



        Dessert tiramisu = new Dessert("Tiramisu'", 4.00);
        Dessert parfait = new Dessert("Parfait di mandorle", 5.00);
        Dessert tortino = new Dessert("Tortino morbido al cioccolato fondente", 3.20);
        Dessert sorbetto = new Dessert("Sorbetto al limone", 2.00);

        tiramisu.printDessert(tiramisu);
        tiramisu.printDessert(parfait);
        tiramisu.printDessert(tortino);
        tiramisu.printDessert(sorbetto);


        Bevande bevanda1 = new Bevande("Acqua minerale", 1.00);
        Bevande bevanda2 = new Bevande("Amari", 4.00);
        Bevande bevanda3 = new Bevande("Liquori", 5.00);
        Bevande bevanda4 = new Bevande("Caffè", 1.50);
        Bevande bevanda5 = new Bevande("Thè ed infusi", 2.00);
        Bevande bevanda6 = new Bevande("Coca cola", 3.00);
        Bevande bevanda7 = new Bevande("Fanta", 3.00);
        Bevande bevanda8 = new Bevande("Sprite", 3.00);

        bevanda1.stampaBevande();
        bevanda2.stampaBevande();
        bevanda3.stampaBevande();
        bevanda4.stampaBevande();
        bevanda5.stampaBevande();
        bevanda6.stampaBevande();
        bevanda7.stampaBevande();
        bevanda8.stampaBevande();
    }
}