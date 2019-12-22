package design_pattern.factory_method.creator;

import design_pattern.factory_method.product.MonsterObstacle;
import design_pattern.factory_method.product.Obstacle;

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
