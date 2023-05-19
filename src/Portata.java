public abstract class Portata {
    protected String nome;
    protected String descrizione;
    protected double prezzo;

    public Portata(String nome, String descrizione, double prezzo){
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
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

    /*
    public void printPortata(){
        System.out.println(nome +" " + descrizione + " " + prezzo);
    }
     */
}
