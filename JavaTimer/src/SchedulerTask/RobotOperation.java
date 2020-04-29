package SchedulerTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotOperation {

	public static void mouseClick() {
		try {
			Robot robot = new Robot();

			// Simulate a mouse click
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);


		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public static void KeyPress() {
		try {
			Robot robot = new Robot();

			// Simulate a key press
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);

		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}
