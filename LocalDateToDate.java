import java.time.*;
import java.util.Date;

public class LocalDateToDate {
    public static void main(String[] args) {
        // Convert java.time.LocalDate to java.util.Date and back to
        // java.time.LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate = " + localDate);

        Date date1 = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println("Date      = " + date1);

        localDate = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("LocalDate = " + localDate);
        System.out.println();

        // Convert java.time.LocalDateTime to java.util.Date and back to
        // java.time.LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime = " + localDateTime);

        Date date2 = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("Date          = " + date2);

        localDateTime = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("LocalDateTime = " + localDateTime);
    }
}