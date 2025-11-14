package LowLevelDesign.ParkingLot;

import java.time.Duration;
import java.time.LocalDateTime;

class Payment {
	
	private double amount;
	private LocalDateTime exitTime;

	public Payment() {
		this.exitTime = LocalDateTime.now();
	}

	public double calculateFee(Ticket ticket) {
		long hours = Duration.between(ticket.getEntryTime(), exitTime).toHours();
		if (hours == 0)
			hours = 1; // Minimum charge for 1 hour

		switch (ticket.getVehicle().getType()) {
		case BIKE:
			amount = hours * 10;
			break;
		case CAR:
			amount = hours * 20;
			break;
		case TRUCK:
			amount = hours * 30;
			break;
		}
		return amount;
	}

	public double getAmount() {
		return amount;
	}
	
}
