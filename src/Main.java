public class Main {

    public static void main(String[] args) {
        //stampare il menù
        String nameOfRestaurant = "Ristorante ManJava";
        System.out.println(nameOfRestaurant);

        System.out.println();

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
