package observer_pattern;

public interface IObservable {
    public void addMember(IObserver observer);

    public void removeMember(IObserver observer);

    public void notifyMember();
}
