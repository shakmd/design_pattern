package design_pattern.adapter;

public class TurkeyAdapter implements Duck {
    //As per the actual patter, adapter has a relationship with the concrete class but
    //I don't foresee any harm in using has a relationship with interface as long as
    //we are correctly using dependency injection
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        this.turkey.jump();
    }
}
