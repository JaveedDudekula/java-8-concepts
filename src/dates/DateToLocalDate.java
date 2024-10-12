package dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDate {

	public static void main(String[] args) {

		// java.util.Date to LocalDate and vice versa

		Date date = new Date();
		System.out.println("date : " + date);

		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("localDate : " + localDate);

		new Date();
		Date date1 = Date.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("date1 : " + date1);

		// java.sql.Date to LocalDate and vice versa

		java.sql.Date dateSQL = java.sql.Date.valueOf(localDate);
		System.out.println("dateSQL : " + dateSQL);

		LocalDate localDate1 = dateSQL.toLocalDate();
		System.out.println("localDate1 : " + localDate1);
	}
}
