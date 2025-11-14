package LowLevelDesign.FlightBookingSystem.notification;

import java.util.List;

public class NotificationConfig {
	
	private List<Integer> reminderHours; // e.g. 72, 24, 4

	public NotificationConfig(List<Integer> reminderHours) {
		this.reminderHours = reminderHours;
	}

	public List<Integer> getReminderHours() {
		return reminderHours;
	}
	
}
