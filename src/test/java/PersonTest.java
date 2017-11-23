import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person021;
import otherclasses.Student021;

public class PersonTest {

	@Test
	public void test() {
		Person021 p = new Person021("Rafael", "Silva", 30,'M');
		assertEquals(p.getFirstName().equals("Rafael"),true);
	}
	
	@Test
	public void testGetSetPerson021() {
		
		Student021 sBas1 = new Student021("Adam Bas", "Adamsson", 18, 'm');

		sBas1.setFirstName("Adam Bas");
		sBas1.setLastName("Adamsson");
		sBas1.setAge(18);
		sBas1.setGender('m');
		assertEquals(sBas1.getFirstName().equals("Adam Bas"), true);
		assertEquals(sBas1.getLastName().equals("Adamsson"), true);
		assertEquals(sBas1.getAge(), 18);
		assertEquals(sBas1.getGender(), 'm');
	}



}
