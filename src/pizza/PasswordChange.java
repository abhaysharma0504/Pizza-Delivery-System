
package pizza;
import java.sql.*;
import javax.swing.*;

public class PasswordChange extends javax.swing.JInternalFrame {

    public PasswordChange() {
         super("!!!PasswordChange!!!");
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        p2 = new javax.swing.JPasswordField();
        p3 = new javax.swing.JPasswordField();
        p1 = new javax.swing.JPasswordField();
        l4 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        l1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 51, 204));
        l1.setText("Current Password");
        getContentPane().add(l1);
        l1.setBounds(60, 50, 133, 40);

        l2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l2.setForeground(new java.awt.Color(0, 51, 204));
        l2.setText("New Password");
        getContentPane().add(l2);
        l2.setBounds(60, 110, 133, 40);

        l3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l3.setForeground(new java.awt.Color(0, 51, 204));
        l3.setText("Confirm Password");
        getContentPane().add(l3);
        l3.setBounds(60, 170, 133, 40);

        p2.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(p2);
        p2.setBounds(220, 110, 150, 40);

        p3.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(p3);
        p3.setBounds(220, 170, 150, 40);

        p1.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(p1);
        p1.setBounds(220, 50, 150, 40);

        l4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(l4);
        l4.setBounds(100, 290, 230, 40);

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(200, 240, 110, 40);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(60, 240, 110, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
dispose();
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
try{
        if(p2.getText().equals(p3.getText()))
       {
        try 
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
           
            ResultSet rs;

            rs=st.executeQuery("select * from admin where Pwd='"+p1.getText()+"'");
            if(rs.next())
            {
                
                st.executeUpdate("update admin set Pwd='"+p2.getText()+"' where Pwd='"+p1.getText()+"'");
                p1.setText("");
                p2.setText("");
                p3.setText("");
                l4.setText("");
                JOptionPane.showMessageDialog(this,"Your Password Has Changed Successfully");
            dispose();
            }
            else
            {
                l4.setText("          Invalid Current Password");
            }
             c.close();
         rs.close();
         st.close(); 
       
       }
       catch(Exception e)
       {
           
       }
      }
       else
       {
           l4.setText("   Confirmed Password Did Not Match");
       }
       }
       catch(Exception E)
       {
           
       }        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JPasswordField p3;
    // End of variables declaration//GEN-END:variables
}
