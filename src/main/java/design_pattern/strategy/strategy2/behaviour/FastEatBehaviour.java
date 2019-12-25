package design_pattern.strategy.strategy2.behaviour;

public class FastEatBehaviour implements AnimalBehaviour {
    @Override
    public void execute() {
        System.out.println("eating quickly");
    }
}
