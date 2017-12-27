package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		Robot r = new Robot();
		
<<<<<<< HEAD
		// START HERE
	Robot c3po = new Robot();
	c3po.setSpeed(500);
	c3po.move(180);
	c3po.setAngle(45);
	c3po.move(90);
	c3po.setAngle
=======
		int angle = 45;
		r.setSpeed(20);
		r.penDown();
		
		while(true) {
			for(int i = 0; i < 8;) {
				r.move(100);
				r.turn(angle);
				i++;
			}
			angle = -angle;
		}
>>>>>>> origin/master
	}
}
