public abstract class Portata {
    protected String nome;
    protected String descrizione;
    protected double prezzo;
    static int id_portata= 0;

    public Portata(String nome, String descrizione, double prezzo){
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        id_portata++;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    //nota : implementare meglio


    public void printPortata(){
        System.out.println("Nome del piatto: "+nome +"\n" + "Descrizione del piatto: "+descrizione + "\n" + "Prezzo: " + prezzo+"€");
    }

    //TODO sistemare
    public void printPortata(ColorEnum colorEnum){
        System.out.println(colorEnum + "Nome del piatto: "+nome +"\n" + "Descrizione del piatto: "+descrizione + "\n" + "Prezzo: " + prezzo+"€");
    }

}
