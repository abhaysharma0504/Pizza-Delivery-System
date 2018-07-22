
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;


public class FindCustomer extends javax.swing.JInternalFrame implements KeyListener{

   
    public FindCustomer() {
         super("!!!FindCustomer!!!");
        initComponents();
        
        c1.setSelected(true);
       t1.addKeyListener(this);
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        c2 = new javax.swing.JCheckBox();
        c1 = new javax.swing.JCheckBox();
        t1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        buttonGroup1.add(c2);
        c2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        c2.setForeground(new java.awt.Color(0, 51, 204));
        c2.setText("By Name");
        getContentPane().add(c2);
        c2.setBounds(47, 76, 77, 31);

        buttonGroup1.add(c1);
        c1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        c1.setForeground(new java.awt.Color(0, 51, 204));
        c1.setText("By Contact");
        getContentPane().add(c1);
        c1.setBounds(47, 42, 100, 31);

        t1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(t1);
        t1.setBounds(210, 60, 200, 30);

        jScrollPane1.setForeground(new java.awt.Color(0, 51, 204));

        jt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Contact", "Address"
            }
        ));
        jScrollPane1.setViewportView(jt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 120, 530, 220);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 360, 120, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 360, 120, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(jt.getSelectedRow()>-1){
        try
        {
           
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
       
            String s1=(String)jt.getValueAt(jt.getSelectedRow(),0);
            String s2=(String)jt.getValueAt(jt.getSelectedRow(),1);
            String s3=(String)jt.getValueAt(jt.getSelectedRow(),2);
            
        
     
       
           Order O= new Order(s1,s2,s3);
      
 JDesktopPane jd=this.getDesktopPane();
 jd.add(O);
 O.setVisible(true);
 O.setBounds(0,0,1366,768);
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
       
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
    
    }
    

    @Override
    public void keyReleased(KeyEvent e) {
       DefaultTableModel m1=(DefaultTableModel)jt.getModel();
       m1.setRowCount(0);
            String S=t1.getText();
            if(!S.equals(""))
            {
         try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
             
             ResultSet rs;
           if(c1.isSelected())
           {
          rs= st.executeQuery("Select * from Customer where Contact LIKE '"+S+"%'");
           }
           else 
           {
               rs=st.executeQuery("Select * from Customer where CName like '"+S+"%'");
           }
          while(rs.next())
          {
              Object []row={rs.getString(2),rs.getString(3),rs.getString(4)};
              m1.addRow(row);
          }
           c.close();
         rs.close();
         st.close(); 
      
        }
          catch(ClassNotFoundException | SQLException | NumberFormatException E)
          {
              JOptionPane.showMessageDialog(this,E);
          } 
            }
       
        
    }
}
