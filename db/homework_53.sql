CREATE TABLE instruments (
                             id SERIAL PRIMARY KEY,
                             brand TEXT,
                             model TEXT,
                             instrument_type TEXT,
                             year INT,
                             price INT
);


INSERT INTO instruments (brand, model, instrument_type, year, price)
VALUES
    ('Yamaha', 'P-125', 'Digital Piano', 2020, 650),
    ('Kawai', 'ES110', 'Digital Piano', 2019, 600),
    ('Fender', 'Stratocaster', 'Electric Guitar', 2018, 1200),
    ('Gibson', 'Les Paul Standard', 'Electric Guitar', 2021, 2600),
    ('Roland', 'TD-17KVX', 'Electronic Drums', 2020, 1500),
    ('Hohner', 'Favorit IV P', 'Accordion', 1975, 900);


SELECT * FROM instruments;


UPDATE instruments
SET price = 700
WHERE brand = 'Yamaha' AND model = 'P-125';


DELETE FROM instruments
WHERE year < 1980;

SELECT brand FROM instruments;

SELECT * FROM instruments
WHERE price > 1000;


SELECT * FROM instruments
LIMIT 3;

SELECT DISTINCT brand FROM instruments;

ALTER TABLE instruments
    ADD color TEXT;


ALTER TABLE instruments
    ALTER COLUMN color TYPE TEXT;


ALTER TABLE instruments
    DROP COLUMN color;

SELECT * FROM instruments
ORDER BY price DESC;

SELECT COUNT(*) AS total_instruments
FROM instruments;

SELECT MIN(price) AS min_price FROM instruments;
SELECT MAX(price) AS max_price FROM instruments;

SELECT SUM(price) AS total_value
FROM instruments;

SELECT AVG(price) AS avg_price
FROM instruments;

SELECT AVG(year) AS avg_year
FROM instruments;


SELECT brand, COUNT(*) AS instruments_count
FROM instruments
GROUP BY brand;

SELECT instrument_type, AVG(price) AS avg_price_by_type
FROM instruments
GROUP BY instrument_type
ORDER BY avg_price_by_type DESC;