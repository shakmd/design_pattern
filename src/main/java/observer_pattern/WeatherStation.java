package observer_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WeatherStation implements IObservable {
    private List<IObserver> memberList;

    public WeatherStation(Set<IObserver> memberSet) {
        this.memberList = new ArrayList<>();
    }

    @Override
    public void addMember(IObserver observer) {
        this.memberList.add(observer);
    }

    @Override
    public void removeMember(IObserver observer) {
        this.memberList.remove(observer);
    }

    @Override
    public void notifyMember() {
        for (IObserver observer : this.memberList) {
            observer.update(this.getInfo());
        }
    }

    //In some of the version of Observer pattern, this method is public and
    //the observer call this method of concrete Observable to get the info in their update() method
    private int getInfo() {
        return 1;
    }
}
