import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
 
public class Climber extends Athlete		      
{
   public Climber()
   {
      super();
   }
   public Climber(int x)
   {
      super(x, 1, Display.NORTH, 1);
   }
   public void climbUpRight() 
   {
      turnLeft();
      move();
      move();
      turnRight();
      move();
   }
   public void climbUpLeft()
   {
      turnRight();
      move();
      move();
      turnLeft();
      move();
   }
   public void climbDownLeft()
   {
      turnLeft();
      move();
      move();
      turnRight();
      move();
   }
   public void climbDownRight()
   {
      turnRight();
      move();
      turnRight();
      move();
      move();
   }
   
}