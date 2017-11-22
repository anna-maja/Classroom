import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person021;

public class PersonTest {

	@Test
	public void test() {
		Person021 p = new Person021("Rafael", "Silva", 30,'M');
		assertEquals(p.getFirstName().equals("Rafael"),true);
	}

}
