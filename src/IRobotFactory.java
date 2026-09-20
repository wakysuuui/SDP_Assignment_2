public interface IRobotFactory{
    IRobotBody createBody();
    IRobotAI createAI();
}