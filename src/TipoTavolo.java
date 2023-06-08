public enum TipoTavolo {
    TAVOLO_DA_2("Tavolo da 2"),
    TAVOLO_DA_4("Tavolo da 4"),
    TAVOLO_DA_6("Tavolo da 6"),
    TAVOLO_DA_8("Tavolo da 8");

    private String name;

    public String getName() {
        return name;
    }

    TipoTavolo(String name) {
        this.name = name;
    }

}
