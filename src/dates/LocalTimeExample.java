package dates;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	static LocalTime localTime = LocalTime.now();
	
	public static void main(String[] args) {

		System.out.println("localTime : " + localTime);

		LocalTime localTime1 = LocalTime.of(23, 40);
		System.out.println("localTime1 : " + localTime1);

		LocalTime localTime2 = LocalTime.of(localTime.getHour(), localTime.getMinute(), localTime.getSecond());
		System.out.println("localTime2 using get() : " + localTime2);

		// 1 Day = 86400 seconds
		System.out.println("toSecondOfDay : " + localTime.toSecondOfDay() + "\n");

		// modify values of localTime
		System.out.println("plusMinutes : " + localTime.plusMinutes(30));
		System.out.println("minusHours : " + localTime.minusHours(2));
		System.out.println("minusHours using ChronoUnit : " + localTime.minus(2, ChronoUnit.HOURS));
		System.out.println("with MIDNIGHT : " + LocalTime.MIDNIGHT);
		System.out.println("with hour : " + localTime.withHour(23));
	}
}
