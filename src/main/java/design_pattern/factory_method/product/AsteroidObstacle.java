package design_pattern.factory_method.product;

public class AsteroidObstacle implements Obstacle {
    private int strength;
    private int position;

    public AsteroidObstacle(int strength, int position) {
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
