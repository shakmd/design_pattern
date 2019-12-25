package design_pattern.strategy.strategy1.behaviour;

public class CanSpeakBehaviour implements SpeakBehaviour {
    @Override
    public void speak() {
        System.out.println("speaking!");
    }
}
