package je12_POO;

public class Cliente {
    String name;
    Double creditLimit=10.0;

    public void solicitarCreditLimit(Double solicitedValue){
        creditLimit = solicitedValue;
    }
    public void comprar(Double priceProduct){
        creditLimit = creditLimit - priceProduct;
    }
    public Cliente(String name){
        this.name = name;
    }
}
