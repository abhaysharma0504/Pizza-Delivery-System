
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CancelReports extends javax.swing.JInternalFrame {

  
    public CancelReports() {
        super("!!!CancelReports!!!");
        initComponents();
dp.setDate(new java.util.Date());

        

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        dp = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/30.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(600, 660, 150, 59);

        dp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpActionPerformed(evt);
            }
        });
        dp.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dpPropertyChange(evt);
            }
        });
        getContentPane().add(dp);
        dp.setBounds(640, 20, 150, 40);

        jt.setForeground(new java.awt.Color(0, 51, 204));
        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BillNo", "CustomerName", "PhoneNo", "Address", "TotalBill", "Reason", "Date"
            }
        ));
        jScrollPane1.setViewportView(jt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 80, 1340, 570);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Choose Date");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(540, 20, 90, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dpPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dpPropertyChange
 if(dp!=null){  
        try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
            Statement  st=c.createStatement();
          DefaultTableModel m1=(DefaultTableModel)jt.getModel();
          PreparedStatement ps1=c.prepareStatement("Select * from Cancel where Date=?");
          ps1.setDate(1, new java.sql.Date(dp.getDate().getTime()));
            ResultSet rs1 = ps1.executeQuery();
           m1.setRowCount(0);
          while(rs1.next())
          {
              Object []row={rs1.getString(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5),rs1.getString(6),rs1.getString(7)};
              m1.addRow(row);
          }
           c.close();
      
         st.close(); 
         ps1.close();
         rs1.close();
        }
          catch(ClassNotFoundException | SQLException | NumberFormatException e)
          {
              JOptionPane.showMessageDialog(this,e);
          }
        }
           
    }//GEN-LAST:event_dpPropertyChange

    private void dpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpActionPerformed
       
    }//GEN-LAST:event_dpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker dp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    // End of variables declaration//GEN-END:variables
}
