
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CashOut extends javax.swing.JInternalFrame {

 
    public CashOut() {
           super("!!!CashOut!!!");
        initComponents();
        p1.setVisible(false);
          dp.setDate(new java.util.Date());
       try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
             DefaultTableModel m1=(DefaultTableModel)jt.getModel();
          PreparedStatement ps1=c.prepareStatement("Select * from TotalSale where Date=? and Status=?");
          ps1.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
          ps1.setString(2,"Pending");
            ResultSet rs = ps1.executeQuery();
          while(rs.next())
          {
              Object []row={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)};
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        dp = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        p1 = new javax.swing.JPanel();
        rb2 = new javax.swing.JCheckBox();
        rb3 = new javax.swing.JCheckBox();
        rb1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        dp.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(dp);
        dp.setBounds(670, 20, 160, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Choose Date");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 20, 110, 30);

        jt.setForeground(new java.awt.Color(0, 51, 204));
        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        jScrollPane1.setViewportView(jt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 1340, 410);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(670, 490, 130, 90);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/21.png"))); // NOI18N
        jButton2.setText("Make Payment");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(460, 490, 130, 90);

        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.setLayout(null);

        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rb2.setForeground(new java.awt.Color(0, 51, 204));
        rb2.setText("Card");
        p1.add(rb2);
        rb2.setBounds(110, 10, 90, 90);

        buttonGroup1.add(rb3);
        rb3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rb3.setForeground(new java.awt.Color(0, 51, 204));
        rb3.setText("E-Wallet");
        p1.add(rb3);
        rb3.setBounds(200, 10, 100, 90);

        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rb1.setForeground(new java.awt.Color(0, 51, 204));
        rb1.setSelected(true);
        rb1.setText("Cash");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        p1.add(rb1);
        rb1.setBounds(10, 10, 110, 90);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        p1.add(jButton3);
        jButton3.setBounds(310, 10, 130, 90);

        getContentPane().add(p1);
        p1.setBounds(420, 590, 450, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
      
    }//GEN-LAST:event_rb1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(jt.getSelectedRow()>-1)
{
    p1.setVisible(true);
}       
else{
JOptionPane.showMessageDialog(this,"Select a Row");}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  try
        {  String s=new String();
            if(rb1.isSelected())
            {
                s=rb1.getActionCommand();
            }
            else if(rb2.isSelected())
            {
                s=rb2.getActionCommand();
            }
            else s=rb3.getActionCommand();
             
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
             DefaultTableModel m1=(DefaultTableModel)jt.getModel();
          PreparedStatement ps1=c.prepareStatement("update TotalSale set Status=?,PaymentType=? where BillNo=? ");
          ps1.setString(1,"Done");
          ps1.setString(2,s);
          ps1.setString(3,(String)jt.getValueAt(jt.getSelectedRow(),0));
          ps1.executeUpdate();
           c.close();
         
         st.close(); 
         ps1.close();
        
          dispose();
        }
          catch(ClassNotFoundException | SQLException | NumberFormatException e)
          {
              JOptionPane.showMessageDialog(this,e);
          }        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private org.jdesktop.swingx.JXDatePicker dp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JPanel p1;
    private javax.swing.JCheckBox rb1;
    private javax.swing.JCheckBox rb2;
    private javax.swing.JCheckBox rb3;
    // End of variables declaration//GEN-END:variables
}
