package design_pattern.decorator;

public class Decaf implements Beverage {
    @Override
    public int cost() {
        return 10; //10 is the cost of decaf
    }
}
