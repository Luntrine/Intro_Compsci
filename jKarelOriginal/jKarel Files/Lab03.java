import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/mountain.map");
      Display.setSize(16,16);
      Display.setSpeed(1);
      
      Climber joe = new Climber(8);
      
      joe.turnRight();
      joe.move();
      joe.climbUpRight();
      joe.climbUpRight();
      joe.climbUpRight();
      joe.turnLeft();
      joe.climbDownRight();
      joe.turnAround();
      joe.climbDownRight();
      joe.pickBeeper();
      joe.turnRight();
      joe.climbUpLeft();
      joe.climbUpLeft();
      joe.move();
      joe.climbDownLeft();
      joe.climbDownLeft();
      joe.climbDownLeft();
      
   }
}