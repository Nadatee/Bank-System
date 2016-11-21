package logic;

import domain.Kunde;
import domain.PrivateKunde;;

public class Bank implements BankInterface {

	
	@Override
	public void opretKunde(String navn, String adresse, long personNummer, String email, int telefonNummer) {
		
		Kunde kundePrivate = new PrivateKunde(navn, adresse, personNummer, email, telefonNummer, 28011975);
		
		kundePrivate.setNavn("Nada");
		kundePrivate.setAdresse("Spurven 1");
		kundePrivate.setEmail("nadatee@hotmail.com");
		//kundePrivate.setPersonNummer(2801754190l);
		kundePrivate.setTelefonNummer(22868131);
		
		System.out.println(kundePrivate.getNavn());
		//System.out.println(kundePrivate.getPersonNummer());
		System.out.println(kundePrivate.getAdresse());
		System.out.println(kundePrivate.getEmail());
		System.out.println(kundePrivate.getTelefonNummer());		

	}

}
