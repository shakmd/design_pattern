package design_pattern.strategy.strategy2.behaviour;

public class CanSpeakBehaviour implements AnimalBehaviour {
    @Override
    public void execute() {
        System.out.println("speaking!");
    }
}
