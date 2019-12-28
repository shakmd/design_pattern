package design_pattern.adapter;

import org.junit.Test;

public class TestAdapter {
    @Test
    public void testTurkeyAdapter() {
        Duck turkeyAdapter = new TurkeyAdapter(new WildTurkey());

        //As a client I want to use Duck(or Target) interface to call method on object of WildTurkey(Adaptee) class
        //The adapter class helps us to use the duck interface
        turkeyAdapter.quack(); //Internally, gobble() gets called

        turkeyAdapter.fly(); //Internally, jump gets() called
    }
}
