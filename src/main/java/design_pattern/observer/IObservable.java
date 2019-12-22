package design_pattern.observer;

public interface IObservable {
    public void addMember(IObserver observer);

    public void removeMember(IObserver observer);

    public void notifyMember();
}
