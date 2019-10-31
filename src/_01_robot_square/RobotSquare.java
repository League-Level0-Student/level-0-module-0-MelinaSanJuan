package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.plaf.FontUIResource;

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot sofia = new Robot();

        // 3. Put the robot's pen down
sofia.penDown();

        // 6. Make the robot move as fast as possible
sofia.setSpeed(10);

        // 5. Do everything below here 4 time.
for(int i = 0; i <4; i++) {
sofia.move(200);
sofia.turn(90);}



        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right (90 degrees)


    }

	private static void move(int i) {
		// TODO Auto-generated method stub
		
	}
}
