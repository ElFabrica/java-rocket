package je12_POO.enums;

public enum EstadoBrasileiro {
    PI("Piauí", "PI"),
    MA("Maranhão", "MA"),
    SP("São Paulo", "SP"),
    RJ("Rio de Janeiro", "RJ" );

    private String name;
    private String sigla;
    private EstadoBrasileiro (String name, String sigla){
        this.name = name;
        this.sigla = sigla;
    }

    public String getName() {
        return name;
    }

    public String getSigla () {
        return sigla;
    }
}
