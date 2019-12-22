package factory_method_pattern.creator;

import factory_method_pattern.product.AsteroidObstacle;
import factory_method_pattern.product.Obstacle;

public class RandomObstacleCreator implements ObstacleCreator {
    /***
     * This method create obstacle in a random way. Any type of obstacle can be
     * returned on calling this method
     *
     * @param difficultyLevel
     * @param currentStage
     * @return
     */
    @Override
    public Obstacle createObstacle(int difficultyLevel, int currentStage) {
        //This implementation is dummy -> as it is not a real code but just to show Design Pattern
        return new AsteroidObstacle(5, 100);
    }
}
