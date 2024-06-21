-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection", sorted alphabetically.
-- (28 rows)

SELECT person_name
FROM person
JOIN movie_actor ON person.person_id = movie_actor.actor_id
JOIN movie ON movie_actor.movie_id = movie.movie_id
JOIN collection ON movie.collection_id = collection.collection_id
WHERE person_id = (SELECT actor_id FROM movie_actor WHERE movie_id = (SELECT movie_id FROM movie WHERE collection_id = (SELECT collection_id FROM collection WHERE collection_name = 'Back to the Future Collection')))
ORDER BY person_name ASC;