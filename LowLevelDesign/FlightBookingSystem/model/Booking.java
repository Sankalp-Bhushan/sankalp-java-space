package LowLevelDesign.FlightBookingSystem.model;

import java.time.LocalDateTime;

public class Booking {
	
	private String bookingId;
	private Flight flight;
	private Passenger passenger;
	private LocalDateTime bookingTime;

	public Booking(String bookingId, Flight flight, Passenger passenger) {
		this.bookingId = bookingId;
		this.flight = flight;
		this.passenger = passenger;
		this.bookingTime = LocalDateTime.now();
	}

	public String getBookingId() {
		return bookingId;
	}

	public Flight getFlight() {
		return flight;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public LocalDateTime getBookingTime() {
		return bookingTime;
	}
	
}
