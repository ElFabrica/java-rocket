package je15_java_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeSimple {
    public static void main(String[] args) {

        LocalTime horaAtual = LocalTime.now();
        LocalTime horaAtualMais30Minutos = horaAtual.plusMinutes(30);
        LocalTime horaAtualMenos2Horas = horaAtual.minusHours(2);

        System.out.println(horaAtual);
        System.out.println(horaAtualMais30Minutos);
        System.out.println(horaAtualMenos2Horas);



        boolean passado = horaAtual.isBefore(horaAtualMenos2Horas);

        System.out.println(passado);
    }

}
