
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TotalSaleReports extends javax.swing.JInternalFrame {

  
    public TotalSaleReports(int i) 
    { super("!!!TotalSaleReports!!!");
        initComponents();
        if(i==1){
        b1.setVisible(true);
        }
        else b1.setVisible(false);
        
        
        dp1.setDate(new java.util.Date());
          dp2.setDate(new java.util.Date());
          try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
         
         
             
          PreparedStatement ps=c.prepareStatement("Select sum(TotalBill) from TotalSale where Date between ? and ? ");
         ps.setDate(1, new java.sql.Date(dp1.getDate().getTime()));
           ps.setDate(2, new java.sql.Date(dp2.getDate().getTime()));
            ResultSet rs = ps.executeQuery();
          if(rs.next()){
              l1.setText(""+rs.getInt(1));
          }
             DefaultTableModel m1=(DefaultTableModel)jt.getModel();
      
           PreparedStatement ps1=c.prepareStatement("Select * from TotalSale where Date between ? and ? ");
         ps1.setDate(1, new java.sql.Date(dp1.getDate().getTime()));
           ps1.setDate(2, new java.sql.Date(dp2.getDate().getTime()));
            ResultSet rs1 = ps1.executeQuery();
           
            
          while(rs1.next())
          {
              Object []row={rs1.getString(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5),rs1.getString(6),rs1.getString(7),rs1.getString(8),rs1.getString(9),rs1.getString(10)};
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
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dp1 = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dp2 = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();

        getContentPane().setLayout(null);

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
        dp1.setBounds(500, 10, 160, 40);

        jt.setForeground(new java.awt.Color(0, 51, 204));
        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BillNo", "CustomerName", "PhoneNo", "Address", "TotalBill", "OrderType", "PaymentType", "Status", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(jt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 90, 1340, 480);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(640, 630, 140, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Grand Total :  Rs.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(580, 580, 120, 60);

        l1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 51, 204));
        l1.setText("00");
        getContentPane().add(l1);
        l1.setBounds(710, 580, 160, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText(" Choose Date To ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 10, 120, 40);

        dp2.setForeground(new java.awt.Color(0, 51, 204));
        dp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp2ActionPerformed(evt);
            }
        });
        getContentPane().add(dp2);
        dp2.setBounds(710, 10, 150, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("From");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(670, 10, 40, 40);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(490, 630, 140, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp1ActionPerformed
    if(dp1!=null){  
        try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
            Statement  st=c.createStatement();
          PreparedStatement ps=c.prepareStatement("Select sum(TotalBill) from TotalSale where Date between ? and ? ");
         ps.setDate(1, new java.sql.Date(dp1.getDate().getTime()));
           ps.setDate(2, new java.sql.Date(dp2.getDate().getTime()));
            ResultSet rs = ps.executeQuery();
          if(rs.next()){
              l1.setText(""+rs.getInt(1));
          }
          
          
          
          DefaultTableModel m1=(DefaultTableModel)jt.getModel();
          m1.setRowCount(0);
           PreparedStatement ps1=c.prepareStatement("Select * from TotalSale where Date between ? and ? ");
         ps1.setDate(1, new java.sql.Date(dp1.getDate().getTime()));
           ps1.setDate(2, new java.sql.Date(dp2.getDate().getTime()));
            ResultSet rs1 = ps1.executeQuery();
           
            
          while(rs1.next())
          {
              Object []row={rs1.getString(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5),rs1.getString(6),rs1.getString(7),rs1.getString(8),rs1.getString(9),rs1.getString(10)};
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
    else JOptionPane.showMessageDialog(this,"Select a Date");// TODO add your handling code here:
    }//GEN-LAST:event_dp1ActionPerformed

    private void dp1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dp1PropertyChange
       
        
    }//GEN-LAST:event_dp1PropertyChange

    private void dp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp2ActionPerformed
if(dp2!=null){  
        try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
            Statement  st=c.createStatement();
          PreparedStatement ps=c.prepareStatement("Select sum(TotalBill) from TotalSale where Date between ? and ? ");
         ps.setDate(1, new java.sql.Date(dp1.getDate().getTime()));
           ps.setDate(2, new java.sql.Date(dp2.getDate().getTime()));
            ResultSet rs = ps.executeQuery();
          if(rs.next()){
              l1.setText(""+rs.getInt(1));
          }
          
          
          
          DefaultTableModel m1=(DefaultTableModel)jt.getModel();
          m1.setRowCount(0);
           PreparedStatement ps1=c.prepareStatement("Select * from TotalSale where Date between ? and ? ");
         ps1.setDate(1, new java.sql.Date(dp1.getDate().getTime()));
           ps1.setDate(2, new java.sql.Date(dp2.getDate().getTime()));
            ResultSet rs1 = ps1.executeQuery();
           
            
          while(rs1.next())
          {
              Object []row={rs1.getString(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5),rs1.getString(6),rs1.getString(7),rs1.getString(8),rs1.getString(9),rs1.getString(10)};
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
    else JOptionPane.showMessageDialog(this,"Select a Date");        // TODO add your handling code here:
    }//GEN-LAST:event_dp2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
    
        if(jt.getSelectedRow()>-1){
            try{
                String tp="";
                String in="";
                Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
            Statement  st=c.createStatement();
            String s1=(String)jt.getValueAt(jt.getSelectedRow(), 0);
            int s=Integer.parseInt(s1);
            ResultSet rs=st.executeQuery("Select * from sale where BillNo="+s);
            while(rs.next()){
                in=in+rs.getString(5)+"-"+rs.getString(6)+"-"+rs.getString(8)+"-"+rs.getString(9)+"--";
                tp=rs.getString(10);
            }
            printbill p=new printbill(in,s,(String)jt.getValueAt(jt.getSelectedRow(), 4),tp);
             c.close();
         rs.close();
         st.close(); 
       
            }
            
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please Select Row First");
        }
    }//GEN-LAST:event_b1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private org.jdesktop.swingx.JXDatePicker dp1;
    private org.jdesktop.swingx.JXDatePicker dp2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JLabel l1;
    // End of variables declaration//GEN-END:variables
}
