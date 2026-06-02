package je11_controle_fluxo_excessao;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;

public class DecimalValues {
    public static void main(String[] args) {
try{
    DecimalFormat df = new DecimalFormat();
    DecimalFormatSymbols symbols = new DecimalFormatSymbols();
    symbols.setDecimalSeparator(',');
    symbols.setGroupingSeparator('.');
    df.setDecimalFormatSymbols(symbols);
    Number num = df.parse("2.312,52");

    System.out.println(num.doubleValue());

}catch (ParseException e){
    System.err.println("Numero inválido");


}
    }
}
