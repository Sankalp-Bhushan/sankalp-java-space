package LowLevelDesign.FlightBookingSystem.model;

import java.time.LocalDateTime;

public class Flight {
	
	private String flightId;
	private String origin;
	private String destination;
	private LocalDateTime departureTime;

	public Flight(String flightId, String origin, String destination, LocalDateTime departureTime) {
		this.flightId = flightId;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
	}

	public String getFlightId() {
		return flightId;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	
}
