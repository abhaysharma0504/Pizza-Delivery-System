
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RemoveEmployee extends javax.swing.JInternalFrame {

  
    public RemoveEmployee() {
          super("!!!RemoveEmployee!!!");
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
          ResultSet rs= st.executeQuery("Select * from Employee");
          while(rs.next())
          {
              Object []row={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
              m1.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jScrollPane1.setForeground(new java.awt.Color(0, 51, 204));

        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpId", "EmpName", "Address", "Contact", "Password"
            }
        ));
        jScrollPane1.setViewportView(jt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 15, 510, 250);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 280, 120, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 280, 120, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(jt.getSelectedRow()>-1){
        try
        {
           
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
       
            String s1=(String)jt.getValueAt(jt.getSelectedRow(),0);
            String s2=(String)jt.getValueAt(jt.getSelectedRow(),1);
        
      int s = Integer.parseInt(s1);
    
           st.executeUpdate("delete from Employee where EmpId="+s);
           st.executeUpdate("delete from cashier where UserName='"+s2+"'");
      
           JOptionPane.showMessageDialog(this, "Succesfully Deleted");
       
            RemoveEmployee rd= new RemoveEmployee();
      
 JDesktopPane jd=this.getDesktopPane();
 jd.add(rd);
 rd.setVisible(true);
rd.setBounds(430, 300, 500, 380);
 c.close();
        
         st.close(); 
      
dispose();
      
        
        }
          catch(Exception e)
          {
              System.out.println(e);
          }                  
   }else{
       JOptionPane.showMessageDialog(this, "Please Select The Row First");
   }      
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    // End of variables declaration//GEN-END:variables
}
