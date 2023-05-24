public class Main {
    public static void main(String[] args) {

        Portata dessert1 = new Dessert("Tortino", "tortino ripieno di ciocolato bianco", 4.00,true);
        Portata pasta1 = new PrimoPiatto("Pasta al tonno","la pasta che fai quando non hai voglia di cucinare",2.50,false);
        Portata carne1 = new SecondoPiatto("carne","T-bone", 13,true);
        Portata bevanda1 = new Bevanda("Coca cola","è una coca cola", 2.5,33);



        Menu menu1 = new Menu("Menu Di Prova 1");
        menu1.addPortata(carne1);
        menu1.addPortata(dessert1);
        menu1.addPortata(pasta1);
        menu1.addPortata(bevanda1);


        Ristorante ristorante = new Ristorante("Develhope", "Chef Develhoper", 45);
        ristorante.printInfoRistorante();

        System.out.println("----------------------");


        menu1.printMenu();
    }
}