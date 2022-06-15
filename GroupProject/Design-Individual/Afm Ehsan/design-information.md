1. As a user of the system I want to be able to see each store's offering and the amount of
product in stock by square feet.
    Created user and store class, where user is connected to store. And store has storeName and productAmount
2. The application must allow employees to add new products to the system. As well as
delete and edit them.
    Created employee class, where it has add, delete and edit method 
3. The different categories of floors available are tile, stone, wood, laminate and vinyl
    Created FloorCategory, where it has retrieveItem method. 
4. The application must contain a database (DB) of floors.
    Did not create anything, since we are not concerned about database for now
5. Users must be able to search for products by picking from a hierarchical list, where the
first level is the floor category, and the second level is the floor type.
    Created dependency line between floor category to product, where I wrote search by hierarchy
6. Users must also be able to specify an item by typing its name (search functionality).
    Created search method in user class
7. All floors regardless of their category have an associated color, size, brand, type and
price
    Created product class, where it has all of those attributes
8. Categories tile and stone have different materials they are made of, e.g. Tile - porcelain,
ceramic, resin; Stone - marble, pebble, slate
    Create two of those class: tile and stone. And added those attributes respectively 
9. Wood floors have both a type (solid, engineered, bamboo, etc) and species (oak,
hickory, maple, etc.)
    Created wood class and added those two attributes
10. Laminate can be regular laminate or water resistant, whereas vinyl can be water
resistant or waterproof
    Created laminate and added those two attributes. Create vinyl and added those two attributes
11. The User Interface (UI) must be intuitive and responsive.
    Did not created, because I do not need to show that. 
