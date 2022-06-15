# Test Plan



*This is the template for your test plan. The parts in italics are concise explanations of what should go in the corresponding sections and should not appear in the final document.*



**Author**: <Team 4>



## 1 Testing Strategy

We will start with Unit testing then Integration Test. If the build is correct then we will move forward to System,Regression and API testing in order.

### 1.1 Overall strategy

*This section should provide details about your unit-, integration-, system-, and regression-testing strategies. In particular, it should discuss which activities you will perform as part of your testing process, and who will perform such activities.*

**Unit Testing** Test the individual components of the software.

*1.Add-- check if the user is able to add products.*

*2.Edit-- check if the user is able to edit.*

*3.Delete-- User is able to delete from the list.*

*4.Search-- Find the products from the list.*

*5.Radio Button - user is able to select and deselect the products from the list.*



**Integration testing** will be performed by the QA tester to ensure multiple modules of the application perform together smoothly.

1. *Newly created button is able to select different types of products from the list also add, edit or delete materials from the list.*



**System testing** will be performed by running the application on an android device to ensure the application as a whole performs according to the userinterface requirement.



**Regression testing** will be performed if needed by developers to ensure new code does not have a negative impact on the existing code.

1. *After adding the new maps API , making sure the app functionality is working as expected.*



**API Testing will** ensure that the application is connected to the database.

1. *Database should be configured as per the application requirements.*
2. *Return the value regards to its input.*
3. *Update the database.*
4. *Push the update to the database*





### 1.2 Test Selection



*Here you should discuss how you are going to select your test cases, that is, which black-box and/or white-box techniques you will use. If you plan to use different techniques at different testing levels (e.g., unit and system), you should clarify that.*



-We will test using black &white box techniques:



**-White-box testing** will be used on units, going through the code to see if each unit works as intended.



**-Black-box testing** will be used on the system and regression, including if the program executes or not, choosing valid and invalid inputs to check if the program works correctly, see if the selected function shows the expected output, etc.



-Most testing will be done manually







### 1.3 Adequacy Criterion**



*Define how you are going to assess the quality of your test cases. Typically, this involves some form of functional or structural coverage. If you plan to use different techniques at different testing levels (e.g., unit and system), you should clarify that.*



- To ensure a list of good quality test cases, we will select cases that cover every function of the application, i.e. every structure must execute at least once.



### 1.4 Bug Tracking



*Describe how bugs and enhancement requests will be tracked.*



Will be tracked using github version tracking.



Bug testing will be dealt by the QA tester



We will use LogCat and Runtime Stack provided by Android Studio 



### 1.5 Technology



*Describe any testing technology you intend to use or build (e.g., JUnit, Selenium, Java, MySql).*

**JUNIT --** Well suited for Manual Testing. 

**Android Studio--** proved real time feedback on the app progress

**Java**-- will be used for programming the app.

**MySql**--needed for the database of the app.



## 2 Test Case



*This section should be the core of this document. You should provide a table of test cases, one per row. For each test case, the table should provide its purpose, the steps necessary to perform the test, the expected result, the actual result (to be filled later), pass/fail information (to be filled later), and any additional information you think is relevant.*



| Test Cases          | Purpose                                                 | Steps                                                   | Expected Result                                          | Actual Result  | Pass/Fail | Additional Information(optional) |
| ----------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ---------------------------------------- | ---------------------------------- | ------------------------------------------ |
| User Login    | User should be able to login or create a login                           | The user enters login credentials or creates a new account                  | User is able to access the app                           |User is able to access the app  |  Pass  |                                            |
| Employee Login    | Employee should be able to login or create a login                           | The employee enters login credentials or creates a new account                   | Employee is given access to the inventory of the stores |  Employee is given access to the inventory of the stores   |  Pass  |                                            |
| Add Product| Employee adds product by using specific names to any given store   | The employee adds a product and enters details about the product and the store | The product is added to the store and can now be accessed by the user and employee | The product is added to the store and can now be accessed by the user and employee   |   Pass                                 |                                            |
| Update Product    | Edit any previously added product              | Long click on product to then edit it | The update is reflected in the store |  The update is reflected in the store                                        | Pass                                   |                                            |
| Delete Product       |Delete any previously added product   |  Long click on product to then delete it | The product is completely deleted |  The product is completely deleted                                        |     Pass                               |                                            |
| Search Product | User should be able to search a product by name or by filter  | The user types in product name or selects a filter of the product they like | List of product matches are displayed   |  List of product matches are displayed    |     Pass                               |                                            |


category = "tile"
 
type = "porcelain"
type = "resin";
type = "ceramic";

category = "stone"
type = "marble"
type = "pebble"
 type = "slate"

 category = "wood"
  type = "solid"
 type = "bamboo"
type = "engineering"

category = "wood species"
type = "oak"
type = "maple"
type = "hickory"

category = "laminate"
type = "regular"
type = "water resistant"

 category = "vinyl"
type = "water resistant"
type = "waterproof"