package design_pattern.singleton.thread_safe_1;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    private static Singleton getInstance() {
        if (uniqueInstance == null) {
            //This if block was the piece of code that could have lead to creation of more than object
            //So we put synchronized here which means that once the object gets created, we will never reach here
            //So, we are not blocking threads unnecessary
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
