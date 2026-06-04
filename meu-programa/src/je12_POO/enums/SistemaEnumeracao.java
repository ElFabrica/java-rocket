package je12_POO.enums;

public class SistemaEnumeracao {
    public static void main(String[] args) {
        EstadoBrasileiro eb = EstadoBrasileiro.PI;
        System.out.println(eb.getName());
        System.out.println(eb.getSigla());

        String nameString = "SP";
        String eb2 = EstadoBrasileiro.valueOf(nameString).getName();
        System.out.println(eb2);
        System.out.println(eb2);
    }
}
