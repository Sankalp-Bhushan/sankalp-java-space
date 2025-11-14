package LowLevelDesign.ParkingLot;

abstract class Vehicle {
	private String licenseNumber;
	private VehicleType type;

	public Vehicle(String licenseNumber, VehicleType type) {
		this.licenseNumber = licenseNumber;
		this.type = type;
	}

	public VehicleType getType() {
		return type;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}
}