package LowLevelDesign.FlightBookingSystem;

import java.time.LocalDateTime;
import java.util.Arrays;

import LowLevelDesign.FlightBookingSystem.model.Flight;
import LowLevelDesign.FlightBookingSystem.model.Passenger;
import LowLevelDesign.FlightBookingSystem.notification.NotificationConfig;
import LowLevelDesign.FlightBookingSystem.service.BookingService;

public class Main {
	
	public static void main(String[] args) {
		// Notification intervals (configurable)
		NotificationConfig config = new NotificationConfig(Arrays.asList(72, 24, 4));

		// Create flight and passenger
		Flight flight = new Flight("AI-202", "Delhi", "Bangalore", LocalDateTime.now().plusHours(80));
		Passenger passenger = new Passenger("Sankalp", "sankalp@example.com");

		// Book flight
		BookingService bookingService = new BookingService(config);
		bookingService.bookFlight("B001", flight, passenger);
	}
	
}
