package design_pattern.strategy.strategy1;

/*
NOTE: If we are using strategy pattern, it is not necessary that we have interface like Animal
We could have a class too which other classes can inherit. Point to note is
that appropriate "behaviour" is Injected while constructing objects
(Please see strategy2 package)
 */
public interface Animal {
    public void speak();

    public void eat();
}
