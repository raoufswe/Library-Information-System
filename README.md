**Library Information System in Java RMI**

The library information system is used to manage the library resources and allow natural transaction process. 
The system is designed and implemented using Java RMI technology which is a concept that involves writing both the server and the client programs.

The system covers all the following functions: 
* Graphical User Interface. 
* Register an account and checks if the username exists in the system.
* Each successfully registered user receives an acknowledgment using email Through Socket Programming.
* Login.
* The user can view a list of available books from the library information system. 
* The user can borrow a book from the list or return it. 

The communication between client and server uses RMI with Serialization and support Multiple Threads to allow multiple users to use the system at the same time.
The system uses a SQL database through JDBC to store and retrieve all transactions and Object-Oriented Programming approach was followed. 

**Instructions to run the system: **
* Download or clone the files
* Go to db-derby-10.14.2.0-bin/bin and copy the path 
* Open CMD in administrator mode
* Cd 'your db path' 
* Run the following command startNetworkServer.bat
* Import the project in NetBeans
* Run the server file first  then client.java

\*\* You might get -Resolve Project Problems- error. Just go to the system folder and add the required .jar files.
