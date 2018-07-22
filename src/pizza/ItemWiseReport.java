
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ItemWiseReport extends javax.swing.JInternalFrame {

   
    public ItemWiseReport() {
         super("!!!ItemWiseReport!!!");
        initComponents();
        DefaultTableModel m2=(DefaultTableModel)jt.getModel();
        try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
           PreparedStatement  ps=c.prepareStatement("Select ItemName,Quantity from Sale where ItemName LIKE ? group by ItemName ORDER BY Quantity desc");
           ps.setString(1,""+t1.getText()+"%");
          
          ResultSet rs= ps.executeQuery();
         
          while(rs.next())
          {
                      Object []row={rs.getString(1),rs.getString(2)};
                        m2.addRow(row);

          }
         
          c.close();
          ps.close();
          rs.close();
          
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Item Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 20, 127, 36);

        t1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 51, 204));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(230, 20, 150, 40);

        jt.setForeground(new java.awt.Color(0, 51, 204));
        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemName", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 90, 570, 250);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/30.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 350, 150, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
      
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyReleased
 DefaultTableModel m2=(DefaultTableModel)jt.getModel();
 m2.setRowCount(0);
 try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
           PreparedStatement  ps=c.prepareStatement("Select ItemName,Quantity from Sale where ItemName LIKE ? group by ItemName ORDER BY Quantity desc");
           
           ps.setString(1,""+t1.getText()+"%");
          
          ResultSet rs= ps.executeQuery();
         
          while(rs.next())
          {
                      Object []row={rs.getString(1),rs.getString(2)};
                        m2.addRow(row);

          }
         
          c.close();
          ps.close();
          rs.close();
          
        }
          catch(ClassNotFoundException | SQLException | NumberFormatException e)
          {
              JOptionPane.showMessageDialog(this,e);
          } 
    }//GEN-LAST:event_t1KeyReleased

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
     }//GEN-LAST:event_t1KeyTyped

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
       

    }//GEN-LAST:event_t1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
