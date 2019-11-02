package sdproject.com.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sdproject.com.Homework.Homework;
import sdproject.com.factory.CVStudy;
import sdproject.com.factory.PersonalityStudy;
import sdproject.com.factory.Study;

import java.util.Scanner;

public class DoHomework {
    final static Logger logger = LogManager.getLogger(DoHomework.class);

    private static Study study;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        configure(scanner);
        runBusinessLogic(scanner);
        scanner.close();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or environment options.
     * Here, I used an input requirements but not a configuration.
     */
    static void configure(Scanner scanner) {
        System.out.println("Which course's homework you\'d like to do? ");
        String input = scanner.next();
        if (input.equals("CV")){
            logger.info(String.format("Study cv"));
            study = new CVStudy();
        } else if (input.equals("Personality")) {
            logger.info(String.format("Study personality"));
            study = new PersonalityStudy();
        } else {
            logger.error("Wrong input type");
        }
    }

    static void runBusinessLogic(Scanner scanner) {
        System.out.println("How much effort you put on it? ");
        int cost = scanner.nextInt();
        Homework homework = study.createAndDoHomework(cost);
        System.out.println(homework);
        for (int i=0; i < 3; i++) {
            cost = scanner.nextInt();
            homework.doHW(cost);
            System.out.println(homework);
        }
    }
}
