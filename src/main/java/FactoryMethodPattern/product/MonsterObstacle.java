package FactoryMethodPattern.product;

public class MonsterObstacle implements Obstacle {
    private int strength;
    private int position;

    public MonsterObstacle(int strength, int position) {
        this.strength = strength;
        this.position = position;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getPosition() {
        return position;

    }
}
