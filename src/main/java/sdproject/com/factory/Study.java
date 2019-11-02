package sdproject.com.factory;

import sdproject.com.Homework.Homework;

public abstract class Study {

    public Homework createAndDoHomework(int work) {
        Homework hw = createHomework();
        hw.doHW(work);
        return hw;
    }

    public abstract Homework createHomework();

//    public abstract void doHomework(int work);

//    public abstract void checkStatus();
}
