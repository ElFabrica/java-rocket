package je11_controle_fluxo_excessao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite seu nome: ");
    String name = scanner.next();
    System.out.println("Digite seu sobrenome: ");
    String lastmame = scanner.next();
    System.out.println("Digite seu idade: ");
    int age = 0;

    try {
         age = scanner.nextInt();
    }catch (InputMismatchException e){
        System.out.println("A idade deve ser um número!");
    }
    double height = 0.0;

    try{
        System.out.println("Digite seu altura: ");
        height = scanner.nextDouble();
    }catch (InputMismatchException e){
System.err.println("A altura deve ser digitada no padrão americano 0.00");
    }

    System.out.println("Olá, me chamo "+ name.toUpperCase() + " " + lastmame.toUpperCase() );
    System.out.println("Tenho " + age +" anos");
    System.out.println("Possuo " + height + " de altura");
    scanner.close();

    }
}
