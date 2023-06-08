public class Main {
    public static void main(String[] args) {



        Portata spaghetti = new PrimoPiatto("Spaghetti", "Pomodoro fresco", 10, true);
        Portata carne = new SecondoPiatto("Filetto", "Pepe verde", 14.5, true);
        Portata acqua = new Bevanda("Acqua", "Naturale", 2.5, 0.5);
        Portata tortino = new Dessert("Tortino", "Cioccolato bianco", 4, true);
        Portata pesce = new SecondoPiatto("Pesce", "Merluzzo" , 12, false);



        Menu menuDiCarne = new Menu("Menu di carne", TipoEnum.CARNE);
        menuDiCarne.addPortata(spaghetti);
        menuDiCarne.addPortata(carne);
        menuDiCarne.addPortata(acqua);
        menuDiCarne.addPortata(tortino);

        Menu menuDiPesce = new Menu("Menu di pesce", TipoEnum.PESCE);
        menuDiPesce.addPortata(spaghetti);
        menuDiPesce.addPortata(acqua);
        menuDiPesce.addPortata(tortino);

        Ristorante develhope = new Ristorante( "DevelHope", "ChefDevelop", 30);
        develhope.addMenu(menuDiCarne);
        develhope.addMenu(menuDiPesce);

        develhope.printInfoRistorante();



    }
}