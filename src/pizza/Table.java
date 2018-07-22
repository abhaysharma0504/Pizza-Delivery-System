/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;
import javax.swing.table.AbstractTableModel;
import java.sql.*;
/**
 *
 * @author Raghav
 */
class MyModel extends AbstractTableModel
{
ResultSet rs1;
ResultSetMetaData rsmd1;
MyModel(ResultSet Rs)
{
    try
    {
        rs1=Rs;
    rsmd1=Rs.getMetaData();
    }
catch(Exception e)
{
    System.out.println(e);
}    
}
@Override
    public int getRowCount() {
try
{
    rs1.last();
return rs1.getRow();
}
catch(Exception e)
{
    System.out.println(e);
    return -1;
}
    }   

    @Override
    public int getColumnCount() {
        try
        {
            return rsmd1.getColumnCount();
        }
        catch(Exception e)
        {
            System.out.println(e);
            return -1;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try
        {
            rs1.absolute(rowIndex+1);
        return rs1.getObject(columnIndex+1);
        }
        catch(Exception E)
        {
            System.out.println(E);
            return -1;
        }
    }
    
}

public class Table extends javax.swing.JFrame {

    /**
     * Creates new form Table
     */ResultSet rs;
    public Table() {
        try
        {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection c=DriverManager.getConnection("jdbc:odbc:MyDatabase");
	Statement st=c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	rs=st.executeQuery("select * from Employee");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        initComponents();
        MyModel M1=new MyModel(rs);
        JT.setModel(M1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        JT = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(JT);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 84, 555, 203);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JT;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}