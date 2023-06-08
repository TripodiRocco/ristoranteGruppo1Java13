public enum TipoEnum {

    CARNE ("Menu di carne") ,
    PESCE ("Menu di pesce"),
    VEGANO ("Menu vegano"),
    VEGETARIANO ("Menu vegetariano");

    private String name;

    public String getName() {
        return name;
    }

    TipoEnum(String name) {
        this.name = name;
    }

}