package je01_sintexe_semantica;

public class Conta {
    double saldo = 10.0;

    public void sacar(Double valor){
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        System.out.println(saldo);
    }
}
