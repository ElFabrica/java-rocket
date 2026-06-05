package je12_POO.classesExcessiais;

public class ClassesExssenciaisPT2 {
    public static void main(String[] args) {
        String nome = "gleyson";
        int idade = 32;
        double peso = 1.58;
        double renda = 3234.56;
        //vamos imprimir os dados acima aplicando uma formatação no console
        //System.out.printf(formato, array de parametros (,,,) );
        System.out.printf("Nome: %s Idade: %d Peso: %.2f Renda: R$ %,.2f", nome,idade,peso,renda);

                //Resultado no console: Nome: gleyson Idade: 32 Peso: 1,58 Renda: R$ 3.2

                //%s -> parametro do tipo String
                //%d -> parametro do tipo Integer / Long
                //%f -> parametro do tipo Double / Float
                //.2 -> quer dizer que serão dois dígitos decimais
                //,.2 -> quer dizer que serão dois dígitos decimais e informando o (.

        }
}