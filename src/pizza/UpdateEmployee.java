
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class UpdateEmployee extends javax.swing.JInternalFrame {
String s1;
String s2;
int s;
   
    public UpdateEmployee() {
        super("!!!UpdateEmployee!!!");
        initComponents();
        
        Upe.setVisible(false);
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
        Upe = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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
        jScrollPane1.setBounds(0, 0, 510, 220);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 260, 120, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 260, 120, 40);

        Upe.setVisible(true);
        Upe.getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Address:");
        Upe.getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 80, 110, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Contact:");
        Upe.getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 110, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Password:");
        Upe.getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 180, 110, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Name:");
        Upe.getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 30, 110, 40);

        t2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 51, 204));
        Upe.getContentPane().add(t2);
        t2.setBounds(200, 80, 130, 40);

        t3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t3.setForeground(new java.awt.Color(0, 51, 204));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        Upe.getContentPane().add(t3);
        t3.setBounds(200, 130, 130, 40);

        t4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t4.setForeground(new java.awt.Color(0, 51, 204));
        Upe.getContentPane().add(t4);
        t4.setBounds(200, 180, 130, 40);

        t1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 51, 204));
        Upe.getContentPane().add(t1);
        t1.setBounds(200, 30, 130, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Upe.getContentPane().add(jButton3);
        jButton3.setBounds(190, 230, 110, 40);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Upe.getContentPane().add(jButton4);
        jButton4.setBounds(50, 230, 110, 40);

        getContentPane().add(Upe);
        Upe.setBounds(10, 204, 110, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(jt.getSelectedRow()>-1){
        try
        {
           
           
            
       
            s1=(String)jt.getValueAt(jt.getSelectedRow(),0);
             s2=(String)jt.getValueAt(jt.getSelectedRow(),1);
        
      s = Integer.parseInt(s1);
    
           
      
           
        
            
      
 JDesktopPane jd=this.getDesktopPane();
 jd.add(Upe);
 Upe.setVisible(true);
Upe.setBounds(430,250,500,380);
        

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

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
     
    }//GEN-LAST:event_t3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Upe.dispose();        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals(""))
    JOptionPane.showMessageDialog(this, "Please Fill All The Fields");
else
{
try{
    Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
        st.executeUpdate("update Employee set EmpName='"+t1.getText()+"',Address='"+t2.getText()+"',Contact='"+t3.getText()+"',Pwd='"+t4.getText()+"' where EmpId="+s+"");
st.executeUpdate("update cashier set UserName='"+t1.getText()+"',Pwd='"+t4.getText()+"' where UserName='"+s2+"'");
t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");        
JOptionPane.showMessageDialog(this, "Succesfully Updated");
                 c.close();
    
         st.close();

      Upe.dispose();
}
catch(Exception e)
{
  JOptionPane.showMessageDialog(this, e);
}
}
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame Upe;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
