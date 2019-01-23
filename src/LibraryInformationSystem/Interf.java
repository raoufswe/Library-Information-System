
package LibraryInformationSystem;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Abdurraouf Fathi
 */
public interface Interf extends Remote {
    
    public boolean getlogin (String user, String pass)throws RemoteException; //creating object for login
    
    public boolean register (String name, String tp, String dob, String course, String intake, String user, String pass, String email )throws RemoteException; //creating object for Registration

    public boolean checkUser(String user)throws RemoteException; // creating object for username availibility
}