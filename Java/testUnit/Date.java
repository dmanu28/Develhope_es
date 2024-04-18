package testUnit;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date  {

	public OffsetDateTime convertString(String data) {
		return OffsetDateTime.parse(data);
	}
	
	public String formatDateFull(OffsetDateTime dateTime) {
		return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
	}
	
	public String formatDateMedium(OffsetDateTime dateTime) {
		return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
	}
	
	public String formatDateShort(OffsetDateTime dateTime) {
		return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
	}

}
