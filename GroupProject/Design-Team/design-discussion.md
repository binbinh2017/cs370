# _Design 1 – Afm_ 

![Design 1.PNG](https://www.dropbox.com/s/fyo5n84tcc2ubl1/Design%201.PNG?dl=0&raw=1)
## Pros 
•	Simple and clean / easy to read
•	Most of the requirements fulfilled
•	Classes well connected
## Cons 
•	No Database implemented in design
•	Some classes were created in place of attributes
•	Floor type not explicitly stated 

# _Design 2 – Akram_

![Design 2.PNG](https://www.dropbox.com/s/cv1klalzsc4xf6k/Design%202.PNG?dl=0&raw=1)
## Pros
•	Separated Vinyl and Laminate into separate classes 
•	Created a Boolean method to check the attribute 
•	Met most of the requirements
## Cons
•	Sloppy lines connecting the classes 
•	Some classes are not connected to either the database or any classes 
•	Employees or store not in design 

# _Design 3 – Binbin_ 

![Design 3.PNG](https://www.dropbox.com/s/hkqjdglsidvos99/Design%203.PNG?dl=0&raw=1)
## Pros 
•	Implemented floor and type into one class
•	Connected the classes and used annotation 
•	Provided attribute type
## Cons
•	Didn’t separate all the floor category and floor type 
•	User and shopping cart not connected to the store 
•	No search functionality 

# _Design 4 – Jaskarn_ 

![Design 4.PNG](https://www.dropbox.com/s/ot3mhk6ifphkf31/Design%204.PNG?dl=0&raw=1)
## Pros 
•	Product search connected to database 
•	Employee connected to store which is connected to database 
•	All the attributes implemented in design 
## Cons 
•	Overlapping lines 
•	User has access to database 
•	Category and type not separate classes 

# _Design 5 – Cindy_

![Design 5.PNG](https://www.dropbox.com/s/3bbc4elhu97rjyu/Design%205.PNG?dl=0&raw=1)
## Pros
•	Every kind of method and attribute a class would need is implemented 
•	Design is readable and easy to follow 
•	Enumeration implemented
## Cons
•	No database
•	Tile, stone, and wood not connected to floor category 
•	Vinyl and Laminate class empty 


# _Team Design_
The main commonalities between our individual designs and team design were the separate implementations of classes such as, product, store, employee, and user. The main differences were, we decided to have the different materials and floor types as separate classes. We decided to keep the floor category and floor type separate which connects to the product class. This is because the floor type is inheriting the floor category which establishes a search hierarchy, this allows the user to search for different types and categories. The reason why floor category is inheriting the product class is because it allows the user to search by color, size, type, and brand. 

# _Summary_
 By looking at the individual designs we were able to see which aspects worked well and which ones did not. We were then able to implement what we learned and apply that into the team design. We learned how to collaborate with one another, and which communication methods worked well. We also learned to work around each other’s schedule. 

