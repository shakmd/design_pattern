package design_pattern.strategy.strategy2;

import design_pattern.strategy.strategy2.behaviour.AnimalBehaviour;

public class Dog extends Animal {
    public Dog(AnimalBehaviour speakBehaviour, AnimalBehaviour eatBehaviour) {
        super(speakBehaviour, eatBehaviour);
    }
}
