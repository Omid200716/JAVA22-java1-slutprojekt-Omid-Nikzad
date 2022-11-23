import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

class Date {
	
	 static LocalDate today = LocalDate.now();
	 static LocalDate start = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
	
	

}
