package design_pattern.strategy.strategy1.behaviour;

public class FastEatBehaviour implements EatBehaviour {
    @Override
    public void eat() {
        System.out.println("eating quickly");
    }
}
