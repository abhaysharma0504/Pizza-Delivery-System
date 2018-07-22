
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;


public class Order extends javax.swing.JInternalFrame {

int total=0;
  DefaultTableModel m1;
  public Order(String u1,String u2,String u3) {
      super("!!!OrderPage!!!");
        initComponents();
        rb1.setSelected(true);
        rb1.setActionCommand("Dine In");
        rb2.setActionCommand("Take Away");
        rb3.setActionCommand("Delivery");
        
        
           SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy");
        String s=sf.format(new java.util.Date());
        tt2.setText(s);
        SimpleDateFormat sf1=new SimpleDateFormat("hh:mm:ss a");
        String s1=sf1.format(new java.util.Date());
        tt1.setText(s1);
        t1.setText(u1);
        t2.setText(u2);
        t3.setText(u3);
        

        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza", "root", "root");
            int i = 0;
            int x = 10;
            int y = 20;
            JButton[] bt = new JButton[14];
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("Select * from category");
            while (rs.next()) {
                bt[i] = new JButton();
                p5.add(bt[i]);
                bt[i].setBounds(x, y, 120, 50);
                
                bt[i].setText(rs.getString(2));
              
                bt[i].addActionListener(new java.awt.event.ActionListener() {
                  
                    public void actionPerformed(ActionEvent e) {
                demo(e.getActionCommand());
                    }
                });
                
                
                
                
                
                
                i++;
                x = x + 130;

                if (i == 7) {
                    y = y + 60;
                    x = 10;
                }
                

            }
            c.close();
            st.close();
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }

    public void demo(String S) {
        p6.removeAll();
        p6.repaint();
       
        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza", "root", "root");
            int i = 0;
            int x = 20;
            int y = 20;
            JButton[] bt = new JButton[28];
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("Select * from Item where CategoryName='"+S+"'");
            while (rs.next()) {
                bt[i] = new JButton();
                p6.add(bt[i]);
                bt[i].setBounds(x, y, 120, 50);
                bt[i].setText(rs.getString(2)+"-"+rs.getString(3));
                 bt[i].addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        demo1(e.getActionCommand());
                    }
                });
                i++;
                x = x + 130;
                
                if ((i%7)==0) {
                    y = y + 60;
                    x = 10;
                }
               

            }
            c.close();
            st.close();
            rs.close();
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }
    public void demo1(String S)
    {
        
         try
        {
            
            String[] sp = S.split("-");
            
            
            
            for(int i=0;i<jt.getRowCount();i++){
                String ss=(String)jt.getValueAt(i, 0);
                String ss1=(String)jt.getValueAt(i, 1);
                if(ss.equals(sp[0]) && ss1.equals(sp[1])){
                    String ss2 = (String)jt.getValueAt(i, 2);
                    String ss3 = (String)jt.getValueAt(i, 3);
                    int pi = Integer.parseInt(ss2);
                    int pi1 = Integer.parseInt(ss3);
                    pi1=pi1/pi;
                    pi=pi+1;
                    int pi2=pi*pi1;
                    jt.setValueAt(""+pi, i, 2);
                    jt.setValueAt(""+pi2, i, 3);
                    total=total+pi1;
                    
                    break;
                }else{
                    
            if(i==jt.getRowCount()-1){
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
            ResultSet rs=st.executeQuery("Select price from item where ItemName='"+sp[0]+"' and Size='"+sp[1]+"'");
         m1=(DefaultTableModel)jt.getModel();
            if(rs.next()){
                Object[] row={sp[0],sp[1],"1",rs.getString(1)};
                m1.addRow(row);
                 total=total+rs.getInt(1);
                break;
            }
            c.close();
            st.close();
            rs.close();
                }
                }
            }
            
            if(jt.getRowCount()==0){
                
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
            ResultSet rs=st.executeQuery("Select price from item where ItemName='"+sp[0]+"' and Size='"+sp[1]+"'");
     m1=(DefaultTableModel)jt.getModel();
            if(rs.next()){
                Object[] row={sp[0],sp[1],"1",rs.getString(1)};
                m1.addRow(row);
                  total=total+rs.getInt(1);
                
            }
            c.close();
            st.close();
            rs.close();
            }
            ll1.setText(""+total);
           
            
            
          
        }
          catch(ClassNotFoundException | SQLException | NumberFormatException e)
          {
             JOptionPane.showMessageDialog(this,e);
          }
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        p1 = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        tt1 = new javax.swing.JLabel();
        tt2 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        p3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        p4 = new javax.swing.JPanel();
        l6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ll1 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        p6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        rb6 = new javax.swing.JCheckBox();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        rb5 = new javax.swing.JCheckBox();
        rb4 = new javax.swing.JCheckBox();
        rb7 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.setLayout(null);

        l2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        l2.setForeground(new java.awt.Color(0, 51, 204));
        l2.setText("Phone Number");
        p1.add(l2);
        l2.setBounds(280, 10, 130, 20);

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        p1.add(t2);
        t2.setBounds(280, 30, 200, 30);

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        p1.add(t1);
        t1.setBounds(20, 30, 220, 30);

        l1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 51, 204));
        l1.setText("Customer Name");
        p1.add(l1);
        l1.setBounds(20, 10, 130, 20);

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        p1.add(t3);
        t3.setBounds(540, 30, 270, 30);

        l3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        l3.setForeground(new java.awt.Color(0, 51, 204));
        l3.setText("Address");
        p1.add(l3);
        l3.setBounds(540, 10, 130, 20);

        tt1.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        tt1.setForeground(new java.awt.Color(0, 51, 204));
        p1.add(tt1);
        tt1.setBounds(1110, 10, 180, 60);

        tt2.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        tt2.setForeground(new java.awt.Color(0, 51, 204));
        p1.add(tt2);
        tt2.setBounds(910, 10, 180, 60);

        getContentPane().add(p1);
        p1.setBounds(10, 10, 1330, 80);

        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p2.setLayout(null);

        jt.setForeground(new java.awt.Color(0, 51, 204));
        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Size", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jt);

        p2.add(jScrollPane4);
        jScrollPane4.setBounds(0, 0, 350, 370);

        getContentPane().add(p2);
        p2.setBounds(10, 100, 350, 370);

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p3.setLayout(null);

        jButton4.setText("jButton1");
        p3.add(jButton4);
        jButton4.setBounds(260, 480, 90, 50);

        jButton5.setText("jButton1");
        p3.add(jButton5);
        jButton5.setBounds(20, 480, 90, 50);

        jButton6.setText("jButton1");
        p3.add(jButton6);
        jButton6.setBounds(140, 480, 90, 50);

        b1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 51, 204));
        b1.setText("Remove Row");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        p3.add(b1);
        b1.setBounds(180, 10, 150, 50);

        b4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b4.setForeground(new java.awt.Color(0, 51, 204));
        b4.setText("Remove Item");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        p3.add(b4);
        b4.setBounds(10, 10, 150, 50);

        getContentPane().add(p3);
        p3.setBounds(10, 480, 350, 70);

        p4.setBackground(new java.awt.Color(255, 255, 255));
        p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.setLayout(null);

        l6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(0, 51, 204));
        l6.setText("Total Bill :");
        p4.add(l6);
        l6.setBounds(20, 10, 140, 90);

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Rs.");
        p4.add(jLabel2);
        jLabel2.setBounds(120, 20, 30, 70);

        ll1.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        ll1.setForeground(new java.awt.Color(0, 51, 204));
        ll1.setText("00");
        p4.add(ll1);
        ll1.setBounds(160, 20, 170, 70);

        getContentPane().add(p4);
        p4.setBounds(10, 610, 350, 110);

        p5.setBackground(new java.awt.Color(255, 255, 255));
        p5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Categories", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(0, 51, 204))); // NOI18N
        p5.setForeground(new java.awt.Color(0, 51, 204));
        p5.setLayout(null);
        getContentPane().add(p5);
        p5.setBounds(370, 100, 970, 140);

        p6.setBackground(new java.awt.Color(255, 255, 255));
        p6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(0, 51, 204))); // NOI18N
        p6.setLayout(null);
        getContentPane().add(p6);
        p6.setBounds(370, 250, 970, 400);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb1.setForeground(new java.awt.Color(0, 51, 204));
        rb1.setText("Dine In");
        rb1.setContentAreaFilled(false);
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        jPanel1.add(rb1);
        rb1.setBounds(10, 10, 80, 25);

        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb2.setForeground(new java.awt.Color(0, 51, 204));
        rb2.setText("Take Away");
        rb2.setContentAreaFilled(false);
        jPanel1.add(rb2);
        rb2.setBounds(120, 10, 99, 25);

        buttonGroup1.add(rb3);
        rb3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb3.setForeground(new java.awt.Color(0, 51, 204));
        rb3.setText("Delivery");
        rb3.setContentAreaFilled(false);
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });
        jPanel1.add(rb3);
        rb3.setBounds(230, 10, 107, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 560, 350, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Payment Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel2.setLayout(null);

        buttonGroup2.add(rb6);
        rb6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb6.setForeground(new java.awt.Color(0, 51, 204));
        rb6.setText("Card");
        rb6.setContentAreaFilled(false);
        jPanel2.add(rb6);
        rb6.setBounds(320, 20, 130, 25);

        b7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b7.setForeground(new java.awt.Color(0, 51, 204));
        b7.setText("Pay");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel2.add(b7);
        b7.setBounds(640, 20, 140, 30);

        b8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b8.setForeground(new java.awt.Color(0, 51, 204));
        b8.setText("Cancel");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel2.add(b8);
        b8.setBounds(820, 20, 140, 30);

        buttonGroup2.add(rb5);
        rb5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb5.setForeground(new java.awt.Color(0, 51, 204));
        rb5.setText("No Cash");
        rb5.setContentAreaFilled(false);
        jPanel2.add(rb5);
        rb5.setBounds(180, 20, 130, 25);

        buttonGroup2.add(rb4);
        rb4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb4.setForeground(new java.awt.Color(0, 51, 204));
        rb4.setSelected(true);
        rb4.setText("Cash");
        rb4.setContentAreaFilled(false);
        jPanel2.add(rb4);
        rb4.setBounds(40, 20, 130, 25);

        buttonGroup2.add(rb7);
        rb7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rb7.setForeground(new java.awt.Color(0, 51, 204));
        rb7.setText("E-Wallet");
        rb7.setContentAreaFilled(false);
        rb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb7ActionPerformed(evt);
            }
        });
        jPanel2.add(rb7);
        rb7.setBounds(450, 20, 130, 25);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(370, 660, 970, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
      
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        
    }//GEN-LAST:event_t3ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        this.dispose();    
    }//GEN-LAST:event_b8ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb7ActionPerformed
        
    }//GEN-LAST:event_rb7ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        
    }//GEN-LAST:event_rb1ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
          int i=1; int n=1;
          String in="";
          if(jt.getRowCount()>0)
             {
        try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
          ResultSet rs= st.executeQuery("Select Max(BillNo) from TotalSale");
          if(rs.next())
          {
           i = rs.getInt(1);
          
          
          i=i+1;
          
          } 
          c.close();
          st.close();
          rs.close();
          
        }
          catch(ClassNotFoundException | SQLException | NumberFormatException e)
          {
              JOptionPane.showMessageDialog(this,e);
          }  
        
        
        
             
                  try {

            
            
            String s=new String();
            if(rb1.isSelected())
            {
                s=rb1.getActionCommand();
            }
            else if(rb2.isSelected())
            {
                s=rb2.getActionCommand();
            }
            else s=rb3.getActionCommand();
             
            String s1=new String();
            String s2=new String("Done");
            if(rb4.isSelected())
            {
                s1=rb4.getActionCommand();
            }
             else if(rb6.isSelected())
            {
                s1=rb6.getActionCommand();
            }
             else if(rb5.isSelected())
            {
                s1=rb5.getActionCommand();
                s2="Pending";
            }
            else s1=rb7.getActionCommand();
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza", "root", "root");
                      PreparedStatement ps1 = c.prepareStatement("insert into TotalSale values(?,?,?,?,?,?,?,?,?,?)");
                      {
                     ps1.setInt(1,i);
                     ps1.setString(2,t1.getText());
                     ps1.setString(3,t2.getText());
                     ps1.setString(4,t3.getText());
                     ps1.setInt(5,Integer.parseInt(ll1.getText()));
                     ps1.setString(6,s);
                     ps1.setString(7,s1);
                     ps1.setString(8,s2);
                     ps1.setDate(9,new java.sql.Date(new java.util.Date().getTime()));
                     ps1.setTimestamp(10,new java.sql.Timestamp(new java.util.Date().getTime()));
                     ps1.executeUpdate();
                      }
                      
                      
                     Statement st=c.createStatement();
                     ResultSet rs=st.executeQuery("Select Max(BillNo) from TotalSale ");
                     if(rs.next())
                     {
                         n=rs.getInt(1);
                     }
                 PreparedStatement ps = c.prepareStatement("insert into Sale values(?,?,?,?,?,?,?,?,?,?,?,?)");   
                  
                  {  
                    
                     for(int j=0;j<jt.getRowCount();j++)
                     {
                         
                    String j1=(String)jt.getValueAt(j,2);
                    String j2=(String)jt.getValueAt(j,3);
                    int k1=Integer.parseInt(j1);
                     int k2=Integer.parseInt(j2);
                    k2=k2/k1;
                             
                     ps.setInt(1,n);
                     ps.setString(2,t1.getText());
                     ps.setString(3,t2.getText());
                     ps.setString(4,t3.getText());
                     ps.setString(5,(String)jt.getValueAt(j,0));
                     ps.setString(6,(String)jt.getValueAt(j,1));
                     ps.setInt(7,k2);
                     ps.setString(8,(String)jt.getValueAt(j,2));
                     ps.setString(9,(String)jt.getValueAt(j,3));
                     ps.setString(10,s);
                     ps.setDate(11,new java.sql.Date(new java.util.Date().getTime()));
                     ps.setTimestamp(12,new java.sql.Timestamp(new java.util.Date().getTime()));
                     in=in+(String)jt.getValueAt(j, 0)+"-"+(String)jt.getValueAt(j, 1)+"-"+(String)jt.getValueAt(j, 2)+"-"+(String)jt.getValueAt(j, 3)+"--";
                     ps.executeUpdate();
                     }
                     JOptionPane.showMessageDialog(this,"Order Done");
                     printbill p=new printbill(in,i,ll1.getText(),buttonGroup1.getSelection().getActionCommand());
                        dispose();
                        c.close();
                        st.close();
                        rs.close();
                        ps.close();
                        ps1.close();
                  }
             }
                  catch(Exception e)
                  {
                      JOptionPane.showMessageDialog(this,e);
                  }
             }
              else
             {
                 JOptionPane.showMessageDialog(this,"Select Atleast one Item");
             }
            
    }//GEN-LAST:event_b7ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
           if(jt.getRowCount()>0)
           {
               String s=(String)jt.getValueAt(jt.getSelectedRow(),3);
               total=total-Integer.parseInt(s);
               m1=(DefaultTableModel)jt.getModel();
               m1.removeRow(jt.getSelectedRow()); 
               ll1.setText(""+total);

           }
           else 
           {
               JOptionPane.showMessageDialog(this,"Select A Item First");
           }


        
    }//GEN-LAST:event_b1ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
       if(jt.getRowCount()>0)
           {
               String q=(String)jt.getValueAt(jt.getSelectedRow(),2);
               if(q.equals("1"))
               {
               
               String s=(String)jt.getValueAt(jt.getSelectedRow(),3);
               total=total-Integer.parseInt(s);
               m1=(DefaultTableModel)jt.getModel();
               m1.removeRow(jt.getSelectedRow()); 
               ll1.setText(""+total);
               }
               else
               {
                   String s=(String)jt.getValueAt(jt.getSelectedRow(),3);
                   int k=Integer.parseInt(q);
                    total=total-Integer.parseInt(s)/k;
                    String s1=(String)jt.getValueAt(jt.getSelectedRow(),3);
                    int w=Integer.parseInt(s1);
                    w=w-Integer.parseInt(s)/k;  
                   k--;
                   jt.setValueAt(""+k,jt.getSelectedRow(),2);
                    jt.setValueAt(""+w,jt.getSelectedRow(),3);
                    ll1.setText(""+total);
   
                   
               }
               
           }
           else 
           {
               JOptionPane.showMessageDialog(this,"Select A Item First");
           }
    }//GEN-LAST:event_b4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b4;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jt;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel ll1;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JCheckBox rb4;
    private javax.swing.JCheckBox rb5;
    private javax.swing.JCheckBox rb6;
    private javax.swing.JCheckBox rb7;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JLabel tt1;
    private javax.swing.JLabel tt2;
    // End of variables declaration//GEN-END:variables
}
