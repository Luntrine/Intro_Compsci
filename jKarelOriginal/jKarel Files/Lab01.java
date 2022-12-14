// Bob Smith October 3, 2019
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab01
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/school.map");
      Display.setSize(10,10);
      Display.setSpeed(1);
      
      Robot lisa = new Robot(1, 1, Display.EAST, 0);
      Robot pete = new Robot(4, 5, Display.SOUTH, 0);
      
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.move();
      
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.pickBeeper();
      
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.move();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.move();
      lisa.move();
      lisa.putBeeper();
      
      pete.pickBeeper();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.turnLeft();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.turnLeft();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.putBeeper();
      pete.turnLeft();
      pete.turnLeft();
      pete.move();
      
   }
}