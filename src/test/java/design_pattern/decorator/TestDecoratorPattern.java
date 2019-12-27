package design_pattern.decorator;

import org.junit.Test;
import org.junit.Assert;

public class TestDecoratorPattern {
    @Test
    public void testBeverageCost() {
        //Waiter: Place order-> Decaf or Espresso
        //Customer: Umm, a Decaf
        Beverage beverage = new Decaf();

        //Waiter: Do you like to have any add ons
        //Customer: Sure, add chocolate
        beverage = new ChocolateAddOn(beverage);

        //Waiter: Anything else
        //Customer: Umm, add another chocolate
        beverage = new ChocolateAddOn(beverage);

        //Customer: You know, what, add caramel too
        //Waiter: Sure
        beverage = new CaramelAddOn(beverage);

        //Waiter: Your total bill is

        Assert.assertEquals( 22, beverage.cost());
    }
}
