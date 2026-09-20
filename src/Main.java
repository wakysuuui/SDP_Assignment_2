public class Main{
    public static void main(String[] args){
        RobotFactory factory = new CleaningRobotFactory();
        IRobot robot = factory.createRobot();
        robot.move();

        System.out.println("---");

        IRobotFactory home = new HomeRobotFactory();
        home.createBody().build();
        home.createAI().start();

        System.out.println("---");

        IRobotFactory industrial = new IndustrialRobotFactory();
        industrial.createBody().build();
        industrial.createAI().start();
    }
}