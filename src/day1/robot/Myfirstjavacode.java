package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Myfirstjavacode {
public static void main(String[] args) {
	Robot puttputt=new Robot();
	puttputt.setSpeed(1000);
	puttputt.penDown();
	puttputt.setPenColor(000,000,300);
	puttputt.sparkle();
	puttputt.hide();
	for (int i=0; i<100;i++){
		puttputt.move(400);
		puttputt.turn(270);
		puttputt.clear();
		
	}
	//puttputt.move(400);
	//puttputt.turn(270);
	//puttputt.move(400);
	//puttputt.turn(270);
	//puttputt.move(400);
	//puttputt.turn(270);
	//puttputt.move(400);
	
}
}
