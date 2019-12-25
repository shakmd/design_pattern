package design_pattern.strategy.strategy2.behaviour;

public class SlowEatBehaviour implements AnimalBehaviour {
    @Override
    public void execute() {
        System.out.println("eating slowly");
    }
}
