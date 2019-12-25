package design_pattern.strategy.strategy1.behaviour;

public class SlowEatBehaviour implements EatBehaviour {
    @Override
    public void eat() {
        System.out.println("eating slowly");
    }
}
