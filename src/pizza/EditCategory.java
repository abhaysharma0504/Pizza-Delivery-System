
package pizza;

import java.sql.*;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EditCategory extends javax.swing.JInternalFrame {

   
    public EditCategory() {
        super("!!!EditCategory!!!");
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
             DefaultTableModel m2=(DefaultTableModel)jt1.getModel();
          ResultSet rs= st.executeQuery("Select * from Category");
          while(rs.next())
          {
              Object []row={rs.getString(1),rs.getString(2)};
              m2.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTable();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Old Category Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 170, 40);

        t1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t1);
        t1.setBounds(210, 30, 150, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("New Category Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 170, 40);

        t2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t2);
        t2.setBounds(210, 90, 150, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 350, 130, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/51.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 350, 130, 40);

        jt1.setForeground(new java.awt.Color(0, 51, 204));
        jt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category Id", "Category Name"
            }
        ));
        jScrollPane1.setViewportView(jt1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 140, 560, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(t1.getText().equals(""))
{
    JOptionPane.showMessageDialog(this,"Please Fill All The Fields");
}
else{
        try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
            ResultSet rs=st.executeQuery("select * from category where CategoryName='"+t1.getText()+"'");
            if(rs.next())
            {
           st.executeUpdate("update category set CategoryName='"+t2.getText()+"' where CategoryName='"+t1.getText()+"'");
          st.executeUpdate("update Item set CategoryName='"+t2.getText()+"' where CategoryName='"+t1.getText()+"'");
           t1.setText("");
           t2.setText("");
            JOptionPane.showMessageDialog(this,"Successfully Updated");
              dispose();
            

          
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Entered Category Does Not Exist");
            }
             c.close();
         rs.close();
         st.close(); 
       
        }
        
          catch(Exception e)
          {
             
            JOptionPane.showMessageDialog(this,e);
         }

}
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
