package LowLevelDesign.FlightBookingSystem.notification;

import java.time.LocalDateTime;
import java.util.*;

import LowLevelDesign.FlightBookingSystem.model.Booking;

public class NotificationScheduler {

	private NotificationConfig config;
	private NotificationService notificationService;
	private Timer timer;

	public NotificationScheduler(NotificationConfig config, NotificationService notificationService) {
		this.config = config;
		this.notificationService = notificationService;
		this.timer = new Timer();
	}

	public void scheduleNotifications(Booking booking) {
		// Send booking confirmation immediately
		Notification confirmation = new Notification(NotificationType.BOOKING_CONFIRMATION, LocalDateTime.now(),
				booking);
		notificationService.sendNotification(confirmation);

		// Schedule reminders
		for (int hrs : config.getReminderHours()) {
			LocalDateTime reminderTime = booking.getFlight().getDepartureTime().minusHours(hrs);
			scheduleReminder(booking, reminderTime, hrs);
		}
	}

	private void scheduleReminder(Booking booking, LocalDateTime reminderTime, int hrsBefore) {
		long delay = java.time.Duration.between(LocalDateTime.now(), reminderTime).toMillis();
		if (delay < 0)
			return; // skip if flight is too soon

		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				Notification reminder = new Notification(NotificationType.REMINDER, reminderTime, booking);
				System.out.println("[REMINDER] " + hrsBefore + " hrs before flight:");
				notificationService.sendNotification(reminder);
			}
		}, delay);
	}
}
