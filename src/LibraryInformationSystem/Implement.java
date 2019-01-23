
package LibraryInformationSystem;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Abdurraouf Fathi
 */
public class Implement extends UnicastRemoteObject implements Interf, Serializable{ //extending Interface class for object
    public Implement()throws RemoteException
    {
   super ();
    }
    @Override
    public boolean getlogin(String user, String pass) throws RemoteException { //class implimantation for login
      boolean f = false;
        try {
           Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DCOMS;create=true");    //Connecting Database  
           String sql = "SELECT * from ACCOUNTS WHERE USERNAME = ? and PASSWORD = ?";  //Accessing Table and required data
           PreparedStatement ps = con.prepareStatement(sql); //connection for table and data access
           ps.setString(1, user); //Getting username Results
           ps.setString(2, pass); //Getting password Results
           ResultSet rs = ps.executeQuery(); //Executing password Results
            if (rs.next()) //if Table has required data
            {
                System.out.print(rs.next());
                return f = true;
            }
     }
       catch (SQLException ex ) {
           Logger.getLogger(Implement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; //if table dose'nt have required data
    }

    @Override
    //class implimantation for Registration
    public boolean register(String name, String tp, String dob, String course, String intake, String user, String pass, String email) throws RemoteException {
        boolean f = false;
        try {
           Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DCOMS;create=true"); //Connecting Database 
             
           con.setAutoCommit(f); //transaction management, disabling auto saving
           String sql = "INSERT INTO ACCOUNTS (NAME, TP, DOB, COURSE, INTAKE, USERNAME, PASSWORD, EMAIL)" 
                   + " values (?, ?, ?, ?, ?, ?, ?, ? )"; //Accessing Table and required data
           PreparedStatement ps = con.prepareStatement(sql); //connection for table and data access
           ps.setString(1, name); //inserting Name
           ps.setString(2, tp); //inserting TP Number
           ps.setString(3, dob); // inserting Date of birth
           ps.setString(4, course); //inserting course
           ps.setString(5, intake); //inserting intake
           ps.setString(6, user); //inserting username
           ps.setString(7, pass); //inserting password
           ps.setString(8, email);  //inserting eamil
           ps.execute(); //updating data into table
           con.commit();
           con.rollback();
           con.close(); //database connection closing
        } catch (SQLException ex) {
            Logger.getLogger(Implement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public boolean checkUser(String user) throws RemoteException { //class implimantation for Username Validation
      boolean f = false;
        try {
           Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DCOMS;create=true"); //Connecting Database     
           String sql = "SELECT * from ACCOUNTS WHERE USERNAME = ?"; //Accessing Table and usrnames
           PreparedStatement ps = con.prepareStatement(sql);  //connection for table and data access
           ps.setString(1, user);  //Getting username Results
           ResultSet rs = ps.executeQuery(); //Executing password Results
            if (rs.next()) //if username exist
            {
                System.out.print(rs.next());
                return f = true;
            }
     }
       catch (SQLException ex ) {
           Logger.getLogger(Implement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; //if username not exist
    }
    
    public static boolean checkBook(String b_id){ //created to check book is available or not
	boolean status=false;
	try{
		Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DCOMS;create=true");  //Connecting Database 
		PreparedStatement ps=con.prepareStatement("SELECT * FROM BOOKS WHERE B_ID = ?"); //Accessing Table and usrnames
		ps.setString(1, b_id); //Getting books Results
                ResultSet rs=ps.executeQuery();  //Executing books Results
		status=rs.next(); //checking for books in next colums
		con.close();  //database connection closing
	}catch(Exception e){System.out.println(e);}
	return status;
    }

    public static int borrowbook(String b_id){ //created to update books quantity after borrowed
	int status=0;
	int quantity=0;
	try{
		Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DCOMS;create=true"); //Connecting Database 
		PreparedStatement ps=con.prepareStatement("SELECT QUANTITY FROM BOOKS WHERE B_ID=?"); //Accessing Table and usrnames
		ps.setString(1,b_id); //Getting books Results
		ResultSet rs=ps.executeQuery(); //Executing books Results
		if(rs.next()){ //checking for books in table
			quantity=rs.getInt("quantity"); //getting books quantity
		}
		if(quantity>0){ //if books are available
		PreparedStatement ps2=con.prepareStatement("UPDATE BOOKS set QUANTITY = ? WHERE B_ID =?"); //updating books data into table
		ps2.setInt(1,quantity-1); //updating books quantity
		ps2.setString(2,b_id); //getting specfied user
		status=ps2.executeUpdate(); //Executing quantity Results
		}
		con.close(); //database connection closing
	}catch(Exception e){System.out.println(e);}
	return status; //if books is not availble inform JFrame class
    }
    
    public static int returnbook(String b_id){ //created to update books quantity after returned
	int status=0;
	int quantity=0;
	try{
		Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DCOMS;create=true"); //Connecting Database 
		PreparedStatement ps=con.prepareStatement("SELECT QUANTITY FROM BOOKS WHERE B_ID=?"); //Accessing Table and usrnames
		ps.setString(1,b_id); //Getting books Results
		ResultSet rs=ps.executeQuery(); //Executing books Results
		if(rs.next()){ //checking for books in table
			quantity=rs.getInt("quantity"); //getting books quantity 
		}
		if(quantity>0){  //if book available
		PreparedStatement ps2=con.prepareStatement("UPDATE BOOKS set QUANTITY = ? WHERE B_ID =?"); //updating books quantity into table
		ps2.setInt(1,quantity+1); //updating books quantity
		ps2.setString(2,b_id);  //getting specfied user
		status=ps2.executeUpdate(); //Executing quantity Results
		}
		con.close(); //database connection closing
	}catch(Exception e){System.out.println(e);}
	return status;
    }
 
}
