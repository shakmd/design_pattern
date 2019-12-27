package design_pattern.decorator;

public class CaramelAddOn implements AddOns {
    private Beverage beverage;

    public CaramelAddOn(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        //Here is the problem, different impl of AddOns have the same behaviour(addition) but with just different numbers
        //Had different impl have different behaviour(like '-' or '*') it would have made more sense to use Decorator Pattern
        return 2 + this.beverage.cost();
    }
}
