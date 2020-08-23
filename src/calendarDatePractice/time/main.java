package calendarDatePractice.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class main {

    public static void main(String[] args) {
        int worldRecord = 10;
        LocalTime raceStartTime = LocalTime.of(8, 10, 55);
        LocalTime raceEndTime = LocalTime.of(8, 11, 11);
        if (raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime))
            System.out.println("New world record");
        else
            System.out.println("Try harder");
        System.out.println("_______________");
        LocalDateTime prizeCeremony = LocalDateTime.parse("2050-06-05T14:00:00");
        LocalDateTime dateTimeNow = LocalDateTime.now();
        if (prizeCeremony.getMonthValue() == 6)
            System.out.println("Can't invite president");
        else
            System.out.println("President invited");
        LocalDateTime chiefGuestDeparture =
                LocalDateTime.parse("2050-06-05T14:30:00");
        if (prizeCeremony.plusHours(2).isAfter(chiefGuestDeparture))
            System.out.println("Chief Guest will leave before ceremony completes");
        LocalDateTime eventMgrArrival = LocalDateTime.of(2050, 6, 5, 14, 30, 0);
        if (eventMgrArrival.isAfter(prizeCeremony.minusHours(3)))
            System.out.println("Manager is supposed to arrive 3 hrs earlier");

        Period period5 = Period.ofDays(35);
        System.out.println(period5);

        Period p5Yrs7 = Period.parse("P5y1m2d");
        Period p5Yrs8 = Period.parse("p9m");
        Period p5Yrs9 = Period.parse("P60d");
        Period p5Yrs10 = Period.parse("-P5W");
        System.out.println("_______________");
        System.out.println(p5Yrs7);
        System.out.println(p5Yrs8);
        System.out.println(p5Yrs9);
        System.out.println(p5Yrs10);

        System.out.println("_______________");
        LocalDate date = LocalDate.of(2057,8,11);
        LocalTime time = LocalTime.of(14,30,15);
        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("y");
        DateTimeFormatter d2 = DateTimeFormatter.ofPattern("YYYY");
        DateTimeFormatter d3 = DateTimeFormatter.ofPattern("Y M D");
        DateTimeFormatter d4 = DateTimeFormatter.ofPattern("e");
        DateTimeFormatter t1 = DateTimeFormatter.ofPattern("H h m s");
        DateTimeFormatter t2 = DateTimeFormatter.ofPattern("'Time now:'HH mm a");
        System.out.println(d1.format(date));
        System.out.println(d2.format(date));
        System.out.println(d3.format(date));
        System.out.println(d4.format(date));
        System.out.println(t1.format(time));
        System.out.println(t2.format(time));

        DateTimeFormatter d6 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date6 = LocalDate.parse("2057-01-29", d6 );

        DateTimeFormatter d5 = DateTimeFormatter.ofPattern("dd-yyyy-MM");
        LocalDate date5 = LocalDate.parse("29-2057-01", d5);
    }

}
