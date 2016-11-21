package domain;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PrivateKunde extends Kunde {

	private long personNummer;
	private long birthday;
	
	public PrivateKunde(String navn, String adresse, long personNummer, String email, int telefonNummer, long birthday) {
		super(navn, adresse, email, telefonNummer);
		this.personNummer = personNummer;
		this.birthday = birthday;
		
		}
		

	public long getPersonNummer() {
		return personNummer;
	}

	public void setPersonNummer(long personNummer) {
		this.personNummer = personNummer;
	}
	
	public int getAlder() { 
		return getAlder(LocalDate.now());
	}
	
	protected int getAlder(LocalDate date) { 
		
		Period period = Period.between(LocalDate.of(1975, Month.JANUARY, 28), date);
		return period.getYears();
		
	}


	public long getBirthday() {
		return birthday;
	}


	public void setBirthday(long birthday) {
		this.birthday = birthday;
	}
	
}
