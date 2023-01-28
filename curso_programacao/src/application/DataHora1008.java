package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DataHora1008 {
    public static void main(String[] args) {


        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        //quando for instant tem que formatar especificando o fuso horario
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z"); //data hora GMT horario de londres

        LocalDate semanaAnterior = d01.minusWeeks(1);
        LocalDate semanaPosterior = d01.plusWeeks(1);
        LocalDate semanaAnteriorDias = d01.minusDays(7);
        LocalDate semanaPosteriorDias = d01.plusDays(7);


        System.out.println(d01);
        System.out.println("Semana anterior(minuWeeks) : " + semanaAnterior);
        System.out.println("Semana Posterior(plusWeeks) : " + semanaPosterior);
        System.out.println("Semana anterior dias(minusDays) : " + semanaAnteriorDias);
        System.out.println("Semana posterior dias(plusDays) : " + semanaPosteriorDias);


        LocalDateTime semanaAnteriorDateTime = d02.minusWeeks(1);
        LocalDateTime semanaPosteriorDateTime = d02.plusWeeks(1);

        System.out.println("Semana anterior(minuWeeks) DateTime : " + semanaAnteriorDateTime);
        System.out.println("Semana Posterior(plusWeeks) DateTime : " + semanaPosteriorDateTime);

        Instant semanaAnteriorInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant semanaPosteriorIntant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("Semana anterior(ChronoDays) Instant : " + semanaAnteriorInstant);
        System.out.println("Semana Posterior(ChronoDays) Instant : " + semanaPosteriorIntant);

        System.out.println("-------------------------------");
        //para usar o duration tem que ser dateTime ou converter para retornar hora:minuto
        Duration t1 = Duration.between(d01.atStartOfDay(),d01.minusWeeks(2).atStartOfDay());
        System.out.println(t1.toDays());
        //atStartOfDay adiciona as horas
        System.out.println(d01.atStartOfDay());


    }
}
