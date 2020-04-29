package SchedulerTask;

import java.util.TimerTask;

public class ScheduledTimer extends TimerTask {

	@Override
	public void run() {
		RobotOperation.mouseClick();
		//RobotOperation.KeyPress();
		System.out.println("mouse click event is triggered");
	}

}
