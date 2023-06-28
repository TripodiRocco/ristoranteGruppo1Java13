public enum TipoTavolo {
    TAVOLO_DA_2("Tavolo da 2",1),
    TAVOLO_DA_4("Tavolo da 4", 1),
    TAVOLO_DA_6("Tavolo da 6", 2),
    TAVOLO_DA_8("Tavolo da 8", 3),
    TAVOLO_DA_30("Tavolo da 30", 30);

    private String name;

    private int capienza;
    public String getName() {
        return name;
    }

    public int getCapienza(){
        return capienza;
    }
    TipoTavolo(String name, int capienza) {
        this.name = name;
        this.capienza =  capienza;
    }

}
