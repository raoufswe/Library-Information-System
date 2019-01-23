
package LibraryInformationSystem;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.rmi.server.RMIClientSocketFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Abdurraouf Fathi
 */
public class searchBook extends javax.swing.JFrame implements RMIClientSocketFactory, Serializable {
    public searchBook() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameL = new javax.swing.JLabel();
        backB = new javax.swing.JButton();
        returnB = new javax.swing.JButton();
        b_idTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        borrowB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("APU Library Information System");

        nameL.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        nameL.setText("Please Enter Book ID");
        nameL.setPreferredSize(new java.awt.Dimension(140, 30));

        backB.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        backB.setText("Back");
        backB.setPreferredSize(new java.awt.Dimension(100, 40));
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        returnB.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        returnB.setText("Return");
        returnB.setPreferredSize(new java.awt.Dimension(100, 40));
        returnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBActionPerformed(evt);
            }
        });

        b_idTF.setPreferredSize(new java.awt.Dimension(250, 30));
        b_idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_idTFActionPerformed(evt);
            }
        });

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(bookTable);

        borrowB.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        borrowB.setText("Borrow");
        borrowB.setPreferredSize(new java.awt.Dimension(100, 40));
        borrowB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(borrowB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(returnB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(nameL, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_idTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_idTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrowB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed

        close();
        Select w = new Select();
        w.setVisible(true);
    }//GEN-LAST:event_backBActionPerformed

    private void returnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBActionPerformed

                        String b_id = b_idTF.getText();
			
			if(Implement.checkBook(b_id)){ //Checking Book Availability
			
			int i=Implement.returnbook(b_id); //if Book is Available
			if(i>0){
				JOptionPane.showMessageDialog(this,"Book Returned");
				
                                searchBook fn = new searchBook();
                                fn.setVisible(true);
                                this.setVisible(false);
                        }
                        else{
				JOptionPane.showMessageDialog(this,"Try Again"); //if Book is not Available
			}
			
			}else{
				JOptionPane.showMessageDialog(searchBook.this,"This Book is Not Available"); //if Book is not Available in List
			}
    }//GEN-LAST:event_returnBActionPerformed

    private void borrowBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowBActionPerformed
        // TODO add your handling code here:
                        String b_id = b_idTF.getText();
			
			if(Implement.checkBook(b_id)){ //Checking Book Availability
			
			int i=Implement.borrowbook(b_id); //if Book is Available
			if(i>0){
				JOptionPane.showMessageDialog(this,"Book Borrowed");
				
                                searchBook fn = new searchBook();
                                fn.setVisible(true);
                                this.setVisible(false);
                        }
                        else{
				JOptionPane.showMessageDialog(this,"Try Again"); //if Book is not Available
			}
			
			}else{
				JOptionPane.showMessageDialog(searchBook.this,"This Book is Not Available"); //if Book is not Available in List
			}
			   
    }//GEN-LAST:event_borrowBActionPerformed

    private void b_idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_idTFActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(searchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b_idTF;
    private javax.swing.JButton backB;
    public static javax.swing.JTable bookTable;
    private javax.swing.JButton borrowB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameL;
    private javax.swing.JButton returnB;
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
