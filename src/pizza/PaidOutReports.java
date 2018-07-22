
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.*;


public class PaidOutReports extends javax.swing.JInternalFrame {

   
    public PaidOutReports() {
         super("!!!PaidOutReports!!!");
        initComponents();
        dp.setDate(new java.util.Date());
          try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
         
         
             
          PreparedStatement ps=c.prepareStatement("Select sum(ExpenseAmount) from expense where Date=?");
          ps.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
            ResultSet rs = ps.executeQuery();
          if(rs.next()){
              l1.setText(""+rs.getInt(1));
          }
           c.close();
         rs.close();
         st.close(); 
        
        }
          catch(ClassNotFoundException | SQLException | NumberFormatException e)
          {
              JOptionPane.showMessageDialog(this,e);
          }       
          
          
          
         try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
             DefaultTableModel m1=(DefaultTableModel)jt.getModel();
          PreparedStatement ps1=c.prepareStatement("Select * from expense where Date=?");
          ps1.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
            ResultSet rs = ps1.executeQuery();
          while(rs.next())
          {
              Object []row={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
              m1.addRow(row);
          }
           c.close();
         rs.close();
         st.close(); 
         ps1.close();
        
        }
          catch(ClassNotFoundException | SQLException | NumberFormatException e)
          {
              System.out.println(e);
          }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        dp = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        dp.setForeground(new java.awt.Color(0, 51, 204));
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
        dp.setBounds(600, 30, 150, 30);

        jt.setForeground(new java.awt.Color(0, 51, 204));
        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Expense Id", "Expense Description", "Amount", "Date"
            }
        ));
        jScrollPane1.setViewportView(jt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 120, 1340, 402);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Choose Date");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 30, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("GRAND TOTAL  Rs.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 580, 116, 30);

        l1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(l1);
        l1.setBounds(620, 580, 210, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/30.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(500, 620, 140, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpActionPerformed
          
    }//GEN-LAST:event_dpActionPerformed

    private void dpPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dpPropertyChange
        
         if(dp!=null){  
        try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
            Statement  st=c.createStatement();
          PreparedStatement ps=c.prepareStatement("Select sum(ExpenseAmount) from expense where Date=?");
          ps.setDate(1, new java.sql.Date(dp.getDate().getTime()));
            ResultSet rs = ps.executeQuery();
          if(rs.next()){
              l1.setText(""+rs.getInt(1));
          }
          DefaultTableModel m1=(DefaultTableModel)jt.getModel();
          PreparedStatement ps1=c.prepareStatement("Select * from expense where Date=?");
          ps1.setDate(1, new java.sql.Date(dp.getDate().getTime()));
            ResultSet rs1 = ps1.executeQuery();
            m1.setRowCount(0);
          while(rs1.next())
          {
              Object []row={rs1.getString(1),rs1.getString(2),rs1.getString(3),rs1.getString(4)};
              m1.addRow(row);
          }
           c.close();
         rs.close();
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();       
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker dp;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JTable jt;
    private javax.swing.JLabel l1;
    // End of variables declaration//GEN-END:variables
}
