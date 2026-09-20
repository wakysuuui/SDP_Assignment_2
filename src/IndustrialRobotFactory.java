public class IndustrialRobotFactory implements IRobotFactory{
    public IRobotBody createBody(){
        return new IndustrialRobotBody();
    }
    public IRobotAI createAI(){
        return new IndustrialRobotAI();
    }
}