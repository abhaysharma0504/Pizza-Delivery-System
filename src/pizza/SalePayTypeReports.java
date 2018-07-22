
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class SalePayTypeReports extends javax.swing.JInternalFrame {

    
    public SalePayTypeReports() {
        super("!!!SalePayTypeReports!!!");
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        dp1 = new org.jdesktop.swingx.JXDatePicker();
        dp2 = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        b2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 410, 130, 50);

        dp1.setForeground(new java.awt.Color(0, 51, 204));
        dp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp1ActionPerformed(evt);
            }
        });
        dp1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dp1PropertyChange(evt);
            }
        });
        getContentPane().add(dp1);
        dp1.setBounds(170, 10, 120, 30);

        dp2.setForeground(new java.awt.Color(0, 51, 204));
        dp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp2ActionPerformed(evt);
            }
        });
        dp2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dp2PropertyChange(evt);
            }
        });
        getContentPane().add(dp2);
        dp2.setBounds(170, 60, 120, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("No Cash");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 330, 130, 40);

        t2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t2);
        t2.setBounds(170, 200, 110, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Cash");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 210, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Card");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 270, 130, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("E-Wallet");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 140, 130, 40);

        t3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t3.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t3);
        t3.setBounds(170, 330, 110, 40);

        t4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t4.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t4);
        t4.setBounds(170, 270, 110, 40);

        t1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t1);
        t1.setBounds(170, 140, 110, 40);

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(30, 410, 120, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Choose Date To");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 10, 110, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("From");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 60, 60, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp1ActionPerformed
      
    }//GEN-LAST:event_dp1ActionPerformed

    private void dp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp2ActionPerformed
       
    }//GEN-LAST:event_dp2ActionPerformed

    private void dp1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dp1PropertyChange

               
    }//GEN-LAST:event_dp1PropertyChange

    private void dp2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dp2PropertyChange
      
    }//GEN-LAST:event_dp2PropertyChange

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
if(dp1!=null){
        try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
            Statement  st=c.createStatement();
           PreparedStatement ps1=c.prepareStatement("Select sum(TotalBill) from TotalSale where PaymentType=? and Date between ? and ?  "); 
          ps1.setDate(2, new java.sql.Date(dp1.getDate().getTime()));
           ps1.setDate(3, new java.sql.Date(dp2.getDate().getTime()));
           ps1.setString(1,"E-Wallet");
           ResultSet rs1 = ps1.executeQuery();
           if(rs1.next()){
           t1.setText(rs1.getString(1)); 
            }
           
        
           ps1.setString(1,"Cash");
           rs1 = ps1.executeQuery();
           if(rs1.next()){
           t2.setText(rs1.getString(1)); 
            }
           
           
           
           ps1.setString(1,"No Cash");
           rs1 = ps1.executeQuery();
           if(rs1.next()){
           t3.setText(rs1.getString(1)); 
            }
           
           
           ps1.setString(1,"Card");
           rs1 = ps1.executeQuery();
           if(rs1.next()){
           t4.setText(rs1.getString(1)); 
            }
            c.close();
         
         st.close(); 
         ps1.close();
         rs1.close();
        }
        catch(ClassNotFoundException | SQLException e ){
    JOptionPane.showMessageDialog(this,e);
}  }
    }//GEN-LAST:event_b2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b2;
    private org.jdesktop.swingx.JXDatePicker dp1;
    private org.jdesktop.swingx.JXDatePicker dp2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
