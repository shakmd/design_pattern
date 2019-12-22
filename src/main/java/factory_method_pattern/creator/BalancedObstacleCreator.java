package factory_method_pattern.creator;

import factory_method_pattern.product.MonsterObstacle;
import factory_method_pattern.product.Obstacle;

public class BalancedObstacleCreator implements ObstacleCreator {
    /***
     * This method create obstacle in a balanced way. The count of each kind of obstacle
     * appearing on the screen would be as close as possible
     *
     * @param difficultyLevel
     * @param currentStage
     * @return
     */
    @Override
    public Obstacle createObstacle(int difficultyLevel, int currentStage) {
        //This implementation is dummy -> as it is not a real code but just to show Design Pattern
        return new MonsterObstacle(10, 75);
    }
}
