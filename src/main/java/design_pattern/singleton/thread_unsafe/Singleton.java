package design_pattern.singleton.thread_unsafe;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    //Major problem with this method is that it is possible to have TWO instance of this class if
    //two threads gets true for the below if statement
    private static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
