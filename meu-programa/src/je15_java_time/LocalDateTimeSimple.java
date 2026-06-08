package je15_java_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeSimple {
    public static void main(String[] args) {
        // 2023-06-25T16:25 -> data e hora sem segundo
        LocalDateTime dataHora = LocalDateTime.of(2023,6,25, 16,25);

// 2023-06-25T16:25:33 -> data e hora com segundo
        dataHora = LocalDateTime.of(2023,6,25, 16,25,33);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String dataHoraFormatada = dataHora.format(formatter);
        System.out.println(dataHoraFormatada); // 22/07/23 17:33:00
    }
}
