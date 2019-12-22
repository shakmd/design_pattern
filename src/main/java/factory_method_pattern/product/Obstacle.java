/*
Summary:
Factory Method Pattern(FMP) is used when the process of creation of objects is
so complicated that we defer that process to some other class

The second use case can be extended from first when we want to apply polymorphism.
That there could be multiple implementation of the method/class that create our desired object

Third and least important use case could be when that throughout our code, we repeat a piece of logic to create object
multiple times(across different class). Better thing would be do code re-use and put it in a method of a different class


Among all the three, second use case is the most important one
########################################

In this example project, imaging we are designing a game where a random obstacle comes up
on the screen and player shoots it up
 */

package factory_method_pattern.product;

/***
 * This interface just represent an obstacle that could appear in the screen of the player
 * It has method to get information to be displayed in the screen
 */
public interface Obstacle {
    public int getStrength();

    public int getPosition();
}
