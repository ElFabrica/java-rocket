package je12_POO;

public class Sistema {
    public static void main(String[] args) {
        Cliente gleyson = new Cliente("gleyson");
        System.out.println(gleyson.creditLimit);
        gleyson.solicitarCreditLimit(200.0);
        System.out.println(gleyson.creditLimit);
        gleyson.comprar(20.0);
        System.out.println(gleyson.creditLimit);
    }
}
