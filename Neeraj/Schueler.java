/*https://github.com/nrattu/Paletti23*/
package Neeraj;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * In Dieser Klasse wirden die Daten von Schüler bearbeitet.
 * @author Neeraj Rattu
 * @version 2015.10.08
 */
public class Schueler {

	private String vName, fName, geschlecht,gDatum;
	/**
	 * Diese Methode gibt den Vornamen zurück.
	 * @return Vorname
	 * @since 2015.10.08
	 */
	public String getvName() {
		return vName;
	}
	/**
	 * Setzt den Vornamen gleich zum Attribut.
	 * @param vName Vorname
	 * @since 2015.10.08
	 */
	public void setvName(String vName) {
		this.vName = vName;
	}
	
	/**
	 * Diese Methode gibt den Familiennamen zurück.
	 * @return Nachname
	 * @since 2015.10.08
	 */
	public String getfName() {
		return fName;
	}
	
	/**
	 * Setzt den Nachnamen gleich zum Attribut.
	 * @param Familienname
	 * @since 2015.10.08
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	/**
	 * Diese Methode gibt das Geschlecht zurück.
	 * @return Geschlecht
	 * @since 2015.10.08
	 */
	public String getGeschlecht() {
		return geschlecht;
	}
	/**
	 * Setzt das Geschlecht gleich zum Attribut.
	 * @param geschlect
	 * @since 2015.10.08
	 */
	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}
	
	/**
	 * Diese Methode gibt das Datum zurück.
	 * @return Datum
	 * @since 2015.10.08
	 */
	public String getgDatum() {	
		return gDatum;
	}
	
	/**
	 * Setzt das Datum gleich zum Attribut.
	 * @param Datum
	 * @since 2015.10.08
	 */
	public void setgDatum(String gDatum) {
		SimpleDateFormat sd1 = new SimpleDateFormat("dd.MM.yyyy");
		SimpleDateFormat sd2 = new SimpleDateFormat("dd. MMMM yyyy");
		GregorianCalendar gc = new GregorianCalendar();
		try {
			Date d = sd1.parse(gDatum);
			gDatum = sd2.format(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.gDatum = gDatum;
	}
	/**
	 * Diese Methode gibt daten in String zurück.
	 * @return Die Daten als String
	 * @since 2015.10.08
	 */
	@Override
	public String toString() {
		return "Schueler Vorname=" + vName + ", Familienname=" + fName
				+ ", Geschlecht=" + geschlecht + ", geburtsdatum=" + gDatum;
	}

}
