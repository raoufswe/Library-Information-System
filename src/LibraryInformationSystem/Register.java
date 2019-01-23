
package LibraryInformationSystem;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RMIClientSocketFactory;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.swing.JOptionPane;
/**
 *
 * @author Abdurraouf Fathi
 */
public class Register extends javax.swing.JFrame implements RMIClientSocketFactory, Serializable {
    public Register() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        cpassTF = new javax.swing.JPasswordField();
        passTF = new javax.swing.JPasswordField();
        dobTF = new javax.swing.JTextField();
        tpTF = new javax.swing.JTextField();
        courseTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        intakeTF = new javax.swing.JTextField();
        unameTF = new javax.swing.JTextField();
        tpL = new javax.swing.JLabel();
        dobL = new javax.swing.JLabel();
        intakeL = new javax.swing.JLabel();
        courseL = new javax.swing.JLabel();
        cpassL = new javax.swing.JLabel();
        unameL = new javax.swing.JLabel();
        emailL = new javax.swing.JLabel();
        passL = new javax.swing.JLabel();
        backB = new javax.swing.JButton();
        registerB = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("APU Library Information System");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please Enter  Your Details");
        jLabel1.setToolTipText("");

        nameL.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        nameL.setText("Full Name");
        nameL.setPreferredSize(new java.awt.Dimension(140, 30));

        emailTF.setPreferredSize(new java.awt.Dimension(250, 30));
        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });

        cpassTF.setPreferredSize(new java.awt.Dimension(250, 30));
        cpassTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassTFActionPerformed(evt);
            }
        });

        passTF.setPreferredSize(new java.awt.Dimension(250, 30));
        passTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTFActionPerformed(evt);
            }
        });

        dobTF.setPreferredSize(new java.awt.Dimension(250, 30));

        tpTF.setPreferredSize(new java.awt.Dimension(250, 30));
        tpTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpTFActionPerformed(evt);
            }
        });

        courseTF.setPreferredSize(new java.awt.Dimension(250, 30));

        nameTF.setPreferredSize(new java.awt.Dimension(250, 30));

        intakeTF.setPreferredSize(new java.awt.Dimension(250, 30));

        unameTF.setPreferredSize(new java.awt.Dimension(250, 30));

        tpL.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        tpL.setText("TP Number");
        tpL.setPreferredSize(new java.awt.Dimension(140, 30));

        dobL.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        dobL.setText("DoB");
        dobL.setPreferredSize(new java.awt.Dimension(140, 30));

        intakeL.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        intakeL.setText("Intake");
        intakeL.setPreferredSize(new java.awt.Dimension(140, 30));

        courseL.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        courseL.setText("Specialism");
        courseL.setPreferredSize(new java.awt.Dimension(140, 30));

        cpassL.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cpassL.setText("Confirm Password");
        cpassL.setPreferredSize(new java.awt.Dimension(140, 30));

        unameL.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        unameL.setText("Username");
        unameL.setPreferredSize(new java.awt.Dimension(140, 30));

        emailL.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        emailL.setText("Email Address-Vaild-");
        emailL.setPreferredSize(new java.awt.Dimension(140, 30));

        passL.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        passL.setText("Password");
        passL.setPreferredSize(new java.awt.Dimension(140, 30));

        backB.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        backB.setText("Back");
        backB.setPreferredSize(new java.awt.Dimension(100, 40));
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        registerB.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        registerB.setText("Register");
        registerB.setPreferredSize(new java.awt.Dimension(100, 40));
        registerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpassL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(cpassTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(tpL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tpTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(courseL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dobL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dobTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(courseTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(intakeL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(unameL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(emailL, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(unameTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(intakeTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(registerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tpL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intakeTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intakeL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unameTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unameL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpassTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpassL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        nameL.getAccessibleContext().setAccessibleName("nameL");
        emailTF.getAccessibleContext().setAccessibleName("emailTF");
        emailTF.getAccessibleContext().setAccessibleDescription("");
        cpassTF.getAccessibleContext().setAccessibleName("cpassTF");
        passTF.getAccessibleContext().setAccessibleName("passTF");
        dobTF.getAccessibleContext().setAccessibleName("dobTF");
        tpTF.getAccessibleContext().setAccessibleName("tpTF");
        courseTF.getAccessibleContext().setAccessibleName("corseTF");
        nameTF.getAccessibleContext().setAccessibleName("nameTF");
        intakeTF.getAccessibleContext().setAccessibleName("intakeTF");
        unameTF.getAccessibleContext().setAccessibleName("unameTF");
        tpL.getAccessibleContext().setAccessibleName("tpL");
        dobL.getAccessibleContext().setAccessibleName("dobL");
        intakeL.getAccessibleContext().setAccessibleName("intakeL");
        courseL.getAccessibleContext().setAccessibleName("courseL");
        cpassL.getAccessibleContext().setAccessibleName("cpassL");
        unameL.getAccessibleContext().setAccessibleName("unameL");
        emailL.getAccessibleContext().setAccessibleName("emailL");
        passL.getAccessibleContext().setAccessibleName("passL");
        passL.getAccessibleContext().setAccessibleDescription("");
        backB.getAccessibleContext().setAccessibleName("backB");
        registerB.getAccessibleContext().setAccessibleName("registerB");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cpassTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpassTFActionPerformed

    private void passTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTFActionPerformed

    private void tpTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpTFActionPerformed

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTFActionPerformed
   
    private void registerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBActionPerformed

        if (passTF.getText().contentEquals(cpassTF.getText())) //Checking for Confirm Password
        {  
        boolean f,e;
        try
        {
          
            Registry registry = LocateRegistry.getRegistry(1044); //Registry Setup
            Interf service = (Interf)registry.lookup("login"); //Interface Lookup
            f = service.checkUser(unameTF.getText()); //Checking Username Availability
            System.out.println(f);
            if (f==true) //if Username Exist
        {
            JOptionPane.showMessageDialog(null,"Username is being used.\nPlease try another username!");
            unameTF.setText("");
        }
            else //if Username not Exist. Register new account
        {    
            e = service.register(nameTF.getText(), tpTF.getText(), dobTF.getText(), courseTF.getText(), intakeTF.getText(), unameTF.getText(), passTF.getText(), emailTF.getText());        
            
            
            
            //Preparing to send Email Acknowledgement
            String to = emailTF.getText(); //Getting User Email
            String subject = ("Library Information System"); //Email's Subject
            String message = ("Your Library Informarion System's Account with Username: ")+unameTF.getText()+
                    ("\nhas been created.\n You can now Login to Library Information System");//Emails Message for new user
                
            String user = "abdulraoufswehli58@gmail.com"; //host email id
            String pass = "RF1631997"; //host email passowrd

            SendEmail.send(to,subject, message, user, pass); //passing data to another class to sene email
            
            
            JOptionPane.showMessageDialog(null,"Congrasts!! Registration is done\nEmail with your details has been sent!"); //Registration Notification
            close();
            Login w = new Login();
            w.setVisible(true);
        }
        }
        catch (Exception ex){  
        }

    }//GEN-LAST:event_registerBActionPerformed
       else
       {      
       JOptionPane.showMessageDialog(null,"Password does not match.\nPlease re-enter it!"); //if password not matched
       passTF.setText("");
       cpassTF.setText("");
       }
    }
    
    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        // TODO add your handling code here:
        close();
        Main w = new Main();
        w.setVisible(true);
    }//GEN-LAST:event_backBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    private javax.swing.JLabel courseL;
    private javax.swing.JTextField courseTF;
    private javax.swing.JLabel cpassL;
    private javax.swing.JPasswordField cpassTF;
    private javax.swing.JLabel dobL;
    private javax.swing.JTextField dobTF;
    private javax.swing.JLabel emailL;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel intakeL;
    private javax.swing.JTextField intakeTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel passL;
    private javax.swing.JPasswordField passTF;
    private javax.swing.JButton registerB;
    private javax.swing.JLabel tpL;
    private javax.swing.JTextField tpTF;
    private javax.swing.JLabel unameL;
    private javax.swing.JTextField unameTF;
    // End of variables declaration//GEN-END:variables
    private void close()
    {
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }
    @Override
    public Socket createSocket(String host, int port) throws IOException {
        SocketFactory factory = SSLSocketFactory.getDefault();
        Socket socket = factory.createSocket(host,port);
        return socket;
    }
}
