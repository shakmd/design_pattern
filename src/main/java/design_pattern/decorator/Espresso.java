package design_pattern.decorator;

public class Espresso implements Beverage {
    @Override
    public int cost() {
        return 15; //15 is the cost of Espresso
    }
}
