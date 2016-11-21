package test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import domain.Postering;

public class TestPostering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Postering [] posteringArray = new Postering [10];
				
		posteringArray[0] = new Postering(LocalDateTime.now(), new BigDecimal((long)(Math.random()*1000)), 1, " Til kont 1");
		posteringArray[1] = new Postering(LocalDateTime.now(), new BigDecimal((long)(Math.random()*1000)), 2, " Til kont 2");
		posteringArray[2] = new Postering(LocalDateTime.now(), new BigDecimal("300.00"), 3, " Til kont 3");
		posteringArray[3] = new Postering(LocalDateTime.now(), new BigDecimal("400.00"), 4, " Til kont 4");
		posteringArray[4] = new Postering(LocalDateTime.now(), new BigDecimal("500.00"), 5, " Til kont 5");
		posteringArray[5] = new Postering(LocalDateTime.now(), new BigDecimal("600.00"), 6, " Til kont 6");
		posteringArray[6] = new Postering(LocalDateTime.now(), new BigDecimal("100.00"), 7, " Til kont 7");
		posteringArray[7] = new Postering(LocalDateTime.now(), new BigDecimal("200.00"), 8, " Til kont 8");
		posteringArray[8] = new Postering(LocalDateTime.now(), new BigDecimal("300.00"), 9, " Til kont 9");
		posteringArray[9] = new Postering(LocalDateTime.now(), new BigDecimal("400.00"), 10, " Til kont 10");
		
		for(Postering p : posteringArray) {
			System.out.println(p);			
		}
		
		//Postering tilPostering = new Postering(LocalDateTime.now(), new BigDecimal("100.00"), 2, "Til konto 2");
				
/*		fraPostering.setDatotid(LocalDateTime.now());
		tilPostering.setDatotid(fraPostering.getDatotid());
		
		fraPostering.setBeloeb(new BigDecimal("100.00"));
		tilPostering.setBeloeb(new BigDecimal("-100.00"));
		
		fraPostering.setKonto(1234567890);
		tilPostering.setKonto(fraPostering.getKonto());
		
		System.out.println(fraPostering);
		System.out.println(tilPostering); */
	}

}
