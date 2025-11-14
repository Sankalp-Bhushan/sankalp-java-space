package LowLevelDesign.FlightBookingSystem.notification;

import java.time.LocalDateTime;
import LowLevelDesign.FlightBookingSystem.model.Booking;

public class Notification {

	private NotificationType type;
	private LocalDateTime sendTime;
	private Booking booking;

	public Notification(NotificationType type, LocalDateTime sendTime, Booking booking) {
		this.type = type;
		this.sendTime = sendTime;
		this.booking = booking;
	}

	public NotificationType getType() {
		return type;
	}

	public LocalDateTime getSendTime() {
		return sendTime;
	}

	public Booking getBooking() {
		return booking;
	}

}
