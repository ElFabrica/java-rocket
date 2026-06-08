package je15_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateSimple {
    public static void main(String[] args) {
/*
    String stringDataBr = "17-01-2023";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate dataConcreta = LocalDate.parse(stringDataBr,formatter);
        System.out.println(dataConcreta);

 */
/*

        LocalDate data1 = LocalDate.of(2023,3,4);
        LocalDate data2 = LocalDate.of(2024,4,3);

//data2 está após a data 1? true
        System.out.println(data2.isAfter(data1));

//data2 está antes que data 1? flase
        System.out.println(data2.isBefore(data1));

//data2 é igual a data 1? false
        System.out.println(data2.isEqual(data1));

 */
        /*
        LocalDate data = LocalDate.of(2023,1,13);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(data); // 2023-01-13

// formatando a data criada acima
        System.out.println(formatter.format(data)); // 13/01/2023

         */
/*
        LocalDate data = LocalDate.of(2023,1,13);

        String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));  // 13 de janeiro de 2023
        System.out.println(dataFormatada);
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));  // 13 de jan. de 2023
        System.out.println(dataFormatada);
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));  // 13/01/2023
        System.out.println(dataFormatada);
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));  // sexta-feira, 13 de janeiro de 2023
        System.out.println(dataFormatada);

 */

        LocalDate data = LocalDate.of(2021,8,23);

        Locale[] locales = {Locale.CANADA, Locale.US, new Locale("fi","FI"),Locale.UK};

        for(Locale locale:locales){
            String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale));
            System.out.println(dataFormatada);
        }

// 2021-08-23
// 8/23/21
// 23.8.2021
// 23/08/2021
    }

}
