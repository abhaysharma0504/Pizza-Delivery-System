
package pizza;
import java.sql.*;
import javax.swing.*;

public class ChangePassword extends javax.swing.JInternalFrame {

    
    public ChangePassword() {
        super("!!!ChangePassword!!!");
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        p2 = new javax.swing.JPasswordField();
        p3 = new javax.swing.JPasswordField();
        p1 = new javax.swing.JPasswordField();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        l4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        l5 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        l2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l2.setForeground(new java.awt.Color(0, 51, 204));
        l2.setText("New Password:");
        getContentPane().add(l2);
        l2.setBounds(50, 140, 112, 40);

        l1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 51, 204));
        l1.setText("Current Password:");
        getContentPane().add(l1);
        l1.setBounds(50, 80, 112, 40);

        l3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l3.setForeground(new java.awt.Color(0, 51, 204));
        l3.setText("Confirm Password:");
        getContentPane().add(l3);
        l3.setBounds(50, 200, 112, 40);

        p2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        p2.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(p2);
        p2.setBounds(230, 140, 130, 40);

        p3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        p3.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(p3);
        p3.setBounds(230, 200, 130, 40);

        p1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        p1.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(p1);
        p1.setBounds(230, 80, 130, 40);

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(220, 270, 110, 50);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(50, 270, 110, 50);

        l4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l4.setForeground(new java.awt.Color(0, 51, 204));
        l4.setText("UserName:");
        getContentPane().add(l4);
        l4.setBounds(50, 30, 100, 30);

        t1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t1);
        t1.setBounds(230, 20, 130, 40);

        l5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(l5);
        l5.setBounds(70, 310, 320, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

            rs=st.executeQuery("select * from cashier where Pwd='"+p1.getText()+"' and UserName='"+t1.getText()+"'");
            if(rs.next())
            {
                
                st.executeUpdate("update cashier set Pwd='"+p2.getText()+"' where UserName='"+t1.getText()+"'");
                t1.setText("");
                p1.setText("");
                p2.setText("");
                p3.setText("");
                    
                JOptionPane.showMessageDialog(this,"Your Password Has Changed Successfully");
            dispose();
            }
            else
            {
                l5.setText("          Invalid UserName Or Password");
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
           l5.setText("           Confirmed Password Is Not Matched");
       }
       }
       catch(Exception E)
       {
           
       }
               
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        
        dispose();
    }//GEN-LAST:event_b2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JPasswordField p3;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
