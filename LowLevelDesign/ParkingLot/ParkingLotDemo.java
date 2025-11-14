package LowLevelDesign.ParkingLot;

public class ParkingLotDemo {

	public static void main(String[] args) throws InterruptedException {
		ParkingLot lot = new ParkingLot();

		ParkingFloor floor1 = new ParkingFloor(1);
		floor1.addParkingSpot(new ParkingSpot("C1", VehicleType.CAR));
		floor1.addParkingSpot(new ParkingSpot("B1", VehicleType.BIKE));
		lot.addFloor(floor1);

		lot.addEntryGate(new EntryGate(1));
		lot.addExitGate(new ExitGate(1));

		Vehicle car = new Car("DL01AB1234");
		Ticket ticket = lot.parkVehicle(car);

		// simulate some parking time
		Thread.sleep(2000);

		lot.unparkVehicle(ticket);
	}

}