package je12_POO.classesExcessiais;

import java.util.Scanner;

public class ClassesExssenciais {
    public static void main(String[] args) {


    String nome = null;
    Integer idade = null;
    Double peso=null;
    //simulando uma linha existente em um arquivo txt
    String stringLinhaArquivo = "gleyson sampaio;32;1.59";
    Scanner scan = new Scanner(stringLinhaArquivo);
 scan.useDelimiter(";"); //definindo um delimitador
    //conhecendo novos recursos
    int index = 0;
 while (scan.hasNext()){ //olha um conceito de controle de repetição send

        if(index == 0) // Uuufa, sorte que eu aprendi sobre controle de flux
            nome = scan.next();
        else if( index == 1)
            idade = Integer.valueOf(scan.next());
        else
            peso = Double.valueOf(scan.next());

        index ++; //mais um conceito escondido bem aqui !!
    }
 System.out.println ("Seu nome é: " + nome);
 System.out.println ("Sua idade é: " + idade);
 System.out.println ("Sua peso é: " + peso);
    }
}
