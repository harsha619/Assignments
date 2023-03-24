1.  Find out the number of documentaries with deleted scenes.

ANS:
select count(*) from film
join film_category on film.film_id=film_category.film_id
 join category on film_category.category_id=category.category_id
 where name="Documentary"
 and special_features like "%Deleted Scenes%";
 
	
![image](https://user-images.githubusercontent.com/118799403/227464328-2df1d285-9b2a-4a8e-854d-4699b8ada671.png)
2. Find out the number of sci-fi movies rented by the store managed by Jon Stephens.
ANS:
select distinct title from film 
inner join inventory on   film.film_id= inventory.film_id
inner join rental on inventory.inventory_id=rental.rental_id
inner join film_category on film.film_id=film_category.film_id
where film_category.category_id= (select category_id from category where name="Sci-fi") and
rental.staff_id=(
select  staff_id from staff  where first_name='Jon' and last_name='Stephens');

  ![image](https://user-images.githubusercontent.com/118799403/227464615-fd5065ba-f7a3-49d8-93c5-0f8e72e68a40.png)
  
3. Find out the total sales from Animation movies.
ANS:
select sum(payment.amount)as sales from film
inner join film_category on  film.film_id=film_category.film_id
inner join inventory on film.film_id=inventory.inventory_id
inner join rental on inventory.inventory_id=rental.inventory_id
inner join payment on rental.rental_id=payment.payment_id
where film_category.category_id=(select category_id from category where name="Animation");


![image](https://user-images.githubusercontent.com/118799403/227465060-b5d9a399-d0c5-4b60-9513-caab3e272499.png)


  
 4.  Find out the top 3 rented category of movies by “PATRICIA JOHNSON”.
 ANS:
select category.name,  count( * ) as rented
from rental
join inventory on rental.inventory_id = inventory.inventory_id
join film_category on inventory.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
join customer on rental.customer_id = customer.customer_id
where customer.first_name = "PATRICIA"
and customer.last_name = "JOHNSON"
group by category.name
order by count( * ) desc
limit 3;

![image](https://user-images.githubusercontent.com/118799403/227465515-229fc117-0640-4483-b507-0b92e7e89bdb.png)

5. Find out the number of R rated movies rented by “SUSAN WILSON”.
ANS:
select count( * ) as rented
from rental
join inventory on rental.inventory_id = inventory.inventory_id
join film on inventory.film_id = film.film_id
join customer on rental.customer_id = customer.customer_id
where customer.first_name = "SUSAN"
and customer.last_name = "WILSON"
and film.rating = "R";

![image](https://user-images.githubusercontent.com/118799403/227465675-2359a1fb-f19e-4624-a3d6-19f2fb4fac21.png)

