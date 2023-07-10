import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {
    Student st1;
    Student st2;
    @Before
    public void setUp(){
        st1 = new Student(1, "Bobby");
        st2 = new Student(2, "Randy");
    }

    @Test
    public void setupCheck(){
        assertNotNull(st1);
        assertNotNull(st2);
    }

    @Test
    public void getTestId(){
        assertEquals(1, st1.getId());
        assertEquals(2, st2.getId());
    }

    @Test
    public void testGetName(){
        assertEquals("Bobby", st1.getName());
        assertEquals("Randy", st2.getName());
    }

    @Test
    public void testGetGrades(){
        assertEquals(0, st1.getGrades().size());
        assertEquals(0, st2.getGrades().size());
    }

    @Test
    public void testAddGrade(){
        assertEquals(0, st1.getGrades().size());
        st1.addGrade(99);
        assertEquals(1, st1.getGrades().size());
        assertEquals(0, st2.getGrades().size());
    }

    @Test
    public void testGetGradeAverage(){
        st1.addGrade(100);
        st1.addGrade(100);
        st1.addGrade(100);
        assertEquals(100.00, st1.getGradeAverage(), 0);
        st2.addGrade(100);
        st2.addGrade(100);
        assertEquals(100.0, st2.getGradeAverage(), 0);

    }
}