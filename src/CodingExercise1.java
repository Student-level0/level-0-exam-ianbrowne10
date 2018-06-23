import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
Robot rob = new Robot();
    rob.setPenWidth(10);
  rob.penDown();
   rob.setSpeed(10);
 rob.hide();
   String color = JOptionPane.showInputDialog("What color do you want");
    		if(color.equalsIgnoreCase("green")) {
    		rob.setPenColor(0, 250, 0);
    		}
    		else if (color.equalsIgnoreCase("blue")) {
        		rob.setPenColor(0, 0, 250);
        		}
    		else {
    			rob.setRandomPenColor();
    		}
    		for(int i = 0; i < 4; i++) {
    			rob.move(100);
    		rob.turn(90);
    		}

    		// 3. ask the user what color they would like the Robot to draw

   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)

   	 // 2. set the pen width to 10

		// 1. make the Robot draw a shape

	}

}
