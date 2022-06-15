#  details for the design  
 

> (1) First, I added the Store Class which is the offering floors' class. It has the primary attribue---storeId, which is used to differentiated with others stores.
> (2) Then,I added the Employee Class, which is used to manage floors.
> (3) Next, I added the User Class, which is used to order and buy some floors from strore through shopping cart.
> (4) Next, I added the Floor Class.It contains different tpye,species and category for different floors.
> (5) Next, I added the ShoppingCart Class, this is for the user to have better order for the floors.
>(6) Finally, I added the database. The database is dependent to the Floor Class with each other. The database use every floor's information, and every floor use the database to save their information. The User class use the data from the database to learn about the floors. The Employee Class use the data from database to manage the floors better.
>(7)Every store has many employee, but one employee only working in one store, so their relationship is 1 to many.Employee is a part of a store, and employee can independent without that store.
>(8)Every store has many floors, but one floor only left in one store, so their relationship is 1 to many.Floor is a part of a store, and floor is dependent on that store.
>(9)Every shoppingCart has many floors, but one floor only left in one shoppingCart, so their relationship is 1 to many.Floor is a part of a shoppingCart, and floor is independent without that shoppingCart.
>(10)Every user can use many shoppingCart at the same time, but one shoppingCart can only used by one user at the same time, so their relationship is 1 to many. 
 
 

 

 
 
 
   

 
 
  
  