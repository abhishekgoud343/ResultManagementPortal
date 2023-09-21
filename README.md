# Student Result Management Portal

The **Student Result Management Portal** is a Java-based Desktop application.  
The web application has the following primary features:  
  ### 1. Result portal for students:
  Students can view their exam results by entering their roll number in the student section of the application.
  ### 2. Student results and records management portal for administrators:
  Administrators can view and modify the results and other data of students. This includes adding details of new students as well as new result records.

## Instructions to run the Project locally
### Setting up MySQL database
1. Create a MySQL database and tables to store the student data and the admin login credentials. The SQL commands used for creating the MySQL database for this project are provided in the sql file [```SRMS_SQL_commands.sql```](https://github.com/abhishekgoud343/ResultManagementPortal/blob/main/SRMS_SQL_commands.sql). Using different attributes, table names etc in the database, than those in the ```SRMS_SQL_commands.sql``` file, would require making corresponding modifications in the project code.
2. Add at least one username–password pair for admin credentials in the respective MySQL table to enable administrator login. (This is not specified in the provided _sql_ file.)
### Executing the application
1. Open the project folder (```Student Result Management System```) in any IDE or code editor such as IntelliJ IDEA, VS Code, Eclipse etc.  
2. Download the ```MySQL Connector``` archive file from [here](https://dev.mysql.com/downloads/connector/j/) and extract it. Install  the ```mysql-connector``` library as a java library in the project; select the jar file from the extracted folder as source for the library. (Alternatively, the jar file is also provided in the dependencies folder at [```/dependencies/mysql-connector-j-8.1.0.jar```](https://github.com/abhishekgoud343/ResultManagementPortal/blob/main/Student%20Result%20Management%20System/dependencies/mysql-connector-j-8.1.0.jar).)  
3. In the java file at the location ```/src/result_portal/DatabaseConnection.java```, add the actual username and password of your MySQL server (as indicated in the comments of the program), so that a connection to the database can be established when the application is executed.  
4. Add the ```rs2xml.jar``` (provided in the ```/dependencies``` folder; or download from [here](https://sourceforge.net/projects/finalangelsanddemons/files/rs2xml.jar/download), for example) as a java library in the project; select the jar file as source for the library.  
5. Run the java file at the location ```/src/result_portal/Index.java```. This file contains the _main_ function that instantiates the application and therefore the project can be executed by running the specified program file.  
6. The application will load in a new window.

### Note:
The provided executable [jar file](https://github.com/abhishekgoud343/ResultManagementPortal/blob/main/ResultsPortal.jar) of the _Results Portal_ application is based on the following MySQL server credentials:
1. username: ```root```
2. password: ```password```  

As such, the provided _jar_ application would function properly only if your MySQL server has the same credentials as above.
