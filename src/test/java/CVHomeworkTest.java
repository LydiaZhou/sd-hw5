import org.junit.Test;
import static org.junit.Assert.assertEquals;
import sdproject.com.Homework.CVHomework;
import sdproject.com.Homework.Homework;
import sdproject.com.Homework.PersonalityHomework;

public class CVHomeworkTest {
    Homework hw = new CVHomework("Problem 1", 30);
    CVHomework cvhw = new CVHomework("Problem 1", 30);
    CVHomework cvhw2 = new CVHomework("Problem 1", 30);
//    Homework personality = new PersonalityHomework("Paper 3", 12);

    @Test
    public void equals(){
        cvhw2.doHW(10);
        assertEquals(cvhw, cvhw2);
        assertEquals(cvhw, hw);
    }

    @Test
    public void toStringTest(){
        assertEquals(cvhw.toString(), hw.toString());
    }

    @Test
    public void doHomeworkTest(){
        assertEquals(0, cvhw.getTimeSpent());
        cvhw.doHW(2);
        assertEquals(2, cvhw.getTimeSpent());
    }

    @Test
    public void finishedTest(){
        assertEquals(hw.finished(), false);
        hw.doHW(31);
        assertEquals(hw.finished(), true);
    }
}
