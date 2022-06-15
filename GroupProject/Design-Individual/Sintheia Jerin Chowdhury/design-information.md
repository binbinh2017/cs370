>**1.** As a user of the system I want to be able to see each store's offering and the amount of product in stock by square feet.

To realize this requirement following classes have been created with the mentioned attributes:

- **Employee** *Attributes:* EmployeeID, EmployeeName
- **Store** *Attributes:* StoreID, StoreName
- **Stock** *Attributes:* ProductList
- **Product** *Attributes:* Quantity

In order to realize the functions mentioned above following methods have been added in their respective classes:
- **Employee** *Methods: viewAllProductsinStore(), viewStockDetails()*
- **Store** *Methods: viewListofAllProducts(), viewStockDetails()*
- **Stock** *Methods: getProductList()*

>**2.** The application must allow employees to add new products to the system. As well as delete and edit them.

In order to realize the above mentinoed functionalities, following functions have been added in their respecitve classes:

- **Employee** *Methods:* addProduct(), deleteProduct(), editProduct()
- **Store** *Methods:* addStockProcuct(), deleteStockProduct(), editStockProduct()
- **Stock** *Methods:* addProducttoList(), deleteProductFromList(), setProductinList()
- **Product** *Methods:* getQuantity(), setQuantity(),

>**3.** The different categories of floors available are tile, stone, wood, laminate and vinyl

In order to realize this requirement following attribute and methods have been added to the **Product** class:

- *Attributes:* Category
- *Methods:* getCategory(), setCategory()

Furthermore following *child classes* of the **Product** class have beed added to the class diagram:

- **Tile**
- **Stone**
- **Wood**
- **Laminate**
- **Vinyl**

>**4.** The application must contain a database (DB) of floors.

This requirement is not considered during realization becuase the database will be constructed in the later stages of software development using the same class diagram under consideration.

>**5.** Users must be able to search for products by picking from a hierarchical list, where the first level is the floor category, and the second level is the floor type.

In order to realize this requirement the an enumeration class named as **FloorCategory** has been created with the following enumerations:

- Tile
- Stone
- Wood
- Laminate
- Vinyl

Along with this, the datatype of the attribute *Category* in the class **Product** has been set to FloorCategory.

>**6.** Users must also be able to specify an item by typing its name (search functionality).

In order to realize this requirement following attributes and methods have been added to the **Product** class:

- *Attributes:* Name
- *Methods:* getName(), setName()

> **7.** All floors regardless of their category have an associated color, size, brand, type and price

In order to realize this requirement following attributes and methods have been added to the **Product** class:

- *Attributes:* Color, Size, Brand, Type, Price, Category
- *Methods:* getColor(), getSize(), getBrand(), getType(), getPrice(), setColor(), setSize(), setBrand(), setType(), setPrice()

>**8.** Categories tile and stone have different materials they are made of, e.g. Tile - porcelain, ceramic, resin ; Stone - marble, pebble, slate

In order to realize this requirement the an enumeration class named as **TileMaterial** has been created with the following enumerations:

- Porcelain
- Ceramic
- Resin

Along with that an enumeration class named as **StoneMaterial** has been created with the following enumerations:

- Marble
- Pebble
- Resin

**TileMaterial** is contained by the **Tile** class whereas, in order to contain the **TileMaterial** enumeration in the **Tile** class following attributes and methods have been added to the **Tile** class:

- *Attributes:* TileMaterial
- *Methods:* getTileMaterial(), setTileMaterial()

**StoneMaterial** is contained by the **Stone** class whereas, in order to contain the **StoneMaterial** enumeration in the **Stone** class following attributes and methods have been added to the **Stone** class:

- *Attributes:* storeMaterial
- *Methods:* getStoreMaterial(), setStoreMaterial()

>**9.** Wood floors have both a type (solid, engineered, bamboo, etc) and species (oak, hickory, maple, etc.)

In order to realize this requirement an *enumeration child class* of **FloorType** has been created as **WoodFloorType** with the following enumerations:

- Soild
- Engineered
- Bamboo

This class is only used for the Floor with **Wood** category. 
Along with this, an enumeration class named as **WoodSpecies** has been created with the following enumerations:

- Oak
- Hickory
- Maple

Also, **WoodSpecies** is contained by the **Wood** class whereas, in order to contain the **WoodSpecies** enumeration in the **Wood** class following attributes and methods have been added to the **Wood** class:

- *Attributes:* woodSpecies
- *Methods:* getWoodSpecies(), setWoodSpecies()

>**10.** Laminate can be regular laminate or water resistant, whereas vinyl can be water resistant or waterproof

In order to realize this requirement an *enumeration child class* of **FloorType** has been created as **LaminateFloorType** with the following enumerations:

- Regular Laminate
- Water Resistant

This class is only used for the Floor with **Laminate** category. Along with it, an *enumeration child class* of **FloorType** has been created as **VinylFloorType** with the following enumerations:

- Water Resistant
- Waterproof

This class is only used for the Floor with **Vinyl** category.

>**11.** The User Interface (UI) must be intuitive and responsive.

This requirement is not considered during realization becuase it does not has any effect on the class diagram rather it is a UI/UX design requirement which is not included on the structural level.