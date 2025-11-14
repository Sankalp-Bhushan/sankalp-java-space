package LowLevelDesign.ParkingLot;

import java.time.LocalDateTime;

class Ticket {
	
    private String ticketId;
    private LocalDateTime entryTime;
    private ParkingSpot spot;
    private Vehicle vehicle;

    public Ticket(String ticketId, ParkingSpot spot, Vehicle vehicle) {
        this.ticketId = ticketId;
        this.spot = spot;
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now();
    }

    public String getTicketId() {
        return ticketId;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    
}