//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class CohortTest {
//
//	public static void main(String[] args) {
//
//		Cohort dragon;
//
//		Student bobby;
//		Student billy;
//
//		@Before
//		public void setUp(){
//			dragon = new Cohort();
//
//			bobby = new Student(0001, "Bobby");
//			billy = new Student(0002, "Billy");
//
//			bobby.addGrade(100);
//			bobby.addGrade(101);
//			bobby.addGrade(94);
//			bobby.addGrade(91);
//			bobby.addGrade(100);
//			billy.addGrade(99);
//			billy.addGrade(100);
//			billy.addGrade(99);
//			billy.addGrade(91);
//			billy.addGrade(97);
//		}
//
//
//		@Test
//		public void testAddStudent(){
//			assertEquals(0, dragon.getStudents().size());
//			dragon.addStudent(bobby);
//			assertEquals(1, dragon.getStudents().size());
//			dragon.addStudent((billy));
//			assertEquals(2, dragon.getStudents().size());
//		}
//
//		@Test
//		public void testGetStudents(){
//			dragon.addStudent(bobby);
//			dragon.addStudent(billy);
//			assertEquals(bobby, dragon.getStudents().get(0));
//			assertEquals(billy, dragon.getStudents().get(1));
//
//		}
//
//		@Test
//		public void testGetCohortAverage(){
//			dragon.addStudent(bobby);
//			dragon.addStudent(billy);
//
//		}
//
//	}
//
//}
