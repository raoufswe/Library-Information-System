
package LibraryInformationSystem;
import java.io.IOException;
import java.io.Serializable;
import java.net.ServerSocket;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RMIServerSocketFactory;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocketFactory;
/**
 *
 * @author Abdurraouf Fathi
 */
public class Server implements RMIServerSocketFactory, Serializable {

    public static void main(String[] args) {
    try{
    Registry registry;
    registry = LocateRegistry.createRegistry(1044); //creating server
    Implement lp = new Implement(); //implementation
    registry.rebind ("login" , lp); //registry name created
    System.out.println("Server is Ready"); // server notification
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
    }

    @Override
    public ServerSocket createServerSocket(int port) throws IOException {
        ServerSocketFactory factory = SSLServerSocketFactory.getDefault();
        ServerSocket socket =factory.createServerSocket(port);
        return socket;
    }
}
