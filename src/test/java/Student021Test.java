import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;

import otherclasses.Student021;

public class Student021Test {

	String firstName = "";
	String lastName = "";
	int age = 0;
	char gender = ' ';
	double firstGrade = 100.1;
	double secondGrade = 100.1;
	double thirdGrade = 100.1;

	private static final Logger LOG = Logger.getLogger(Student021.class.getName());

	Student021 sb1 = new Student021("Adam Bas", "Adamsson", 18, 'm');
	/* 
	 * Other students with parameters from Person021: 
	 * Student021 sb2 = new Student021("Bertil Bas", "Bertilsson", 20, 'o');
	 * Student021 sb3 = new Student021("Cecilia Bas", "Ceder", 22, 'f');
	 */
	Student021 se1 = new Student021("Albert", "Andersson", 11, 'm', 5, 5, 5);

	/*
	 * Other students with all paramteters: 
	 * Student021 se2 = new Student021("Bo Ext", "Baldersson", 30, 'o', 6, 6, 6);
	 * Student021 se3 = new Student021("Clara Ext", "Carlsson", 40, 'f', 7, 7, 7);
	 * Student021 se4 = new Student021("Delta Ext", "Dunker", 17, 'm', 0, 0, 0);
	 */
	@Test
	public void testGetSetStudent021() {

		/*
		 * These tests takes all the sets and gets separately
		 * Preferably by using other declarations than the earlier.
		 * 
		 * Other way, possibly more "överskådligt": 
		 * test both get and set with one variable at the time
		 * testGetSetFirstName { sExt1.setFirstName(other value);
		 * assertEquals(sExt1.getFirstName().equals(other value), true) }
		 */

		se1.setFirstName("Albert Ext");
		se1.setLastName("Andersdotter");
		se1.setAge(10);
		se1.setGender('o');
		se1.setFirstGrade(7.7);
		se1.setSecondGrade(7.7);
		se1.setThirdGrade(7.7);

		assertEquals(se1.getFirstName().equals("Albert Ext"), true);
		assertEquals(se1.getLastName().equals("Andersdotter"), true);
		assertEquals(se1.getAge(), 10);
		assertEquals(se1.getGender(), 'o');
		assertEquals(se1.getFirstGrade(), 7.7, 0);
		assertEquals(se1.getSecondGrade(), 7.7, 0);
		assertEquals(se1.getThirdGrade(), 7.7, 0);

	}
	
	@Test
	public void testSetAndGetAverage() {

		se1.setAverageGrade(5.0);
		assertEquals(se1.getAverageGrade() == 5.0, true);
	}

	@Test
	public void testCalculateAverageWithParamStudent021() {

		// skapar först två befintliga parametrar
		se1.setSecondGrade(5.0);
		se1.setThirdGrade(5.0);
		double result = se1.calculateAverage(5.0); // 5.0 skickas in till metoden.

		assertEquals((se1.getAverageGrade() == result) && (result == 5.0), true);
	}

	@Test
	public void testCalculateAverageWithNoParamStudent021() {

		// alla värden skapas innan.
		se1.setFirstGrade(5.0);
		se1.setSecondGrade(5.0);
		se1.setThirdGrade(5.0);
		// ... och medel beräknas med första calcAver
		se1.calculateAverage();

		assertEquals((se1.getAverageGrade() == 5.0), true);

	}

	@Test
	public void testCalculateAverageWithAllParamStudent021() {

		double result = se1.calculateAverage(5.0, 5.0, 5.0);

		assertEquals(se1.getAverageGrade() == 5.0, true);

	}

	@Test
	public void testClearedCourse1() {

		se1.setAverageGrade(6.0);
		assertEquals(se1.hasClearedTheCourse(), true);

	}

	@Test
	public void testClearedCourse2() {

		se1.setAverageGrade(5.0);
		assertEquals(se1.hasClearedTheCourse(), false);

	}

	@Test
	public void testToStringStudent021() { 
		

		se1.setFirstGrade(5.0);
		se1.setSecondGrade(5.0);
		se1.setThirdGrade(5.0);
		System.out.println(se1.toString());

		String expected = "The student has not cleared the course";
		assertEquals(se1.toString().contains(expected), true);

		se1.setFirstGrade(7.0);
		se1.setSecondGrade(7.0);
		se1.setThirdGrade(7.0);
		System.out.println(se1.toString());

		expected = "The student has cleared the course";
		assertEquals(se1.toString().contains(expected), true);

	}
}
