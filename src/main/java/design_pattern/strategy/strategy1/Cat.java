package design_pattern.strategy.strategy1;

import design_pattern.strategy.strategy1.behaviour.EatBehaviour;
import design_pattern.strategy.strategy1.behaviour.SpeakBehaviour;

public class Cat implements Animal {
    private SpeakBehaviour speakBehaviour;
    private EatBehaviour eatBehaviour;

    public Cat(SpeakBehaviour speakBehaviour, EatBehaviour eatBehaviour) {
        this.speakBehaviour = speakBehaviour;
        this.eatBehaviour = eatBehaviour;
    }

    @Override
    public void speak() {
        this.speakBehaviour.speak();
    }

    @Override
    public void eat() {
        this.eatBehaviour.eat();
    }
}
