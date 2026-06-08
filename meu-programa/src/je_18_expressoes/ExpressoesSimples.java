package je_18_expressoes;

import java.time.LocalDate;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String nome = "Gleyson";
        Integer matricula = 123;
        Double salario = 2245.83;
        LocalDate data = LocalDate.now();


        String dadosFuncionario = String.format("mat.: %d - nome %s - Sal.: %,.2f nasciment: %td/%<tm/%<ty", matricula, nome, salario, data);

        System.out.println(dadosFuncionario);
    }
}
