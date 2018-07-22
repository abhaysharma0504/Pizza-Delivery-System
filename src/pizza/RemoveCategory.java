
package pizza;
import java.sql.*;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RemoveCategory extends javax.swing.JInternalFrame {

   
    public RemoveCategory() {
         super("!!!RemoveCategory!!!");
         initComponents();
        demo();
               
       
    }
    public void demo(){
         try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
             DefaultTableModel m1=(DefaultTableModel)jt.getModel();
          ResultSet rs= st.executeQuery("Select * from Category");
          while(rs.next())
          {
              Object []row={rs.getString(1),rs.getString(2)};
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
        jButton2 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jt.setForeground(new java.awt.Color(0, 51, 204));
        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category Id", "Category Name"
            }
        ));
        jScrollPane1.setViewportView(jt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 10, 480, 270);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 290, 150, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 290, 150, 50);

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
    
           st.executeUpdate("delete from category where CategoryId="+s);
           st.executeUpdate("delete from Item where CategoryName='"+s2+"'");
      
           JOptionPane.showMessageDialog(this, "Succesfully Deleted");
       
            RemoveCategory rd= new RemoveCategory();
      
 JDesktopPane jd=this.getDesktopPane();
 jd.add(rd);
 rd.setVisible(true);
rd.setBounds(430, 300, 500, 440);
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
