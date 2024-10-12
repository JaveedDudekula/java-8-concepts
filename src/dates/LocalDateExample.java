package dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

	static LocalDate localDate = LocalDate.now();
	
	public static void main(String[] args) {

		System.out.println("LocalDate : " + localDate);

		LocalDate localDate1 = LocalDate.of(2022, 9, 06);
		System.out.println("LocalDate.of : " + localDate1);

		LocalDate localDate2 = LocalDate.ofYearDay(2022, 364);
		System.out.println("LocalDate.ofYearDay : " + localDate2);
		System.out.println();

		// exploring some get methods
		System.out.println("Day of year : " + localDate.getDayOfYear());
		System.out.println("Month : " + localDate.getMonth());
		System.out.println("Day of week : " + localDate.getDayOfWeek());
		System.out.println("ERA : " + localDate.getEra());
		System.out.println("Chronology : " + localDate.getChronology());
		System.out.println();

		// modifying local date
		System.out.println("plusDays : " + localDate.plusDays(5));
		System.out.println("plusMonths : " + localDate.plusMonths(6));
		System.out.println("minusDays : " + localDate.minusDays(5));
		System.out.println("withYear : " + localDate.withYear(2025));
		System.out.println("with ChronoField : " + localDate.with(ChronoField.YEAR, 2026));
		System.out.println(
				"with TemporalAdjusters : " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()).getDayOfWeek());
		System.out.println("minusYears : " + localDate.minusYears(5));
		System.out.println("minusYearsUsingChronoUnit : " + localDate.minus(6, ChronoUnit.YEARS));
		System.out.println("isLeapYear : " + LocalDate.ofYearDay(2020, 10).isLeapYear());
		System.out.println("isBefore : " + localDate1.isBefore(localDate));
		System.out.println("isAfter : " + localDate.isAfter(localDate1));
		System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.MINUTES));
		System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.YEARS));
	}
}
