package design_pattern.strategy.strategy2;

import design_pattern.strategy.strategy2.behaviour.AnimalBehaviour;

public class Cat extends Animal {
    public Cat(AnimalBehaviour speakBehaviour, AnimalBehaviour eatBehaviour) {
        super(speakBehaviour, eatBehaviour);
    }
}
