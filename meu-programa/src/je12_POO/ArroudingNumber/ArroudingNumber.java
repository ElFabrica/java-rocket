package je12_POO.ArroudingNumber;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ArroudingNumber {
    public static void main(String[] args) {
        BigDecimal precolitro = BigDecimal.valueOf(5.799);
        BigDecimal litrosUtilizados = BigDecimal.valueOf(21.752);
        BigDecimal valorPagar = litrosUtilizados.multiply(precolitro);
        System.out.println(valorPagar); //126.139848

        //arredondando...
        BigDecimal valorPagarArredondado = valorPagar.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(valorPagarArredondado); //126.14
    }
}
