import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import otherclasses.Student021;

public class Student021Test {

	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	String firstName = "";
	String lastName = "";
	int age = 0;
	char gender = ' ';
	double firstGrade = 100.1;
	double secondGrade = 100.1;
	double thirdGrade = 100.1;

	private static final Logger LOG = Logger.getLogger(Student021.class.getName());

	Student021 sBas1 = new Student021("Adam Bas", "Adamsson", 18, 'm');
	/*
	 * Student021 sBas2 = new Student021("Bertil Bas", "Bertilsson", 20, 'o');
	 * Student021 sBas3 = new Student021("Cecilia Bas", "Ceder", 22, 'f');
	 */
	Student021 sExt1 = new Student021("Albert", "Andersson", 11, 'm', 5, 5, 5);

	/*
	 * Student021 sExt2 = new Student021("Bo Ext", "Baldersson", 30, 'o', 6, 6, 6);
	 * Student021 sExt3 = new Student021("Clara Ext", "Carlsson", 40, 'f', 7, 7, 7);
	 * Student021 sExt4 = new Student021("Delta Ext", "Dunker", 17, 'm', 0, 0, 0);
	 */
	@Test
	public void testGetSetStudent021() {

		/*
		 * another way: by using other declarations than the earlier.
		 * 
		 * testGetSetFirstName { sExt1.setFirstName(other value);
		 * assertEquals(sExt1.getFirstName().equals(other value), true) }
		 */

		sExt1.setFirstName("Albert Ext");
		sExt1.setLastName("Andersdotter");
		sExt1.setAge(10);
		sExt1.setGender('o');
		sExt1.setFirstGrade(7.7);
		sExt1.setSecondGrade(7.7);
		sExt1.setThirdGrade(7.7);
		// sExt1.setAverageGrade(8.067);

		assertEquals(sExt1.getFirstName().equals("Albert Ext"), true);
		assertEquals(sExt1.getLastName().equals("Andersdotter"), true);
		assertEquals(sExt1.getAge(), 10);
		assertEquals(sExt1.getGender(), 'o');
		assertEquals(sExt1.getFirstGrade(), 7.7, 0);
		assertEquals(sExt1.getSecondGrade(), 7.7, 0);
		assertEquals(sExt1.getThirdGrade(), 7.7, 0);
		// assertEquals(sExt1.getAverageGrade(), 8.067, 0.1);

	}

	@Test
	public void testSetAndGetAverage() {

		sExt1.setAverageGrade(5.0);
		assertEquals(sExt1.getAverageGrade() == 5.0, true);
	}

	@Test
	public void testCalculateAverageWithParamStudent021() {

		// skapar först två befintliga parametrar
		sExt1.setSecondGrade(5.0);
		sExt1.setThirdGrade(5.0);
		double result = sExt1.calculateAverage(5.0); // 5.0 skickas in till metoden.
		
		assertEquals((sExt1.getAverageGrade() == result) && (result == 5.0), true);
	}

	@Test
	public void testCalculateAverageWithNoParamStudent021() {

		// alla värden skapas innan.
		sExt1.setFirstGrade(5.0);
		sExt1.setSecondGrade(5.0);
		sExt1.setThirdGrade(5.0);
		//... och medel beräknas med första calcAver
		sExt1.calculateAverage();

		assertEquals((sExt1.getAverageGrade() == 5.0), true);

	}

	@Test
	public void testCalculateAverageWithAllParamStudent021() {

		double result = sExt1.calculateAverage(5.0, 5.0, 5.0);

		assertEquals(sExt1.getAverageGrade() == 5.0, true);

	}

	@Test
	public void testClearedCourse1() {

		sExt1.setAverageGrade(6.0);
		assertEquals(sExt1.hasClearedTheCourse(), true);
		
	}

	@Test
	public void testClearedCourse2() {

		sExt1.setAverageGrade(5.0);
		assertEquals(sExt1.hasClearedTheCourse(), false);
		
	}

	@Test
	public void testClearedCourseYes2() {

		boolean hasClearedCourse3 = true;
		firstGrade = 6;
		secondGrade = 6;
		thirdGrade = 6;

		for (int i = 0; i < 3; i++) {

			double result = (firstGrade + secondGrade + thirdGrade) / 3;

			sExt1.setAverageGrade(result);
			LOG.info("Testing if the student HAS cleared course with exactly 6.");

			if (result < 6) {
				hasClearedCourse3 = false;
				assertFalse(sExt1.hasClearedTheCourse());
				LOG.info("Testing that student HAS cleared course with " + result + ": " + hasClearedCourse3);
			} else {
				hasClearedCourse3 = true;
				assertTrue(sExt1.hasClearedTheCourse());
				LOG.info("Testing if student HAS cleared course with " + result + ": " + hasClearedCourse3 + " == "
						+ sExt1.hasClearedTheCourse());
			}

		}

	}

	@Test
	public void testToStringStudent021() {
		
		sExt1.setFirstGrade(5.0);
		sExt1.setSecondGrade(5.0);
		sExt1.setThirdGrade(5.0);
		System.out.println(sExt1.toString());

		String expected = "The student has not cleared the course";
		assertEquals(sExt1.toString().contains(expected), true);
		
		sExt1.setFirstGrade(7.0);
		sExt1.setSecondGrade(7.0);
		sExt1.setThirdGrade(7.0);
		System.out.println(sExt1.toString());

		expected = "The student has cleared the course";
		assertEquals(sExt1.toString().contains(expected), true);
		
		
	}
}
