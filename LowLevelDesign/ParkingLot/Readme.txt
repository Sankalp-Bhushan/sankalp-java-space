ParkingLot
  ├── List<ParkingFloor>
  ├── List<EntryGate>
  ├── List<ExitGate>

ParkingFloor
  ├── floorNumber
  ├── Map<VehicleType, List<ParkingSpot>>

ParkingSpot
  ├── id
  ├── isFree
  ├── VehicleType type
  ├── Vehicle parkedVehicle

Vehicle (abstract)
  ├── licenseNumber
  ├── VehicleType type

Ticket
  ├── ticketId
  ├── entryTime
  ├── ParkingSpot spot
  ├── Vehicle vehicle

Payment
  ├── amount
  ├── exitTime
  ├── calculateFee()