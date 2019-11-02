package sdproject.com.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sdproject.com.Homework.CVHomework;
import sdproject.com.Homework.Homework;

public class CVStudy extends Study{
    final static Logger logger = LogManager.getLogger(CVStudy.class);

    @Override
    public Homework createHomework() {
        logger.debug("Create new");
        return new CVHomework();
    }
}
