package dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatParseLocalDateTime {

	public static void parseLocalDateTime() {

		// parse - String to LocalDateTime
		String dateTime = "2022-09-20T14:33:55";
		LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
		System.out.println("localDateTime  : " + localDateTime);

		LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println("localDateTime1 : " + localDateTime1);

		// custom format
		String customDateTime = "1998/11/25T10*30*44";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd'T'HH*mm*ss");
		LocalDateTime localDateTime2 = LocalDateTime.parse(customDateTime, dateTimeFormatter);
		System.out.println("localDateTime2 : " + localDateTime2);
	}

	public static void formatLocalDateTime() {

		// format - LocalDateTime to String
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd'T'HH*mm*ss");
		LocalDateTime localDateTime = LocalDateTime.now();
		String formattedDateTime = localDateTime.format(dateTimeFormatter);
		System.out.println("formattedDateTime : " + formattedDateTime);
	}

	public static void main(String[] args) {
		parseLocalDateTime();
		formatLocalDateTime();
	}
}
