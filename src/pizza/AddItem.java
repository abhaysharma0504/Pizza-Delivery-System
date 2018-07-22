
package pizza;
import java.sql.*;
import javax.swing.JOptionPane;

public class AddItem extends javax.swing.JInternalFrame {
int i;
  
    public AddItem() {
        super("!!!AddItem!!!");
        initComponents();
       i=1;
          try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
          ResultSet rs= st.executeQuery("Select MAX(ItemId) from Item");
          if(rs.next())
          {
           i=rs.getInt(1);
          
          
          i=i+1;
          
          }
           c.close();
         rs.close();
         st.close(); 
       
        }
          catch(ClassNotFoundException | SQLException | NumberFormatException e)
          {
              System.out.println(e);
          }          
        
        
        try{
                   Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
            ResultSet rs=st.executeQuery("Select * from Category ");
            while(rs.next())
            { cb1.addItem(rs.getString(2));
            }
             c.close();
         rs.close();
         st.close(); 
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Item Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 80, 120, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Size");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 120, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Price");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 180, 120, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Choose Category");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 10, 100, 50);

        cb1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cb1.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(cb1);
        cb1.setBounds(230, 20, 110, 30);

        t3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t3.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t3);
        t3.setBounds(230, 140, 110, 30);

        t4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t4.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t4);
        t4.setBounds(230, 190, 110, 30);

        t2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 51, 204));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(230, 80, 110, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 250, 120, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 250, 120, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
      
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
                   Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
            if(cb1.getSelectedItem().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please Fill All The Fields");
            }
            else
            {
          st.executeUpdate("insert into Item values("+i+",'"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+cb1.getSelectedItem()+"')");
          t2.setText("");t3.setText("");t4.setText("");
           JOptionPane.showMessageDialog(this,"Successfully Added");
            c.close();
       
         st.close(); 
        
           dispose();
            }
            }catch(Exception e){
            }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
