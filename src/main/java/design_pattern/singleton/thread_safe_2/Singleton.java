package design_pattern.singleton.thread_safe_2;

public class Singleton {
    //This line makes sure that JVM will create the instance of this class
    //even before any threads can access the getInstance() method.
    //But the only problem with this approach is that it does not follow LazyEvaluation which
    //means if creation of this object is costly and never used, we have wasted computing power
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    private static Singleton getInstance() {
        return uniqueInstance;
    }
}
