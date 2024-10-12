package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatParseLocalDate {

	public static void parseLocalDate() {

		// parse - String to LocalDate
		String date = "2022-09-20";
		LocalDate localDate = LocalDate.parse(date);
		System.out.println("localDate : " + localDate);

		LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("localDate1 : " + localDate1);

		String date1 = "19981125";
		LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("localDate2 : " + localDate2);

		// custom defined date format
		String customDate = "2001|03|25";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate localDate3 = LocalDate.parse(customDate, dateTimeFormatter);
		System.out.println("localDate3 : " + localDate3);
	}

	public static void formatLocalDate() {

		// format - LocalDate to String
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd|MM|yyyy");
		LocalDate localDate = LocalDate.now();
		String formattedDate = localDate.format(dateTimeFormatter);
		System.out.println("formattedDate : " + formattedDate);
	}

	public static void main(String[] args) {
		parseLocalDate();
		formatLocalDate();
	}
}
