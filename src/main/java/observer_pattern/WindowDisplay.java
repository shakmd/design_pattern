package observer_pattern;

import java.util.Observer;

public class WindowDisplay implements IObserver {
    @Override
    public void update(int n) {
        //The argument to this method could be anything.
        //int n is for demonstrating that Observable can pass on some info to observer

        //There are some other variation too where arguments to this method is empty and
        //this method will fetch the info from the concrete observable
    }
}
