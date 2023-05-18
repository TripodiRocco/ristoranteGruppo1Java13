import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PrimoPiatto spaghetti = new PrimoPiatto("Spaghetti al pomodoro", 10);
        PrimoPiatto penne = new PrimoPiatto("Penne al sugo", 8);
        PrimoPiatto paccheri = new PrimoPiatto("Paccheri allo scoglio", 16);

        spaghetti.printPrimoPiatto();
        penne.printPrimoPiatto();
        paccheri.printPrimoPiatto();

        Bevanda bevanda1 = new Bevanda("Acqua minerale", 1.00);
        bevanda1.printBevanda();

    }
}