package SchedulerTask;

import java.util.Timer;

public class AppMain {

	public static void main(String[] args) {

		Timer time = new Timer(); // Instantiate Timer Object
		ScheduledTimer st = new ScheduledTimer(); // Instantiate SheduledTask class
		time.schedule(st, 0, 1000);
		//System.out.println("hshshshs");
	}

}
