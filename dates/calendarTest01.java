package cursoDeJava.exercicios.POO.rascunhos.fds.dates;

import cursoDeJava.exercicios.POO.rascunhos.fds.associacao.dominio.Time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class calendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Hoje é o primeiro dia da semana e tem domingão do faustão!");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // 5
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // 19
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); // 292
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 3

        calendar.roll(calendar.HOUR, 2);

        Date date = calendar.getTime();
        System.out.println(date); // Thu Oct 19 12:39:11 BRT 2023
    }
}
