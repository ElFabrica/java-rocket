package je12_POO.comparacao;

public class ComparacaoApp {
    public static void main(String[] args) {
        Integer i1 = 128;
        Integer i2 = Integer.parseInt("128");

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}
