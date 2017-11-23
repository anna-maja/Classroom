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
	Student021 sExt1 = new Student021("Albert Ext", "Andersson", 11, 'm', 5, 5, 5);

	/*
	 * Student021 sExt2 = new Student021("Bo Ext", "Baldersson", 30, 'o', 6, 6, 6);
	 * Student021 sExt3 = new Student021("Clara Ext", "Carlsson", 40, 'f', 7, 7, 7);
	 * Student021 sExt4 = new Student021("Delta Ext", "Dunker", 17, 'm', 0, 0, 0);
	 */
	@Test
	public void testGetSetStudent021() {

		Student021 sExt1 = new Student021("Albert Ext", "Andersson", 11, 'm', 6.6, 7.7, 9.9);

		sExt1.setFirstName("Albert Ext");
		sExt1.setLastName("Andersson");
		sExt1.setAge(11);
		sExt1.setGender('m');
		sExt1.setFirstGrade(6.6);
		sExt1.setSecondGrade(7.7);
		sExt1.setThirdGrade(9.9);
		sExt1.setAverageGrade(8.067);

		assertEquals(sExt1.getFirstName().equals("Albert Ext"), true);
		assertEquals(sExt1.getLastName().equals("Andersson"), true);
		assertEquals(sExt1.getAge(), 11);
		assertEquals(sExt1.getGender(), 'm');
		assertEquals(sExt1.getFirstGrade(), 6.6, 0);
		assertEquals(sExt1.getSecondGrade(), 7.7, 0);
		assertEquals(sExt1.getThirdGrade(), 9.9, 0);
		assertEquals(sExt1.getAverageGrade(), 8.067, 0.1);

	}
	/*
	 * Tanke om hur en skulle kunna isolera testning av setter: try
	 * (sExt1.setFirstName("Albert Ext"); if ( Om namnet redan finns, har
	 * setFirstName fungerat. return truef
	 */

	/*
	 * Får inte testet att funka. Förstår inte hur metoden funkar i grunden.
	 * 
	 * @Test public void testCalculateAverage1Student021() {
	 * 
	 * for (int i = 0; i <3; i++) { firstGrade =
	 * Double.valueOf(df.format(random.nextDouble()*10)); secondGrade =
	 * Double.valueOf(df.format(random.nextDouble()*10)); thirdGrade =
	 * Double.valueOf(df.format(random.nextDouble()*10)); double result =
	 * (firstGrade+secondGrade+thirdGrade)/3;
	 * 
	 * LOG.info("Testing the first calculateAverage method:  " + firstGrade +
	 * " --- " + secondGrade + " --- " + thirdGrade);
	 * assertEquals(Math.round(sExt1.calculateAverage(firstGrade)), result, 0.5); }
	 * }
	 */

	/*
	 * @Test public void testCalculateAverage2Student021() {
	 * 
	 * }
	 */
	@Test
	public void testCalculateAverage3LocalVariablesStudent021() {

		for (int i = 0; i < 3; i++) {
			firstGrade = Double.valueOf(df.format(random.nextDouble() * 10));
			secondGrade = Double.valueOf(df.format(random.nextDouble() * 10));
			thirdGrade = Double.valueOf(df.format(random.nextDouble() * 10));
			double result = (firstGrade + secondGrade + thirdGrade) / 3;

			LOG.info("Testing the third calculateAverage method with random numbers 0-10: " + firstGrade + " --- "
					+ secondGrade + " --- " + thirdGrade);
			assertEquals(Math.round(sExt1.calculateAverage(firstGrade, secondGrade, thirdGrade)), result, 0.5);
		}
	}
	@Test
	public void testClearedCourse1() {
		
		boolean hasClearedCourse1 = false; 
		firstGrade = 6.1;
		secondGrade = 6.2;
		thirdGrade = 6.4; 
		LOG.info("Testing has cleared course with numbers >6");
		
		for (int i = 0; i < 3; i++) {
						
			double result = (firstGrade + secondGrade + thirdGrade) / 3;
			
			sExt1.setAverageGrade(result);
			
			if (result >=6) {
				hasClearedCourse1 = true; 
				assertTrue(sExt1.hasClearedTheCourse());
				LOG.info("Testing if student HAS cleared course with " + result + ": " + 
				hasClearedCourse1 + " == " +  sExt1.hasClearedTheCourse()); 				
			} 
			else {
				LOG.info("SOMETHING WRONG!!!");				
			}
			
			firstGrade = firstGrade + 0.1;
			secondGrade = secondGrade + 0.1;
			thirdGrade = thirdGrade + 0.1;

		}
		
	}

	@Test
	public void testClearedCourseNo() {
		
		boolean hasClearedCourse2 = true; 
		firstGrade = 5.9;
		secondGrade = 5.5;
		thirdGrade = 5.1; 
		
		for (int i = 0; i < 3; i++) {
						
			double result = (firstGrade + secondGrade + thirdGrade) / 3;
			
			sExt1.setAverageGrade(result);
			LOG.info("Testing if the student HASN'T cleared course with numbers <6.");
			
			if (result < 6) {
				hasClearedCourse2 = false;
				assertFalse(sExt1.hasClearedTheCourse());
				LOG.info("Testing that student HASN'T cleared course with " + result + ": " + 
				hasClearedCourse2);
			} 
			else {
				hasClearedCourse2 = true; 
				assertTrue(sExt1.hasClearedTheCourse());
				LOG.info("Testing if student HASN'T cleared course with " + result + ": " + 
						hasClearedCourse2 + " == " +  sExt1.hasClearedTheCourse());			
			}
			
			firstGrade = firstGrade - 0.1;
			secondGrade = secondGrade - 0.1;
			thirdGrade = thirdGrade - 0.1;

		}
		
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
				LOG.info("Testing that student HAS cleared course with " + result + ": " + 
				hasClearedCourse3);
			} 
			else {
				hasClearedCourse3 = true; 
				assertTrue(sExt1.hasClearedTheCourse());
				LOG.info("Testing if student HAS cleared course with " + result + ": " + 
						hasClearedCourse3 + " == " +  sExt1.hasClearedTheCourse());			
			}
			
		}
		
	}
	
	@Test
	public void testToStringStudent021() {
		
		
	}

/*
 * public String toString() {
		calculateAverage(this.getFirstGrade(), getSecondGrade(), getThirdGrade());
		DecimalFormat df = new DecimalFormat("#.0");

		if (hasClearedTheCourse()) {
			return "Student: " + getFirstName() + " " + getLastName() + "\n" + "Grades: " + this.firstGrade + " , "
					+ this.secondGrade + " , " + this.thirdGrade + "\nFinalGrade: " + df.format(this.averageGrade)
					+ "\nThe student has cleared the course\n-----------------------";
		}

		return "Student: " + getFirstName() + " " + getLastName() + "\n" + "Grades: " + this.firstGrade + " , "
				+ this.secondGrade + " , " + this.thirdGrade + "\nFinalGrade: " + df.format(this.getAverageGrade())
				+ "\nThe student has not cleared the course\n-----------------------";

	}

 */
}




































