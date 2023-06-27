package IA1jun23;
import robocode.*;
//import java.awt.Color;
import java.util.Random;
import static robocode.util.Utils.normalRelativeAngleDegrees;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * R201549059 - a robot by (your name here)
 */
public class R201549059 extends Robot
{
	boolean haciaAdelante;


	public R201549059(){
		haciaAdelante = true;
		
	}
	/**
	 * run: R201549059's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			haciaAdelante = true;
			ahead(600);
			fire(1);
			turnGunRight(45);
			fire(1);
			turnGunRight(45);
			fire(1);;
			turnGunRight(45);
			fire(1);
			turnGunRight(45);
			fire(1);
			turnGunRight(45);
			fire(1);
			turnRight(45);
			fire(1);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		perseguirRobot(e.getDistance(), e.getBearing());
	}
	
	public void perseguirRobot(double distancia, double rumbo){
		if(distancia > 400) return;

		double giro = rumbo;
		
		if(giro < 0){
			giro = giro * -1;
			turnRight(giro);
			turnGunRight(giro);
		}else if(giro > 0){
			turnLeft(giro);
			turnGunLeft(giro);
		}		
		ahead(25);
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(350);
		turnLeft(180);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		if(haciaAdelante){
			back(100);
			turnLeft(80);
			ahead(200);
		}else {
			turnLeft(80);
			ahead(200);
		}
	}	
}

