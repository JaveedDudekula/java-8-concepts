package dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationCompareTimes {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.of(7, 30);
		LocalTime localTime1 = LocalTime.of(8, 40);

		System.out.println("Difference between times using localTime.until() : "
				+ localTime.until(localTime1, ChronoUnit.MINUTES));

		Duration duration = Duration.between(localTime, localTime1);
		System.out.println("Difference between times using duration.between() : " + duration.toMinutes());

		Duration duration1 = Duration.ofHours(3);
		System.out.println("toMinutes : " + duration1.toMinutes());
	}
}
