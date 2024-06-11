SELECT * FROM city;

select state_abbreviation, city_name from city;

SELECT * FROM park;

-- use AS to alias a column
SELECT park_id, park_name, date_established AS open_date
FROM park;

-- ORDER BY
SELECT * 
FROM city
ORDER BY population DESC

--DISTINCT

SELECT DISTINCT city_name FROM city;


SELECT state_abbreviation, city_name, population  
FROM city
WHERE city_name = 'Columbus';


SELECT state_abbreviation, city_name, population
FROM city
WHERE state_abbreviation = 'TX'
ORDER BY population ASC;

-- CAN USE LOGICAL OPERATORS
SELECT state_abbreviation, city_name, population
FROM city
WHERE state_abbreviation = 'TX' AND population < 200000
ORDER BY population ASC;

-- CAN DO MATH
SELECT state_abbreviation, city_name, ((population * 2) / 4) AS quarter_pop
FROM city
WHERE state_abbreviation = 'TX' AND population < 200000
ORDER BY population ASC;

SELECT * FROM state;

SELECT state_name, census_region
FROM state
WHERE census_region IS NOT NULL
ORDER BY census_region ASC, state_name ASC


SELECT *
FROM city
WHERE state_abbreviation = 'TX' OR state_abbreviation = 'OH' OR state_abbreviation = 'FL'
ORDER BY state_abbreviation DESC

SELECT *
FROM city
WHERE state_abbreviation IN ('TX', 'OH', 'FL')
ORDER BY state_abbreviation DESC

SELECT *
FROM city
WHERE state_abbreviation NOT IN ('TX', 'OH', 'FL')
ORDER BY state_abbreviation DESC

