package dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatParseLocalTime {

	public static void parseLocalTime() {

		// parse - String to LocalTime
		String time = "14:00";
		LocalTime localTime = LocalTime.parse(time);
		System.out.println("localTime  : " + localTime);

		LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("localTime1 : " + localTime1);

		// custom time format
		String time1 = "14*00";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
		LocalTime localTime2 = LocalTime.parse(time1, dateTimeFormatter);
		System.out.println("localTime2 : " + localTime2);

		String time2 = "14*00*55";
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH*mm*ss");
		LocalTime localTime3 = LocalTime.parse(time2, dateTimeFormatter1);
		System.out.println("localTime3 : " + localTime3);
	}

	public static void formatLocalTime() {

		// format - LocalTime to String
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
		LocalTime currentTime = LocalTime.now();
		System.out.println("currentTime : " + currentTime);
		String formattedTime = currentTime.format(dateTimeFormatter);
		System.out.println("formattedTime : " + formattedTime);
	}

	public static void main(String[] args) {
		parseLocalTime();
		formatLocalTime();
	}
}
