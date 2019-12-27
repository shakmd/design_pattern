# Decorator Pattern

This pattern is mainly used to add behaviour/functionality to existing objects dynamically(at run time)</br>


In this particular example, we are dealing with a Coffee House Application, where you can order beverages like Decaf and Espresso</br>
and you also have the option to add toppings to it like Caramel, Chocolate etc</br>

For calculating cost, we can use Decorator Pattern</br>
Beverage is an actual object which needs to be decorated</br>
AddOns/Toppings decorate the actual objects</br>

This might not be the best example of Decorator Pattern but we can see it in action(Please look at corresponding test)</br>

The two main reason why this might be the best example for Decorator Pattern are</br>
- Add Ons are actually not beverage but we are still treating it as beverage
- If you see different impl of AddOns, we will notice that there is no change in the impl of the cost method. It is just 'same behaviour(addition)' but with different numbers 