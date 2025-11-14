-- flights
CREATE TABLE flights (
  id BIGINT PRIMARY KEY,
  flight_number VARCHAR(32),
  origin VARCHAR(10),
  destination VARCHAR(10),
  departure_time TIMESTAMP WITH TIME ZONE,
  arrival_time TIMESTAMP WITH TIME ZONE
);

-- passengers
CREATE TABLE passengers (
  id BIGINT PRIMARY KEY,
  name VARCHAR(255),
  email VARCHAR(255),
  phone VARCHAR(32)
);

-- bookings
CREATE TABLE bookings (
  id BIGINT PRIMARY KEY,
  flight_id BIGINT REFERENCES flights(id),
  passenger_id BIGINT REFERENCES passengers(id),
  booking_time TIMESTAMP WITH TIME ZONE,
  status VARCHAR(20)
);

-- notification configurations (drives schedule)
CREATE TABLE notification_configs (
  id BIGINT PRIMARY KEY,
  name VARCHAR(100),
  offset_minutes INT, -- minutes before the event (positive value)
  enabled_channels VARCHAR(50), -- comma-separated: EMAIL,SMS
  enabled BOOLEAN DEFAULT TRUE
);

-- scheduled notification events
CREATE TABLE notification_events (
  id BIGINT PRIMARY KEY,
  booking_id BIGINT REFERENCES bookings(id),
  passenger_id BIGINT REFERENCES passengers(id),
  send_time TIMESTAMP WITH TIME ZONE,
  channel VARCHAR(20),
  type VARCHAR(50),
  status VARCHAR(20) DEFAULT 'PENDING',
  attempts INT DEFAULT 0,
  last_attempt_time TIMESTAMP WITH TIME ZONE,
  created_at TIMESTAMP WITH TIME ZONE DEFAULT now()
);
