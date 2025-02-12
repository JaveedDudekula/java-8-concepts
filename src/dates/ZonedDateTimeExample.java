package dates;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("zonedDateTime : " + zonedDateTime);

		System.out.println("getOffset : " + zonedDateTime.getOffset());

		System.out.println("getZone id : " + zonedDateTime.getZone());

		// System.out.println("\nAvailable zones : ");
		// ZoneId.getAvailableZoneIds().stream().forEach(z -> System.out.println(z));

		System.out.println("Number of zones : " + ZoneId.getAvailableZoneIds().size());

		// CST,EST,MST,PST
		System.out.println("Chicago CST : " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
		System.out.println("Detroit EST : " + ZonedDateTime.now(ZoneId.of("America/Detroit")));
		System.out.println("Denver  MST : " + ZonedDateTime.now(ZoneId.of("America/Denver")));
		System.out.println("LA      CST : " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));

		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Denver"));
		System.out.println("Denver : " + localDateTime);

		LocalDateTime localDateTime1 = LocalDateTime.now();
		ZonedDateTime zonedDateTime1 = localDateTime1.atZone(ZoneId.of("America/Chicago"));
		System.out.println("zonedDateTime1 : " + zonedDateTime1);

		ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("America/Chicago"));
		System.out.println("zonedDateTime2 : " + zonedDateTime2);

		LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		System.out.println("ofInstant : " + localDateTime2);

		OffsetDateTime offsetDateTime = localDateTime1.atOffset(ZoneOffset.ofHours(-6));
		System.out.println("offsetDateTime : " + offsetDateTime);
	}
}
