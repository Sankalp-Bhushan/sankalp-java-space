package LowLevelDesign.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ParkingFloor {
	
	private int floorNumber;
	private Map<VehicleType, List<ParkingSpot>> parkingSpots;

	public ParkingFloor(int floorNumber) {
		this.floorNumber = floorNumber;
		this.parkingSpots = new HashMap<>();
		for (VehicleType type : VehicleType.values()) {
			parkingSpots.put(type, new ArrayList<>());
		}
	}

	public void addParkingSpot(ParkingSpot spot) {
		parkingSpots.get(spot.getType()).add(spot);
	}

	public ParkingSpot getFreeSpot(VehicleType type) {
		for (ParkingSpot spot : parkingSpots.get(type)) {
			if (spot.isFree())
				return spot;
		}
		return null;
	}

	public int getFloorNumber() {
		return floorNumber;
	}
}