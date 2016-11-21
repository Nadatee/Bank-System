package test;

import domain.Kunde;
import domain.PrivateKunde;

public class TestKunde {

	public static void main(String[] args) {
		
		Kunde [] kunde = new PrivateKunde [3];
		
		kunde[0] = new PrivateKunde	("Nada", "Spurven 2", 2801754190l, "nadatee@hotmail.com", 22868131, 28011975);
		kunde[1] = new PrivateKunde	("Ulla", "Spurven 1", 2801754190l, "ulla@hotmail.com", 22868131, 28011975);
		kunde[2] = new PrivateKunde	("Henrik", "Spurven 1", 2801954190l, "henrik@hotmail.com", 22868131, 28011975);
		
		for(Kunde k : kunde) {
			System.out.println(k);
		}

	}

}
