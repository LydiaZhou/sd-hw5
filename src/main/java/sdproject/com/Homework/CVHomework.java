package sdproject.com.Homework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Concrete product of homework: CVHomework
 */
public class CVHomework implements Homework{
    final static Logger logger = LogManager.getLogger(CVHomework.class);

    String name;
    int timeSpent;
    int timePlanned;

    public CVHomework() {
        this.name = "CV Default Homework";
        this.timePlanned = 30;
        this.timeSpent = 0;
    }

    public CVHomework(String name, int timePlanned) {
        this.name = name;
        this.timePlanned = timePlanned;
        this.timeSpent = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimePlanned() {
        return timePlanned;
    }

    public void setTimePlanned(int timePlanned) {
        this.timePlanned = timePlanned;
    }

    public int getTimeSpent() {
        return timeSpent;
    }

    /**
     * Register the time spend on the homework
     * @param timeCost
     */
    public void doHW(int timeCost){
        logger.info(String.format("do homework %d hours", timeCost));
        this.timeSpent += timeCost;
    }

    public boolean finished(){
        logger.debug("Check the finishing status");
        return this.timeSpent >= this.timePlanned;
    }

    public String toString(){
        logger.debug("print the information");
        return String.format("Spent %d hours out of %d planned hours in %s of Computer Vision Homework",
                this.timeSpent, this.timePlanned, this.name);
    }

    public boolean equals(Object w){
        if (w instanceof CVHomework) {
            CVHomework w1 = (CVHomework) w;
            return this.name.equals(w1.getName());
        }
        return false;
    }
}
