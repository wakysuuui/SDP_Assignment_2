public class CleaningRobotFactory extends RobotFactory{

    @Override
    public IRobot createRobot(){
        return new CleaningRobot();
    }
}