package sdproject.com.Homework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersonalityHomework implements Homework{
    final static Logger logger = LogManager.getLogger(PersonalityHomework.class);

    String name;
    int pagesFinished;
    int pagesRequired;

    public PersonalityHomework() {
        this.name = "Personality default homework";
        this.pagesRequired = 12;
        this.pagesFinished = 0;
    }

    public PersonalityHomework(String name, int pagesRequired) {
        this.name = name;
        this.pagesRequired = pagesRequired;
        this.pagesFinished = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPagesRequired() {
        return pagesRequired;
    }

    public void setPagesRequired(int pagesRequired) {
        this.pagesRequired = pagesRequired;
    }

    public int getPagesFinished() {
        return pagesFinished;
    }

    public void doHW(int num){
        logger.info(String.format("do homework %d pagies", num));
        this.pagesFinished += num;
    }

    public boolean finished(){
        logger.debug("Check the finishing status");
        return this.pagesFinished >= this.pagesRequired;
    }

    public String toString(){
        logger.debug("print the information");
        return String.format("Finished %d pages out of %d required pages in %s of Personality Homework",
                this.pagesFinished, this.pagesRequired, this.name);
    }
}
