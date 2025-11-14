package LowLevelDesign.FlightBookingSystem.service;

import LowLevelDesign.FlightBookingSystem.model.Booking;
import LowLevelDesign.FlightBookingSystem.model.Flight;
import LowLevelDesign.FlightBookingSystem.model.Passenger;
import LowLevelDesign.FlightBookingSystem.notification.NotificationConfig;
import LowLevelDesign.FlightBookingSystem.notification.NotificationScheduler;
import LowLevelDesign.FlightBookingSystem.notification.NotificationService;

public class BookingService {

	private NotificationScheduler scheduler;

	public BookingService(NotificationConfig config) {
		this.scheduler = new NotificationScheduler(config, new NotificationService());
	}

	public Booking bookFlight(String bookingId, Flight flight, Passenger passenger) {
		Booking booking = new Booking(bookingId, flight, passenger);
		System.out.println("[BOOKING CREATED] " + bookingId + " for " + passenger.getName());
		scheduler.scheduleNotifications(booking);
		return booking;
	}
	
}
