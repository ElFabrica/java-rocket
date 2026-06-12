package je_19_arrays;

import java.util.*;

public class Listas {
    public static void main(String[] args) {
        //List linguagens =  new ArrayList();
        //Set linguagens =  new HashSet();
        //Set linguagens =  new LinkedHashSet();
        Set linguagens =  new TreeSet();
        linguagens.add("go");
        linguagens.add("Java");
        linguagens.add("C#");
        linguagens.add("go");
        System.out.println("Comprimento atual: " + linguagens.size());

        for (Object linguagem: linguagens) {
            System.out.println(linguagem);
        }
    }


}
