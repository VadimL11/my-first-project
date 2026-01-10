DROP TABLE IF EXISTS instrument_details;
DROP TABLE IF EXISTS instruments;

CREATE TABLE instruments
(
    id    SERIAL PRIMARY KEY,
    name  TEXT NOT NULL,
    brand TEXT NOT NULL
);

CREATE TABLE instrument_details
(
    instrument_id       INT PRIMARY KEY,
    serial_number       TEXT UNIQUE NOT NULL,
    manufacture_country TEXT,
    FOREIGN KEY (instrument_id) REFERENCES instruments (id)
);


CREATE TABLE brands
(
    id   SERIAL PRIMARY KEY,
    name TEXT UNIQUE NOT NULL
);

CREATE TABLE brand_instruments
(
    id              SERIAL PRIMARY KEY,
    brand_id        INT  NOT NULL,
    model           TEXT NOT NULL,
    instrument_type TEXT NOT NULL,
    FOREIGN KEY (brand_id) REFERENCES brands (id)
);


INSERT INTO brands (name)
VALUES ('Yamaha'),
       ('Fender'),
       ('Gibson');


INSERT INTO instruments (name, brand)
VALUES ('Digital Piano', 'Yamaha'),
       ('Electric Guitar', 'Fender');


INSERT INTO instrument_details (instrument_id, serial_number, manufacture_country)
VALUES (1, 'SN-YAM-001', 'Japan'),
       (2, 'SN-FEN-002', 'USA');


INSERT INTO brand_instruments (brand_id, model, instrument_type)
VALUES (1, 'P-125', 'Digital Piano'),
       (1, 'PSR-E373', 'Keyboard'),
       (2, 'Stratocaster', 'Electric Guitar'),
       (2, 'Telecaster', 'Electric Guitar'),
       (3, 'Les Paul Standard', 'Electric Guitar');



SELECT i.name, d.serial_number, d.manufacture_country
FROM instruments i
         JOIN instrument_details d
              ON i.id = d.instrument_id;


SELECT b.name AS brand, bi.model, bi.instrument_type
FROM brands b
         JOIN brand_instruments bi
              ON b.id = bi.brand_id;