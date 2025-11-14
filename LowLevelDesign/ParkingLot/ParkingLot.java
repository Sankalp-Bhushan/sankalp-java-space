package LowLevelDesign.ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class ParkingLot {
	
	private List<ParkingFloor> floors;
	private List<EntryGate> entryGates;
	private List<ExitGate> exitGates;

	public ParkingLot() {
		this.floors = new ArrayList<>();
		this.entryGates = new ArrayList<>();
		this.exitGates = new ArrayList<>();
	}

	public void addFloor(ParkingFloor floor) {
		floors.add(floor);
	}

	public void addEntryGate(EntryGate gate) {
		entryGates.add(gate);
	}

	public void addExitGate(ExitGate gate) {
		exitGates.add(gate);
	}

	public Ticket parkVehicle(Vehicle vehicle) {
		for (ParkingFloor floor : floors) {
			ParkingSpot freeSpot = floor.getFreeSpot(vehicle.getType());
			if (freeSpot != null) {
				freeSpot.parkVehicle(vehicle);
				String ticketId = UUID.randomUUID().toString();
				return new Ticket(ticketId, freeSpot, vehicle);
			}
		}
		System.out.println("No parking available for vehicle: " + vehicle.getLicenseNumber());
		return null;
	}

	public double unparkVehicle(Ticket ticket) {
		ParkingSpot spot = ticket.getSpot();
		spot.unparkVehicle();
		Payment payment = new Payment();
		double fee = payment.calculateFee(ticket);
		System.out.println("Vehicle " + ticket.getVehicle().getLicenseNumber() + " unparked. Fee: ₹" + fee);
		return fee;
	}
	
}