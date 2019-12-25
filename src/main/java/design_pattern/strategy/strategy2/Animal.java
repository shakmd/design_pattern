package design_pattern.strategy.strategy2;

import design_pattern.strategy.strategy2.behaviour.AnimalBehaviour;

public class Animal {
    private AnimalBehaviour speakBehaviour;
    private AnimalBehaviour eatBehaviour;

    public Animal(AnimalBehaviour speakBehaviour, AnimalBehaviour eatBehaviour) {
        this.speakBehaviour = speakBehaviour;
        this.eatBehaviour = eatBehaviour;
    }

    public void speak() {
        this.speakBehaviour.execute();
    }

    public void eat() {
        this.eatBehaviour.execute();
    }
}
