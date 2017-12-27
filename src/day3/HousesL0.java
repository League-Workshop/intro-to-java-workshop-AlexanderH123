package day2;

import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

public class HousesL0 {
	Robot r = new Robot();
	Random rnd = new Random();
	
	void go() {
		r.setX(50);
		r.setY(550);
		r.setSpeed(100);
		r.setPenWidth(5);
		
		for(int i = 0; i < 10; i++) {
			drawHouse(rnd.nextInt(401) + 100);
		}
		
		r.setWindowColor(0, 0, 50);
		
		stars(25);
	}
	
	void drawHouse(int height) {
		r.setPenColor(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
		r.penDown();
		r.setAngle(0);
		r.move(height);
		
		if(height > 250) {
			r.turn(90);
			r.move(40);
			r.turn(90);
		}
		else {
			r.turn(45);
			r.move(25);
			r.turn(90);
			r.move(25);
			r.turn(45);
		}
		
		r.move(height);
		r.turn(-90);
		r.setPenColor(0,125,0);
		r.move(40);
		r.penUp();
	}
	
	void stars(int repeat) {
		for(int i = 0; i < repeat; i++) {
			r.penUp();
			r.setPenColor(255,255,255);
			r.penDown();
			r.move(1);
			r.moveTo(rnd.nextInt(800),rnd.nextInt(550));
		}
	}
	
	public static void main(String[] args) {
		new HousesL0().go();
	}
}
