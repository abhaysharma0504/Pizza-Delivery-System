
package pizza;
import java.sql.*;
import javax.swing.*;


public class AddEmployee extends javax.swing.JInternalFrame {
int i;
   
    public AddEmployee() {
        super("!!!AddEmployee!!!");
        initComponents();
        i=1; 
        try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
          ResultSet rs= st.executeQuery("Select Max(EmpId) from Employee");
          if(rs.next())
          {
          i = rs.getInt(1);
          
          
          i=i+1;
          
          } 
                    
           c.close();
         rs.close();
         st.close(); 
         
        }
          catch(ClassNotFoundException | SQLException | NumberFormatException e)
          {
              System.out.println(e);
          }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        l3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l3.setForeground(new java.awt.Color(0, 51, 204));
        l3.setText("Contact:");
        getContentPane().add(l3);
        l3.setBounds(40, 140, 125, 41);

        l4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l4.setForeground(new java.awt.Color(0, 51, 204));
        l4.setText("Password:");
        getContentPane().add(l4);
        l4.setBounds(40, 210, 125, 41);

        l2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l2.setForeground(new java.awt.Color(0, 51, 204));
        l2.setText("City:");
        getContentPane().add(l2);
        l2.setBounds(40, 80, 125, 41);

        l1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 51, 204));
        l1.setText("Name:");
        getContentPane().add(l1);
        l1.setBounds(40, 20, 125, 41);

        t2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t2);
        t2.setBounds(230, 80, 120, 40);

        t3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t3.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t3);
        t3.setBounds(230, 140, 120, 40);

        t4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t4.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t4);
        t4.setBounds(230, 210, 120, 40);

        t1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 51, 204));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(230, 20, 120, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 280, 120, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 280, 120, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
       
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{   
                   Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
            if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please Fill All The Fields");
            }
            else
            {
          st.executeUpdate("insert into Employee values("+i+",'"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"')");
          st.executeUpdate("insert into cashier values('"+t1.getText()+"','"+t4.getText()+"')");
          t1.setText("");t2.setText("");t3.setText("");t4.setText("");
           JOptionPane.showMessageDialog(this,"Successfully Added");
            c.close();
     
         st.close(); 
        
           dispose();
            }
            }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        } 
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
