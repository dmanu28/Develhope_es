package testUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.time.OffsetDateTime;

import org.junit.Test;

public class DateTest {

	@Test
	public void testParseDate() {
		String dataInput = "2023-03-01T13:00:00Z";
		OffsetDateTime date1 = OffsetDateTime.parse(dataInput);
		OffsetDateTime myDate = Main.parseDate(dataInput);
		assertEquals(myDate, date1);
		
	}

	@Test
	public void testDateFormatter() {
		String dataInput = "2023-03-01T13:00:00Z";
		OffsetDateTime date1 = OffsetDateTime.parse(dataInput);
		String formattedDate = Main.formatDateMedium(date1);
		assertFalse(formattedDate.isEmpty());
		assertEquals(formattedDate, "1 Mar 2023");
	}
	
	@Test
	public void testGetDateComponents() {
		String dataInput = "2023-03-01T13:00:00Z";
		OffsetDateTime date1 = OffsetDateTime.parse(dataInput);
		 String result = Main.getDateComponents(date1);
		 assert(result.contains("2023"));
		 assert(result.contains("3"));
		 assert(result.contains("1"));
		 assert(result.contains("WEDNESDAY"));
		assertEquals(2023, date1.getYear());	
	}
	
	@Test
	public void testAddYear() {
		String dataInput = "2023-03-01T13:00:00Z";
		OffsetDateTime date1 = OffsetDateTime.parse(dataInput);
		String result = Main.addYear(date1);
		assert(result.contains("2024"));
		assert(result.contains("4"));
		assert(result.contains("8"));
	
	}
}
