package LowLevelDesign.ParkingLot;

class ParkingSpot {
	private String id;
	private boolean isFree;
	private VehicleType type;
	private Vehicle parkedVehicle;

	public ParkingSpot(String id, VehicleType type) {
		this.id = id;
		this.type = type;
		this.isFree = true;
	}

	public boolean isFree() {
		return isFree;
	}

	public void parkVehicle(Vehicle vehicle) {
		this.parkedVehicle = vehicle;
		this.isFree = false;
	}

	public void unparkVehicle() {
		this.parkedVehicle = null;
		this.isFree = true;
	}

	public VehicleType getType() {
		return type;
	}

	public Vehicle getParkedVehicle() {
		return parkedVehicle;
	}

	public String getId() {
		return id;
	}
}
