package day2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
    		Robot c3po = new Robot();

        // 3. Put the robot's pen down
    		c3po.penDown();

        // 6. Make the robot move as fast as possible
    		c3po.setSpeed(200);

        // 5. Do everything below here 4 times
    		for (int i = 0; i < 4; i++) {

        // 2. Move your robot 200 pixels
    		c3po.move(200);

        // 4. Turn the robot 90 degrees to the right
    		c3po.turn(90);
    	
    		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
    }
    }
}