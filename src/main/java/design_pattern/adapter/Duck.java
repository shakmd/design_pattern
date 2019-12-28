package design_pattern.adapter;

/*
Let us assume that client is only aware of this interface, can call its method and very difficult to change
Client wants to use the same interface to call methods of object of WildTurkey
 */
public interface Duck {
    public void quack();

    public void fly();
}
