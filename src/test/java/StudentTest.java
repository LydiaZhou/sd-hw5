import org.junit.Test;
import sdproject.com.client.Student;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    Student s = new Student("Amy", 1, "518-000-0000", "N/A", 18, "N/A");

    @Test
    public void getterTest() {
        assertEquals(s.getId(), 1);
        assertEquals(s.getDepartment(), "N/A");
        assertEquals(s.getName(), "Amy");
    }

    @Test
    public void setterTest() {
        s.setAddress("Troy");
        s.setAge(28);
        s.setDepartment("CS");
        assertEquals("Troy", s.getAddress());
        assertEquals(28, s.getAge());
        assertEquals("CS", s.getDepartment());
    }
}
