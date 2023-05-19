public class Main {
    public static void main(String[] args) {
/*
        PrimoPiatto spaghetti = new PrimoPiatto("Spaghetti", "Pomodoro fresco", 10);
        SecondoPiatto carne = new SecondoPiatto("Filetto", "Pepe verde", 14.5);
        Bevanda acqua = new Bevanda("Acqua", "Naturale", 2.5);
*/
        Portata spaghetti = new PrimoPiatto("Spaghetti", "Pomodoro fresco", 10);
        Portata carne = new SecondoPiatto("Filetto", "Pepe verde", 14.5);
        Portata acqua = new Bevanda("Acqua", "Naturale", 2.5);
        Portata tortino = new Dessert("Tortino", "Cioccolato bianco", 4);
        Portata pesce = new SecondoPiatto("Pesce", "Merluzzo" , 12);

        Menu menuDiCarne = new Menu(TipoMenu.CARNE);
        menuDiCarne.addPortata(spaghetti);
        menuDiCarne.addPortata(carne);
        menuDiCarne.addPortata(acqua);
        menuDiCarne.addPortata(tortino);

        Menu menuDiPesce = new Menu(TipoMenu.PESCE);
        menuDiPesce.addPortata(spaghetti);
        menuDiPesce.addPortata(acqua);
        menuDiPesce.addPortata(tortino);

        Ristorante develhope = new Ristorante( "DevelHope");
        develhope.addMenu(menuDiCarne);
        develhope.addMenu(menuDiPesce);

        develhope.printMenu();
    }
}