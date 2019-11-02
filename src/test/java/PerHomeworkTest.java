import org.junit.Test;
import sdproject.com.Homework.Homework;
import sdproject.com.Homework.PersonalityHomework;
import static org.junit.Assert.assertEquals;

public class PerHomeworkTest {
    Homework hw = new PersonalityHomework("Problem 1", 12);

    @Test
    public void finishedTest(){
        assertEquals(hw.finished(), false);
        hw.doHW(12);
        assertEquals(hw.finished(), true);
    }
}
