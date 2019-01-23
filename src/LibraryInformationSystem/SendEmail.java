
package LibraryInformationSystem;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class SendEmail  // This class is created to send email using JAVA Mail API
{
    public static void send(String to, String sub,String msg, final String user, final String pass) /*object declaration for email details 
                                                                                                    to be used to send the email */
    {
        Properties props = new Properties(); // setting email Properties
        props.put("mail.smtp.host", "smtp.gmail.com"); // setting email host
        props.put("mail.smtp.port", "587"); //setting email host's port	
        props.put("mail.smtp.auth", "true"); //email host's authentication
        props.put("mail.smtp.starttls.enable", "true"); //checking stmp srever
        Session session = Session.getDefaultInstance(props,new Authenticator() //STMP and gmail user Authenticator
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication()  //Password Authentication for the API to send the email 
            {
                return new PasswordAuthentication(user, pass);
            }
        });
        try 
        {
            Message message = new MimeMessage(session); //creating message session
            message.setFrom(new InternetAddress(user)); //getting host email address
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to)); // setting email for new user by getting email id from Registration form
            message.setSubject(sub); //setting email subject
            message.setText(msg); //setting email meassage for new user
            Transport.send(message);  //sending email
        } catch (MessagingException e) //checking for any error
        {
            JOptionPane.showMessageDialog(null,"Something wrong just happended\nPlease make sure you have internet conncetion or the email is valid!");
            throw new RuntimeException(e);
        }  
    }
}