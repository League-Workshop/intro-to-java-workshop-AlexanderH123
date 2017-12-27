package day2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
<<<<<<< HEAD
	// 2. Create a new Robot
	Robot c3po = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		c3po.setSpeed(500);
		// 5. Set the pen width to 5
		c3po.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {
		c3po.setRandomPenColor();
		
		
		// 7. Set the pen color to random
	
		drawSquare();
		c3po.turn(90);
		// 8. Turn the robot 90 degrees to the right
		}
=======
	Robot r = new Robot();

	void go() {
		r.setSpeed(200);
		r.setPenWidth(5);
		
		for(int i = 0; i < 4; i++) {
			r.setRandomPenColor();
			drawSquare();
			r.turn(90);
		}

>>>>>>> origin/master
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		for (int i = 0; i < 4; i++) {
		c3po.setRandomPenColor();
		c3po.penDown();
		c3po.move(200);
		c3po.turn(90);
		}
		
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		
		r.penDown();
		for(int i = 0; i < 4; i++) {
			r.move(200);
			r.turn(90);
		}
		r.penUp();
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



