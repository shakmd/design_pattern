package design_pattern.singleton.thread_safe_expensive;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    //Adding keyword synchronized-> only one thread be executing any piece of code of this method at any given point of time
    //It is highly expensive as even after the creation of singleton object(now the if statement can never return true),
    //a thread needs to wait
    private static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
