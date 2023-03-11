import java.time.*;


public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        System.out.println(now.minusDays(5));


        LocalDate dates = LocalDate.now();
        System.out.println(dates);
        System.out.println(dates.getDayOfYear());
        System.out.println(dates.getDayOfMonth());
        System.out.println(dates.getDayOfWeek());
        System.out.println(dates.minusDays(5));


        LocalTime times = LocalTime.now();
        System.out.println(times);
        System.out.println(times.getHour());
        System.out.println(times.getMinute());
        System.out.println(times.getSecond());
        System.out.println(times.getNano());
        System.out.println(times.minusHours(5));


        //creating dates
        LocalDateTime.of(2020, 12, 12, 12, 12, 12);
        LocalDate.of(2020, 12, 12);
        LocalTime.of(12, 12, 12, 12);

        //zones
        ZonedDateTime zoned = ZonedDateTime.now();
        System.out.println(zoned);

        for (String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }

        LocalDateTime nowInSydney = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println(nowInSydney);


        System.out.println(ZonedDateTime.now());
        System.out.println(LocalDateTime.now());
        // instant is a point in time on the timeline of the universe (or at least the computer)
        System.out.println(Instant.now());
    }
}