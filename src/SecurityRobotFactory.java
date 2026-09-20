public class SecurityRobotFactory extends RobotFactory{
    @Override
    public IRobot createRobot(){
        return new SecurityRobot();
    }
}