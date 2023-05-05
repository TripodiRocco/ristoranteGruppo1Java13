public class Main {

    public static void main(String[] args) {
        //stampare il menù
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



    }
}