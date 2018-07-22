
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class EditItem extends javax.swing.JInternalFrame {

  
    public EditItem() {
      super("!!!EditItem!!!");
        initComponents();
        demo();
       
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt2 = new javax.swing.JTable();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("New item Size");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 90, 130, 30);

        t3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t3.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t3);
        t3.setBounds(340, 90, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("New Item Price ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 130, 130, 30);

        t4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t4.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t4);
        t4.setBounds(340, 130, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Old Item Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 10, 130, 40);

        t1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t1);
        t1.setBounds(340, 10, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("New Item Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 50, 120, 40);

        t2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t2);
        t2.setBounds(340, 50, 130, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 390, 130, 40);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/51.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 390, 130, 40);

        jt2.setForeground(new java.awt.Color(0, 51, 204));
        jt2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Item Name", "Size", "Prize", "Category Name"
            }
        ));
        jScrollPane1.setViewportView(jt2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 170, 560, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void demo()
{
             try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
             DefaultTableModel m1=(DefaultTableModel)jt2.getModel();
          ResultSet rs= st.executeQuery("Select * from Item");
          while(rs.next())
          {
              Object []row={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
              m1.addRow(row);
          }
          
        }
          catch(ClassNotFoundException | SQLException | NumberFormatException e)
          {
              System.out.println(e);
          }
}


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try
        {
           if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals(""))
           {
               JOptionPane.showMessageDialog(this,"Please Fill All The Fields");
           }
           else
           {
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
            ResultSet rs=st.executeQuery("select * from Item where ItemName='"+t1.getText()+"'");
            if(rs.next())
            {
           st.executeUpdate("update Item set ItemName='"+t2.getText()+"',Size='"+t3.getText()+"',Price='"+t4.getText()+"' where ItemName='"+t1.getText()+"'");
           t1.setText("");
           t2.setText("");
           t3.setText("");
           t4.setText("");
            JOptionPane.showMessageDialog(this,"Successfully Updated");
            EditItem ei= new EditItem();   
 JDesktopPane jd=this.getDesktopPane();
 jd.add(ei);
 ei.setVisible(true);
ei.setBounds(430, 150, 581, 480);
            dispose();
            }
            else
            {
            JOptionPane.showMessageDialog(this,"Entered Item Does Not Exist");
            }
            
            c.close();
         rs.close();
         st.close(); 
        }
        }
          catch(Exception e)
          {
              System.out.println(e);
          }              
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
