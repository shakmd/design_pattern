package observer_pattern;

public interface IObserver {
    //This sample example shows that observer needs to be updated with some value
    //There are multiple version of Observer pattern
    //In one version, there is no argument to update() and it fetches data from the observable by calling some method on it
    public void update(int n);
}
