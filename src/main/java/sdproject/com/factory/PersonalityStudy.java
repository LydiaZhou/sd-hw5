package sdproject.com.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sdproject.com.Homework.Homework;
import sdproject.com.Homework.PersonalityHomework;

public class PersonalityStudy extends Study{
    final static Logger logger = LogManager.getLogger(PersonalityStudy.class);

    @Override
    public Homework createHomework() {
        logger.debug("Create new");
        return new PersonalityHomework();
    }

}
