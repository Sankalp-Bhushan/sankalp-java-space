package LowLevelDesign.FlightBookingSystem.notification;

import LowLevelDesign.FlightBookingSystem.model.Booking;

public class NotificationService {

	public void sendNotification(Notification notification) {
		Booking booking = notification.getBooking();
		System.out.println("[EMAIL SENT] To: " + booking.getPassenger().getEmail());
		if (notification.getType() == NotificationType.BOOKING_CONFIRMATION) {
			System.out.println("Subject: Booking Confirmed for Flight " + booking.getFlight().getFlightId());
			System.out.println("Body: Dear " + booking.getPassenger().getName() + ", your flight from "
					+ booking.getFlight().getOrigin() + " to " + booking.getFlight().getDestination()
					+ " is confirmed.\n");
		} else {
			System.out.println("Subject: Flight Reminder");
			System.out.println("Body: Dear " + booking.getPassenger().getName()
					+ ", reminder for your upcoming flight at " + booking.getFlight().getDepartureTime() + "\n");
		}
	}
}
