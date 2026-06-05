package je12_POO.bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class BigDecimalTestes {
    public static void main(String[] args) {
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal dez = BigDecimal.TEN;

        BigDecimal decimal = BigDecimal.valueOf(1234.5678);
        BigDecimal numeroString = new BigDecimal("1234.5678");

        BigDecimal divisor = BigDecimal.valueOf(3);
        BigDecimal result = BigDecimal.TEN.divide(divisor,2, RoundingMode.HALF_EVEN);
        System.out.println(result);

    }
}
