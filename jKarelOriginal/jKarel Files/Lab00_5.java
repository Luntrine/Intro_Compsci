// Bob Smith October 1, 2019
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab00_5
{
   public static void main(String[] args)
   {
   
   Robot lisa = new Robot(7, 7, Display.SOUTH, 15);

      Display.openWorld("maps/first.map");
      Display.setSize(10,10);
      Display.setSpeed(1);
      
      Robot martha = new Robot(1, 2, Display.NORTH, 1);
      Robot george = new Robot(1, 7, Display.EAST, 0);
   
      martha.move();
      /*   
      
      martha.move();
      martha.move();
      martha.move();
      martha.move();
      martha.putBeeper();
      george.pickBeeper();
   */
   
   
      
    /*  
      Robot karel = new Robot();
      
      karel.move();
      karel.pickBeeper();
      karel.move();
      karel.turnLeft();
      karel.move();
      karel.putBeeper();
      karel.move();
      karel.turnLeft();
      karel.turnLeft();
      
      karel.move();
      karel.pickBeeper(); // makes the beeper go into your inventory, provided you are on the same space as it
      karel.move();   // turnLeft
      karel.turnLeft();
      karel.turnLeft();
      karel.turnLeft();
      karel.move();   // turnLeft
      karel.putBeeper(); // makes the beeper go out of your inventory, and placed on the space you are currently on. You can only place the one you have in your inventory. (There can only be one at a time)
   
      karel.move();
      karel.turnLeft();
      karel.turnLeft();
      
      karel.move();
      karel.pickBeeper();
      karel.move();
      karel.turnLeft();
      karel.move();
      karel.move();
      karel.move();
      karel.putBeeper();
      karel.move();
      karel.move();
      karel.move();
      karel.move();
      */
   
   }
}