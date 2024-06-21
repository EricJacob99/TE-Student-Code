-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas, sorted alphabetically.
-- (5 rows)

SELECT title
FROM movie
JOIN collection ON movie.collection_id = collection.collection_id
WHERE collection_name = 'Star Wars Collection' AND director_id != (SELECT person_id FROM person WHERE person_name = 'George Lucas')
ORDER BY title ASC;