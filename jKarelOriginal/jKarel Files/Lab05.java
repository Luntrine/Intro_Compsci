import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05
{
   public static void takeTheField(Athlete arg)
   {
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
   }
   public static void main(String[] args)
   {
      Display.openWorld("maps/arena.map");
      Display.setSize(10,10);
      Display.setSpeed(10);
      
      int imlazy;
   
      Athlete aaron = new Athlete();
      Athlete jack = new Athlete();
      Athlete edward = new Athlete();
      Athlete changle = new Athlete();
      Athlete liberty = new Athlete();
      Athlete ramon = new Athlete();
      Athlete lucca = new Athlete(9, 9, Display.SOUTH, 0);
      
      //aaron moves to the far right
      
      takeTheField(aaron);
      
      for(imlazy=1; imlazy<=7; imlazy++)
      {
         aaron.move();
      }
      
      aaron.turnLeft();
      aaron.move();
      aaron.turnAround();
      
      //jack moves to the right
      
      takeTheField(jack);
      
      for(imlazy=1; imlazy<=6; imlazy++)
      {
         jack.move();
      }
      
      jack.turnRight();
      
      //edward moves to the middle back
      
      takeTheField(edward);
      
      for(imlazy=1; imlazy<=5; imlazy++)
      {
         edward.move();
      }
      
      edward.turnLeft();
      edward.move();
      edward.move();
      edward.turnAround();
      
      //changle moves to the middle front
      
      takeTheField(changle);
      
      for(imlazy=1; imlazy<=5; imlazy++)
      {
         changle.move();
      }
      
      changle.turnRight();
      
      //liberty moves to the left
      
      takeTheField(liberty);
      
      for(imlazy=1; imlazy<=4; imlazy++)
      {
         liberty.move();
      }
      
      liberty.turnRight();
      
      //ramon moves to the far right
      
      takeTheField(ramon);
      
      for(imlazy=1; imlazy<=3; imlazy++)
      {
         ramon.move();
      }
      
      ramon.turnLeft();
      ramon.move();
      ramon.turnAround();
   }
}