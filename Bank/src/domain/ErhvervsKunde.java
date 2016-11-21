package domain;

public class ErhvervsKunde extends Kunde{
	
	private long virksomhedNummer;
	
	public ErhvervsKunde(String navn, String adresse, long virksomhedNummer, String email, int telefonNummer) {
		super(navn, adresse, email, telefonNummer);
		this.virksomhedNummer = virksomhedNummer;		
		
		}	

	public void setVirksomhedNummer(long virksomhedNummer) {
		this.virksomhedNummer = virksomhedNummer;
	}
	
	public long getVirksomhedNummer() {
		return virksomhedNummer;
	}
}
