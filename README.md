# Student Result Management Portal

The **Student Result Management Portal** is a Java-based Desktop application.  
The web application has the following primary features:  
  ### 1. Result portal for students:
  Students can view their exam results by entering their roll number in the student section of the application.
  ### 2. Student results and records management portal for administrators:
  Administrators can view and modify the results and records of students. This includes adding details of new students as well as new result records.

## Instructions to run the Project locally
1. Open the project folder (```SearchEngine```) in any IDE or code editor such as IntelliJ IDEA, VS Code, Eclipse etc.  
2. Download the ```MySQL Connector``` archive file from [here](https://dev.mysql.com/downloads/connector/j/) and extract it. Install  the ```mysql-connector``` library as a java library in the project; select the jar file from the extracted folder as source for the library. Alternately, the jar file is also provided in the dependencies folder at .  
3. In all the java files of the project (except for the one at ```/src/result_portal/Index.java```), add the username and password of your MySQL server to establish a connection to the database (as indicated in the comments of the programs).  
4. Add the provided ```rs2xml.jar``` (or download from [here](https://sourceforge.net/projects/finalangelsanddemons/files/rs2xml.jar/download), for example) as a java library in the project; select the jar file as source for the library.  
5. Run the java file at the location ```/src/result_portal/Index.java```. This file contains the main function and therefore the project can be thus run by running the program in the specified file.  
6. The application will load in a new window.
