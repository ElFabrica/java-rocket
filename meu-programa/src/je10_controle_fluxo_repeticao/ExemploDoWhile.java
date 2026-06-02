package je10_controle_fluxo_repeticao;

import java.util.Random;

public class ExemploDoWhile {
    private  static  int numerotentativas = 0;
  public static void main(String[] args) {
        System.out.println("Discando");
        do{
            System.out.println("telefone tocando - trim trim");
        }while (tocando());

        System.out.println("Alố !!!");
    }
    private static boolean tocando(){
        numerotentativas++;
        boolean atendeu = new Random().nextInt(5) == 1;
        if(numerotentativas == 5){
            return false;
        }else{
        return !atendeu && numerotentativas <= 5;
        }

    }
}
