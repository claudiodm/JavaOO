package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHora1007 {
    public static void main(String[] args) {


        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        //quando for instant tem que formatar especificando o fuso horario
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z"); //data hora GMT horario de londres

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Brazil/East"));
        LocalDate r3 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));

        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r5 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());


        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println("------------------------------------");
        System.out.println(d02.getDayOfMonth());



//        for (String s : ZoneId.getAvailableZoneIds()
//             ) {
//            System.out.println(s);
//
//        }
    }
}
