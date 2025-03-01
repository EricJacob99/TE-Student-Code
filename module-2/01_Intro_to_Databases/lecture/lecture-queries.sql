-- SELECT
-- Use a SELECT statement to return a literal string


-- Use a SELECT statement to add two numbers together (and label the result "sum")



-- SELECT ... FROM
-- Write queries to retrieve...

-- The names from all the records in the state table


-- The names and populations of all cities


-- All columns from the park table



-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
-- Note ASC is default


-- Change sort order to DESC to see largest to smallest


-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
-- Note order of columns in the ORDER BY: census_region is the major sort, state_name the minor sort,
--   meaning it's sorted within the major column, i.e. census_region.
-- Note order of columns in the SELECT only controls order columns are returned (i.e. "displayed"), not sort order.


-- The biggest park by area
-- Note that area isn't in the SELECT, but can be used in the ORDER BY



-- LIMITING RESULTS

-- The 10 largest cities by populations


-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.



-- SELECT __ FROM __ WHERE
-- Write queries to retrieve...

-- The names of cities in California (CA)


-- The names and state abbreviations of cities NOT in California


-- The names and areas of cities smaller than 25 square kilometers


-- The names from all records in the state table that have no assigned census region


-- The names and census regions from all records in the state table that have an assigned census region



-- WHERE with AND/OR
-- Write queries to retrieve...

-- The names, areas, and populations of cities smaller than 25 sq. km. with more than 100,000 people


-- The names and census regions of all states (and territories and districts) not in the Midwest region (including those that don't have any census region)


-- The names, areas, and populations of cities in California (CA) or Florida (FL)


-- The names, areas, and populations of cities in New England -- Connecticut (CT), Maine (ME), Massachusetts (MA), New Hampshire (NH), Rhode Island (RI) and Vermont (VT)



-- SELECT statements involving math
-- Write a query to retrieve the names and areas of all parks in square METERS
-- (the values in the database are stored in square kilometers)
-- Label the second column "area_in_square_meters"



-- All values vs. distinct values

-- Write a query to retrieve the names of all cities and notice repeats (like Springfield and Columbus)


-- Do it again, but without the repeats (note the difference in row count)



-- LIKE
-- Write queries to retrieve...

-- The names of all cities that begin with the letter "A"


-- The names of all cities that end with "Falls"


-- The names of all cities that contain a space



-- BETWEEN
-- Write a query to retrieve the names and areas of parks of at least 100 sq. kilometers but no more than 200 sq. kilometers



-- DATES
-- Write a query to retrieve the names and dates established of parks established before 1900

