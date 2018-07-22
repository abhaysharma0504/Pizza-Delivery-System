
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VoidOrder extends javax.swing.JInternalFrame {

   
    public VoidOrder() {
        super("!!!VoidOrder!!!");
        initComponents();
        demo();
    }
    public void demo()
    {
         try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
             DefaultTableModel m1=(DefaultTableModel)jt.getModel();
          ResultSet rs= st.executeQuery("Select * from TotalSale where status='Pending'");
          while(rs.next())
          {
              Object []row={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)};
              m1.addRow(row);
          }
         c.close();
         rs.close();
         st.close();
          
        }
          catch(ClassNotFoundException | SQLException | NumberFormatException e)
          {
              JOptionPane.showMessageDialog(this,e);
          }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(null);

        jScrollPane1.setForeground(new java.awt.Color(0, 51, 204));

        jt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BillNo", "Customer Name", "Phone Number", "Address", "Total Bill", "Order Type", "Payment Type", "Status", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(jt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 10, 890, 238);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 280, 111, 41);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(jt.getSelectedRow()>-1){
        try
        {
            String u=JOptionPane.showInputDialog(this,"Enter The Reason");
           
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
            PreparedStatement ps=c.prepareStatement("insert into cancel values(?,?,?,?,?,?,?)");
            
                  
            String s1=(String)jt.getValueAt(jt.getSelectedRow(),0);
            String s2=(String)jt.getValueAt(jt.getSelectedRow(),1);
            String s3=(String)jt.getValueAt(jt.getSelectedRow(),2);
            String s4=(String)jt.getValueAt(jt.getSelectedRow(),3);
            String s5=(String)jt.getValueAt(jt.getSelectedRow(),4);
            int n=Integer.parseInt(s5);
            int s = Integer.parseInt(s1);
            ps.setString(1,s1);
            ps.setString(2,s2);
            ps.setString(3,s3);
            ps.setString(4,s4);
            ps.setString(5,s5);
            
            ps.setDate(7,new java.sql.Date(new java.util.Date().getTime()));
            ps.setString(6,u);
            ps.executeUpdate();
           st.executeUpdate("delete from TotalSale where BillNo="+s);
           st.executeUpdate("delete from Sale where BillNo="+s);
      
           JOptionPane.showMessageDialog(this, "Succesfully Canceled");
      
         c.close();
         ps.close();
         st.close();
          
dispose();

      
        
        }
          catch(Exception e)
          {
              System.out.println(e);
          }                   // TODO add your handling code here:
   }else{
       JOptionPane.showMessageDialog(this, "Please Select The Row First");
   }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    // End of variables declaration//GEN-END:variables
}
