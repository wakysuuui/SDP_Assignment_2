public class HomeRobotFactory implements IRobotFactory{
    public IRobotBody createBody(){
        return new HomeRobotBody();
    }
    public IRobotAI createAI(){
        return new HomeRobotAI();
    }
}