• Design a flight booking system with email + notifications:
• Notification at booking
• Reminders at 72 hrs, 24 hrs, and 4 hrs before journey
• Configurable notification service with database-driven scheduled intervals
 
FlightBookingSystem/
 ├── Main.java
 ├── model/
 │    ├── Flight.java
 │    ├── Passenger.java
 │    ├── Booking.java
 ├── notification/
 │    ├── Notification.java
 │    ├── NotificationType.java
 │    ├── NotificationService.java
 │    ├── NotificationScheduler.java
 │    ├── NotificationConfig.java
 ├── service/
 │    ├── FlightService.java
 │    ├── BookingService.java

 
Flight
 ├── flightId
 ├── origin
 ├── destination
 ├── departureTime (ZonedDateTime)
 └── arrivalTime

Passenger
 ├── passengerId
 ├── name
 ├── email
 └── phone

Booking
 ├── bookingId
 ├── flight (Flight)
 ├── passenger (Passenger)
 ├── bookingTime (ZonedDateTime)
 ├── status (CONFIRMED, CANCELLED)
 └── List<NotificationEvent> (optional backref)

NotificationConfig
 ├── id
 ├── name (e.g., “REMINDER_72H”)
 ├── offsetMinutes (e.g., 4320 for 72h)
 ├── enabledChannels (EMAIL,SMS)
 ├── enabled (bool)

NotificationEvent
 ├── eventId
 ├── bookingId
 ├── passengerId
 ├── sendTime (ZonedDateTime)
 ├── channel (EMAIL, SMS)
 ├── type (BOOKING_CONFIRMATION, REMINDER)
 ├── status (PENDING, SENT, FAILED)
 ├── attempts
 └── lastAttemptTime

NotificationPayload (value object)
 ├── subject
 ├── body
 └── templateVariables
