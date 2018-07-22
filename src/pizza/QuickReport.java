
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class QuickReport extends javax.swing.JInternalFrame {
int a,b,c,d,e,f,g;
   
    public QuickReport() {
       super("!!!QuickReport!!!");
        initComponents();
       a=0;
       b=0;
       c=0;
       d=0;
       e=0;
       f=0;
       g=0;
        try
        {
           java.util.Date d2=new java.util.Date();
           java.sql.Date d1=new java.sql.Date(d2.getTime());
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=cn.createStatement();
            PreparedStatement ps=cn.prepareStatement("Select TotalBill,PaymentType from TotalSale where Date=?");
            ps.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
            ResultSet rs = ps.executeQuery();
            PreparedStatement ps1=cn.prepareStatement("Select ExpenseAmount from Expense where Date=?");
            ps1.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
            ResultSet rs1 = ps1.executeQuery();
          
          

while(rs.next())
{
    
    int i=Integer.parseInt(rs.getString(1));
    String s1=rs.getString(2);
    if(s1.equals("Cash"))
        a=a+i;
    else if(s1.equals("E-wallet"))
        b=b+i;
    else if(s1.equals("Card"))
        c=c+i;
    else
        d=d+i;

}
while(rs1.next())
{
  
    int j=Integer.parseInt(rs1.getString(1));
    e=e+j;
    
}

l1.setText(""+a);
l2.setText(""+b);
l3.setText(""+c);
l4.setText(""+d);
l5.setText(""+e);
f=a+b+c+d;
l6.setText(""+f);
g=a-e;
l7.setText(""+g);
 cn.close();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("E-Wallet:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 60, 110, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Cash Sale:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 110, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Card");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 110, 31);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("No-Cash:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 150, 110, 31);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Cash In Hand:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 300, 110, 31);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Expenses:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 200, 110, 31);

        l2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l2.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(l2);
        l2.setBounds(180, 60, 110, 30);

        l3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l3.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(l3);
        l3.setBounds(180, 100, 110, 30);

        l4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l4.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(l4);
        l4.setBounds(180, 150, 110, 30);

        l5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l5.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(l5);
        l5.setBounds(180, 190, 110, 30);

        l6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l6.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(l6);
        l6.setBounds(180, 240, 110, 30);

        l1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(l1);
        l1.setBounds(180, 20, 110, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Total Sale:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 250, 90, 30);

        l7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l7.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(l7);
        l7.setBounds(180, 300, 110, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/30.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 350, 130, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    // End of variables declaration//GEN-END:variables
}
