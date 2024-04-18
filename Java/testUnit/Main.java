package testUnit;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	public static void main(String[] args) {
		/*Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Fai attenzione a usare almeno Java 8
Ottieni l'anno
Ottieni il mese
Ottieni il giorno
Ottieni il giorno della settimana
Crea dei test per questo esercizio
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia*/

	String dataInput = "2023-03-01T13:00:00Z";
	OffsetDateTime date1 = parseDate(dataInput);
	String fomat = formatDateMedium(date1);
	System.out.println(fomat);
	System.out.println(date1.getDayOfWeek());

		System.out.println(getDateComponents(date1));
	}

	public static String formatDateMedium(OffsetDateTime date1) {
		String fomat = date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		return fomat;
	}

	public static OffsetDateTime parseDate(String dataInput) {
		OffsetDateTime date1 = OffsetDateTime.parse(dataInput);
		return date1;
	}

	public static String getDateComponents(OffsetDateTime date) {
		Integer year = date.getYear();
		Integer month = date.getMonthValue();
		Integer day = date.getDayOfMonth();
		 String dayWeek = String.valueOf(date.getDayOfWeek()) ;
		String result = "year: "+String.valueOf(year)+" month: "+String.valueOf(month)+
				" day: "+String.valueOf(day)+" day of the week: "+dayWeek;
		return result;
	}

	public static String addYear(OffsetDateTime date) {
		OffsetDateTime addyear = date.plusYears(1);
		OffsetDateTime addmonth = date.plusMonths(1);
		OffsetDateTime addday = date.plusDays(7);
		return "add 1 year: "+String.valueOf(addyear)+" add 1 month: "+
		addmonth+" add 7 days: "+addday;
		
	}
}
