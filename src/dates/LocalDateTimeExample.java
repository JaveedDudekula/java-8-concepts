package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime : " + localDateTime);

		LocalDateTime localDateTime1 = LocalDateTime.of(LocalDateExample.localDate, LocalTimeExample.localTime);
		System.out.println("localDateTime1 : " + localDateTime1);

		LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("localDateTime2 : " + localDateTime2);

		LocalDateTime localDateTimeCustom = LocalDateTime.of(2022, 9, 25, 23, 33, 10);
		System.out.println("localDateTimeCustom : " + localDateTimeCustom);
		System.out.println();

		// get methods
		System.out.println("hour : " + localDateTime.getHour());
		System.out.println("month : " + localDateTime.getMonth());
		System.out.println("getDayOfYear : " + localDateTime.getDayOfYear());
		System.out.println("getDayOfMonth : " + localDateTime.get(ChronoField.DAY_OF_MONTH));
		System.out.println();

		// modifying local date time
		System.out.println("plusHours : " + localDateTime.plusHours(2));
		System.out.println("minusDays : " + localDateTime.minusDays(5));
		System.out.println("withMonth : " + localDateTime.withMonth(1));
		System.out.println();

		// converting localDate, localTime to localDateTime and vice versa
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		System.out.println("atTime : " + localDate.atTime(localTime));
		System.out.println("atDate : " + localTime.atDate(localDate));
		System.out.println("toLocalTime : " + localDateTime.toLocalTime());
		System.out.println("toLocalDate : " + localDateTime.toLocalDate());
	}
}
