package domain;

import java.util.Date;

public abstract class Kunde {
	protected String navn;
	protected String adresse;	
	protected String email;
	protected int telefonNummer;
	protected Date foeselsdato;
	
	public Kunde(String navn, String adresse, String email, int telefonNummer){
		this.navn = navn;
		this.adresse = adresse;
		this.email = email;
		this.telefonNummer = telefonNummer;
	}
	
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefonNummer() {
		return telefonNummer;
	}
	public void setTelefonNummer(int telefonNummer) {
		this.telefonNummer = telefonNummer;
	}

	@Override
	public String toString() {
		return "Kunde [navn=" + navn + ", adresse=" + adresse + ", email=" + email + ", telefonNummer=" + telefonNummer
				+ "]";
	}
	
	
}
