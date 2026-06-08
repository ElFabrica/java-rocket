package je15_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaTimeTransform
{
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2023, 1, 24);

        LocalDateTime dataHora = data.atTime(16,31,27); //2023-01-24T16:31:27

        dataHora = data.atTime(LocalTime.of(16,31,27)); //2023-01-24T16:31:27
        System.out.println(dataHora);

        dataHora = data.atTime(LocalTime.of(16,31)); //2023-01-24T16:31
        System.out.println(dataHora);
        dataHora = data.atStartOfDay(); //2023-01-24T00:00
        System.out.println(dataHora);
    }
}
