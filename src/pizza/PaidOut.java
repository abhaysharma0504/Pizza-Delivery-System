
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class PaidOut extends javax.swing.JInternalFrame {

   
    public PaidOut() {
       super("!!!PaidOut!!!");
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        ta1.setColumns(20);
        ta1.setForeground(new java.awt.Color(0, 51, 204));
        ta1.setLineWrap(true);
        ta1.setRows(5);
        ta1.setWrapStyleWord(true);
        ta1.setAutoscrolls(false);
        ta1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Description"));
        jScrollPane1.setViewportView(ta1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 450, 200);

        t1.setForeground(new java.awt.Color(0, 51, 204));
        t1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Amount"));
        getContentPane().add(t1);
        t1.setBounds(470, 10, 310, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 130, 110, 60);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(640, 130, 110, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int i=1;
        try
        {
           
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           Statement  st=c.createStatement();
           ResultSet rs= st.executeQuery("Select Max(ExpenseId) from Expense");
           SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
                    String s1=sf.format(new java.util.Date());
          if(rs.next())
          {
          i = rs.getInt(1);
          i=i+1;
         
          } 
           st.executeUpdate("insert into expense values("+i+",'"+ta1.getText()+"','"+t1.getText()+"','"+s1+"')");
           ta1.setText("");
           t1.setText("");
           JOptionPane.showMessageDialog(this,"Expense Added Succesfully");
            c.close();
         rs.close();
         st.close(); 
     
        }
          catch(ClassNotFoundException | SQLException e)
          {
              JOptionPane.showMessageDialog(this,e);
          }                    
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables
}
