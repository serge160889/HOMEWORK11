CREATE TABLE addresses(
	id INT AUTO_INCREMENT NOT NULL,
    city VARCHAR(255) NOT NULL,
    street VARCHAR(255) NOT NULL,
    house_number int NOT NULL,
    house_building int ,
    apartment_number int,
    PRIMARY KEY(id)
);