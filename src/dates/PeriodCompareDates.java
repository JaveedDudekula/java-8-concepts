package dates;

import java.time.LocalDate;
import java.time.Period;

public class PeriodCompareDates {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2022, 1, 1);
		LocalDate localDate1 = LocalDate.of(2022, 12, 31);

		Period period = localDate.until(localDate1);
		System.out.println("period between two dates using localDate.until() : " + period.getYears() + " Years - "
				+ period.getMonths() + " Months - " + period.getDays() + " Days.");

		Period period1 = Period.ofDays(10);
		Period period2 = Period.ofYears(10);
		System.out.println("toTotalMonths : " + period1.toTotalMonths());
		System.out.println("toTotalMonths : " + period2.toTotalMonths());

		Period period3 = Period.between(localDate, localDate1);
		System.out.println("period between two dates using Period.between() : " + period3.getYears() + " Years - "  
				+ period3.getMonths() + " Months - " + period3.getDays() + " Days.");
	}
}
