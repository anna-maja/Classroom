import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person021;
import otherclasses.Student021;

public class Person021Test {

	@Test
	public void test() {
		Person021 p = new Person021("Rafael", "Silva", 30,'M');
		assertEquals(p.getFirstName().equals("Rafael"),true);
	}
	
	@Test
	public void testGetSetPerson021() {
		
		Person021 pBas1 = new Person021("Adam", "Adamsdotter", 15, 'o');

		pBas1.setFirstName("Adam Bas");
		pBas1.setLastName("Adamsson");
		pBas1.setAge(18);
		pBas1.setGender('m');
		
		assertEquals(pBas1.getFirstName().equals("Adam Bas"), true);
		assertEquals(pBas1.getLastName().equals("Adamsson"), true);
		assertEquals(pBas1.getAge(), 18);
		assertEquals(pBas1.getGender(), 'm');
	}



}
