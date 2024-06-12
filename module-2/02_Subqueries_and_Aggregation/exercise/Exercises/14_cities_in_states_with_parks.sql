-- 14. The city name and state abbreviation for all states with a national park.
-- Order the results by state abbreviation, then city name, both in alphabetical order.
-- (261 rows)

SELECT city_name, state_abbreviation
FROM city
WHERE state_abbreviation IN (SELECT state_abbreviation FROM park_state WHERE park_id IN (SELECT park_id FROM park))
ORDER BY state_abbreviation ASC, city_name ASC;