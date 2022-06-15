# SOFTWARE DESIGN
## FLOORS

### REQUIREMENTS
<ol>
  <li>1.	A list consisting of FLOORS
   the users want to be aware of. The application must allow users to add FLOORS
   to a list, delete FLOORS
   from a list, and edit the FLOORS
   in the list.
    <strong> In users reminder list there are method to addFloors(),rename(oldName,newName),deleteFloors() and searchFloor() implemented since the users want these primary operations. </strong>

  </li>
  <li>
    The application must contain a database (DB) of FLOORS
     and corresponding data.
    <strong>UML diagram contains a database that store reminder list data and able to do CRUD(create, read , delete , update) operations as per users need</strong>
  </li>
  <li>
    Users must be able to add FLOORS
     to a list by picking them from a hierarchical list, where the first level is the reminder type (e.g., Appointment), and the second level is the name of the actual reminder (e.g., Dentist Appointment).

  </li>
  Users must also be able to specify a reminder by typing its name. In this case, the application must look in its DB for FLOORS
   with similar names and ask the user whether that is the item they intended to add. If a match (or nearby match) cannot be found, the application must ask the user to select a reminder type for the reminder, or add a new one, and then save the new reminder, together with its type, in the DB.
  <strong>Will be implemented in the later part of the development</strong>

  <li>
    The FLOORS
     must be saved automatically and immediately after they are modified.
    <strong>listFLOORS
     class handle all the add,edidt ,delete opertation and update the data in to the database.</strong>

  </li>
  <li>
    Users must be able to check off FLOORS
     in the list (without deleting them)
    <strong>Users is able to select and deselect items in the list by the use of checkOffmarks() method in the list FLOORS
     class</strong>
  </li>
  <li>
    Check-off marks for the reminder list are persistent and must also be saved immediately
    <strong>The criteria is implemented in the list FLOORS
     class and it is conneceted to the database , </strong>
  </li>
  <li>
   <strong> The application must present the FLOORS
    grouped by type.
    ReminderTypeSet class contains the menthod contains the argument that set up the all the catagories of this requirement</strong>

  </li>
  
  <li>
    The application should have the option to set up FLOORS
     with day and time alert. If this option is selected allow option to repeat the behavior.

  </li>
  <li>
    Extra Credit: Option to set up reminder based on location
    <strong>Implemented by the use of third party API</strong>
  </li>
 
  </ol>