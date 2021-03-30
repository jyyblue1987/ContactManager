DROP TABLE IF EXISTS contacts;

CREATE TABLE contacts (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    email VARCHAR(60) NOT NULL,
    full_name VARCHAR(250) NOT NULL,
    type VARCHAR(20) NOT NULL,
    phone_number VARCHAR(40),
    address VARCHAR(100)
);

INSERT INTO contacts (email, full_name, type, phone_number, address) VALUES
  ('aliko@gmail.com', 'Aliko Dangote', 'Staff', '1234567899', 'New York'),
  ('aliko1@gmail.com', 'Aliko1 Dangote', 'Staff', '1234567891', 'New York1'),
  ('aliko2@gmail.com', 'Aliko2 Dangote', 'Staff', '1234567892', 'New York2'),
  ('aliko3@gmail.com', 'Aliko3 Dangote', 'Staff', '1234567893', 'New York3');