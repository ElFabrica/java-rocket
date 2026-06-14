package je_19_arrays;

import java.util.*;

public class Generics {
    public static void main(String[] args) {
        /*
        Set<String> alunos = new LinkedHashSet<>();
        alunos.add("marcos");
        alunos.add("julia");
        alunos.add("felipe");
        alunos.add("lucas");
        alunos.add("rafaela");

        //String aluno = alunos.get(0); //ops, não sou uma lista

        Iterator<String> iterator = alunos.iterator();
        String aluno = iterator.next();
        System.out.println(aluno);

        while (iterator.hasNext()) { // ainda temos mais alunos ??
            aluno = iterator.next();
            if(aluno.equals("rafaela")){
                //como é possível ??
                alunos.add("joana");
            }
            System.out.println(aluno);
        }
        System.out.println(alunos.size());
        System.out.println(alunos);
         */
        ArrayList<String> prateleira = new ArrayList();
        prateleira.add("Jeep");
        prateleira.add("Ford Ka");
        prateleira.add("Corolla");
        prateleira.add("Fiesta");

        Collections.sort(prateleira);

        for(String carrinho: prateleira){
            System.out.println(carrinho);
        }
    }
}
