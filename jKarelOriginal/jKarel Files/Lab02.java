// Bob Smith October 6, 2019
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab02
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/objectivelybestmap.map");
      Display.setSize(10,10);
      Display.setSpeed(1);
      
      Athlete marvin = new Athlete();
       
      marvin.putAndMove();
      marvin.turnRight();
      marvin.putAndMove();
      marvin.putAndMove();
      marvin.putAndMove();
      marvin.putAndMove();
      marvin.turnLeft();
      marvin.putAndMove();
      marvin.putAndMove();
      marvin.putAndMove();
      marvin.putAndMove();
      marvin.turnRight();
      marvin.putAndMove();
      marvin.putAndMove();
      marvin.putAndMove();
      marvin.putAndMove();
      marvin.putAndMove();
      
   }
}