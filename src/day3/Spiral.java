package day2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot c3po = new Robot();
		// 5. Set your robot's pen to the down position
		c3po.penDown();
		// 3. Set the robot to go at max speed (10)
		c3po.setSpeed(10);
		// 4. Do the following (steps 6-8) 75 times
		for (int i = 0; i < 75; i++) {
		// 7. Change the pen color to random
		c3po.setRandomPenColor();
		// 6. Move the robot 5 times the current line number you are drawing (5*i)
		c3po.move(5*i);
		// 2. Turn the robot 1/7 of 360 degrees to the right
		c3po.turn(51);
		// 8. Set the pen width to i
		
		
		}
	}
}
