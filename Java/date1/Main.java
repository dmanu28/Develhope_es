package date1;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
 
	public static void main(String[] args) {
		//ES1 DA CORREGERE
		// Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
		//Formatta la data ottenuta in FULL, MEDIUM e SHORT
		//Stampa le varie versioni

		ZonedDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
		ZonedDateTime data1 = OffsetDateTime.parse("2002-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
		
		String dataString = data1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
		String dataString1 = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG));
		String dataString3 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		String dataString2 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
		
		System.out.println(data);
		System.out.println(dataString);
		System.out.println(dataString1);
		System.out.println(dataString2);
		System.out.println(dataString3);
		
		//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
		//Formatta la data ottenendo 01 marzo 2023
		//Stampa sulla console
		
		String inputDataString = "2023-03-01T13:00:00Z";
		OffsetDateTime esdata = OffsetDateTime.parse(inputDataString);
		String unoMarzo = esdata.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
		System.out.println(unoMarzo);
		
		/*
		 * ES 3 DA CORREGGERE
	Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console*/
		
		
		String inputDataString2 = "2023-03-01T13:00:00Z";
		OffsetDateTime es3 = OffsetDateTime.parse(inputDataString2);
		int year = es3.getYear();
		Month month = es3.getMonth();
		int day = es3.getDayOfMonth();
		DayOfWeek dayWeek = es3.getDayOfWeek();
		
		System.out.println("Anno: "+ year+"\n"+"Mese: "+month+"\n"+"Giorno: "+day+"\n"+"Giorno della Settimana: "+dayWeek);
		
		/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia*/
		
		OffsetDateTime piuAnno = esdata.plusYears(1);
		OffsetDateTime piuMese = piuAnno.minusMonths(1);
		OffsetDateTime piuGG = piuMese.plusDays(7);
		ZonedDateTime finalDate = piuGG.atZoneSameInstant(ZoneId.of("Europe/Rome"));
		System.out.println(finalDate);
		
		
		/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
Verificare che la prima data è precedente alla seconda
Verificare che la seconda data è successiva alla prima
Verificare che le due date sono uguali ad ora
Stampa il risultato
*/

		String inputDataString3 = "2024-03-01T13:00:00Z";
		OffsetDateTime newData = OffsetDateTime.parse(inputDataString3);
		System.out.println(esdata.isBefore(newData));
		System.out.println(newData.isAfter(esdata));
		System.out.println(esdata.compareTo(newData));
	}
}
