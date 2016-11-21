package domain;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;


public class KundeTest {

	PrivateKunde kunde = new PrivateKunde("Nada", "Spurven 1", 2801754190l, "nadatee@hotmail.com", 22868131, 28011975);
	
//	@Test
//	public void getAlderTest() {
//	fail("Not yet implemented");
//		
//	}
	
	@Test
	public void getAlderTest() {
//		fail("Not yet implemented");
		assertEquals(30, kunde.getAlder(LocalDate.of(2005, Month.AUGUST, 28)));
	}


}
