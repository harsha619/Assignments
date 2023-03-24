1. Find out the PG-13 rated comedy movies. DO NOT use the film_list table.

ANS:
	SELECT film.film_id,film.title ,film.rating
	FROM film 
	INNER JOIN film_category ON film.film_id = film_category.film_id 
	INNER JOIN category ON film_category.category_id = category.category_id 
	WHERE name = 'Comedy' AND rating = 'PG-13';
	
	![image](https://user-images.githubusercontent.com/118799403/227458911-c5d05bdf-5c64-43f5-8c0f-d16c3ef77a02.png)
2. Find out the top 3 rented horror movies.
ANS:
  SELECT film.title,category.name, COUNT(*) as rental_count 
  FROM film 
  INNER JOIN inventory ON film.film_id = inventory.film_id 
  INNER JOIN rental ON inventory.inventory_id = rental.inventory_id 
  INNER JOIN film_category ON film.film_id = film_category.film_id 
  INNER JOIN category ON film_category.category_id = category.category_id 
  WHERE name = 'Horror' 
  GROUP BY film.film_id
  ORDER BY rental_count DESC 
  LIMIT 3;
  ![image](https://user-images.githubusercontent.com/118799403/227459206-c4accb69-7d8f-4262-b325-505760c14ea2.png)
3. Find out the list of customers from India who have rented sports movies. 
ANS:
  select customer.customer_id, customer.first_name, customer.last_name,country,name
  from customer
  inner join rental on customer.customer_id = rental.customer_id
  inner join inventory on rental.inventory_id = inventory.inventory_id
  inner join film_category on inventory.film_id = film_category.film_id
  inner join category on film_category.category_id = category.category_id
  inner join address on customer.address_id = address.address_id
  inner join city on address.city_id = city.city_id
  inner join country on city.country_id = country.country_id
  where name = "Sports"
  and country = "India";
  ![image](https://user-images.githubusercontent.com/118799403/227460033-a87258dc-329e-4e85-a44b-9a71b585a10a.png)

  
 4. Find out the list of customers from Canada who have rented “NICK WAHLBERG” movies.
 ANS:
     select customer.customer_id, customer.first_name, customer.last_name,actor.first_name as actor_fname,actor.last_name as actor_lname,country 
from customer
join rental on customer.customer_id = rental.customer_id
join inventory on rental.inventory_id = inventory.inventory_id
join film_actor on inventory.film_id = film_actor.film_id
join actor on film_actor.actor_id = actor.actor_id
join address on customer.address_id = address.address_id
join city on address.city_id = city.city_id
join country on city.country_id = country.country_id
where country.country = "Canada"
and actor.first_name = "NICK"
and actor.last_name = "WAHLBERG";

![image](https://user-images.githubusercontent.com/118799403/227460462-12bec116-1ccc-44dc-9a8f-0bf4275a1881.png)

5. Find out the number of movies in which “SEAN WILLIAMS” acted.
ANS:
  select count(*)as total_films 
 from actor
 join film_actor on actor.actor_id =film_actor.actor_id
 join film on film_actor.film_id=film.film_id
where first_name="SEAN"
and last_name="WILLIAMS"
group by actor.actor_id;
![image](https://user-images.githubusercontent.com/118799403/227460699-81f038c9-9b66-4d6d-ba86-9ebd4d39f412.png)

