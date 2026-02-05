CREATE TABLE instruments_m2m
(
    id   SERIAL PRIMARY KEY,
    name TEXT NOT NULL
);

CREATE TABLE musicians
(
    id   SERIAL PRIMARY KEY,
    name TEXT NOT NULL
);

CREATE TABLE musician_instrument
(
    musician_id   INT NOT NULL,
    instrument_id INT NOT NULL,
    PRIMARY KEY (musician_id, instrument_id),
    FOREIGN KEY (musician_id) REFERENCES musicians (id),
    FOREIGN KEY (instrument_id) REFERENCES instruments_m2m (id)
);


INSERT INTO instruments_m2m (name)
VALUES ('Piano'),
       ('Akkordeon'),
       ('Drums'),
       ('Violin');

INSERT INTO musicians (name)
VALUES ('Vadym'),
       ('Oigen'),
       ('Nikita'),
       ('Mykola');

INSERT INTO musician_instrument (musician_id, instrument_id)
VALUES (1, 1),
       (1, 2),
       (2, 2),
       (3, 3);

SELECT m.name AS musician, i.name AS instrument
FROM musicians m
         INNER JOIN musician_instrument mi ON m.id = mi.musician_id
         INNER JOIN instruments_m2m i ON i.id = mi.instrument_id;


SELECT m.name AS musician, i.name AS instrument
FROM musicians m
         LEFT JOIN musician_instrument mi ON m.id = mi.musician_id
         LEFT JOIN instruments_m2m i ON i.id = mi.instrument_id;


SELECT m.name AS musician, i.name AS instrument
FROM musicians m
         RIGHT JOIN musician_instrument mi ON m.id = mi.musician_id
         RIGHT JOIN instruments_m2m i ON i.id = mi.instrument_id;


SELECT m.name AS musician, i.name AS instrument
FROM musicians m
         FULL JOIN musician_instrument mi ON m.id = mi.musician_id
         FULL JOIN instruments_m2m i ON i.id = mi.instrument_id;