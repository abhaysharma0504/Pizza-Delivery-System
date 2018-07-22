package pizza;


import java.sql.*;
import javax.swing.*;

import java.text.*;
public class mainframe extends javax.swing.JFrame implements Runnable {
        Thread t;
  
    public mainframe() {
        super("!!!MainFrame!!!");
        initComponents();
        t=new Thread(this);
        r1.setSelected(true);
        j1.setVisible(false);
        Customer.setVisible(false);
        lgf.setVisible(false);
        t1.setEnabled(false);
         b2.setEnabled(false);
          
            b5.setEnabled(false);
             b6.setEnabled(false);
              b7.setEnabled(false);
               b8.setEnabled(false);
                
                 b10.setEnabled(false);
                  b11.setEnabled(false);
                   b12.setEnabled(false);
                    b13.setEnabled(false);
                     b14.setEnabled(false);
                      b15.setEnabled(false); 
                  jButton1.setEnabled(false);
                       t.start();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jd = new javax.swing.JDesktopPane();
        p3 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        l8 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        l3 = new javax.swing.JLabel();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        l4 = new javax.swing.JLabel();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        l6 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        l7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lgf = new javax.swing.JInternalFrame();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        p4 = new javax.swing.JPasswordField();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        r2 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        l11 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Customer = new javax.swing.JInternalFrame();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        l1.setText("                                                                                                                                                                  PIZZA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(null);

        p3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        p3.setLayout(null);

        b1.setForeground(new java.awt.Color(0, 51, 204));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/7.png"))); // NOI18N
        b1.setText("Log In");
        b1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        p3.add(b1);
        b1.setBounds(40, 100, 100, 100);

        b14.setForeground(new java.awt.Color(0, 51, 204));
        b14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/13.png"))); // NOI18N
        b14.setText("Chng PW");
        b14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        p3.add(b14);
        b14.setBounds(40, 240, 100, 100);

        b15.setForeground(new java.awt.Color(0, 51, 204));
        b15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/8.png"))); // NOI18N
        b15.setText("Log Out");
        b15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        p3.add(b15);
        b15.setBounds(193, 100, 100, 100);

        b16.setForeground(new java.awt.Color(0, 51, 204));
        b16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/15.png"))); // NOI18N
        b16.setText("Exit");
        b16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        p3.add(b16);
        b16.setBounds(190, 240, 100, 100);

        l8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        l8.setForeground(new java.awt.Color(0, 51, 204));
        p3.add(l8);
        l8.setBounds(70, 380, 200, 59);

        l5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l5.setForeground(new java.awt.Color(0, 0, 204));
        l5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/2.png"))); // NOI18N
        l5.setText("   CASHIER");
        p3.add(l5);
        l5.setBounds(20, 10, 280, 60);

        jd.add(p3);
        p3.setBounds(1040, 180, 320, 480);

        p1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        p1.setLayout(null);

        l3.setBackground(new java.awt.Color(0, 0, 0));
        l3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(0, 0, 204));
        l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/6.png"))); // NOI18N
        l3.setText("        TOOLS");
        p1.add(l3);
        l3.setBounds(20, 10, 290, 53);

        b6.setForeground(new java.awt.Color(0, 51, 204));
        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/21.png"))); // NOI18N
        b6.setText("Paid out");
        b6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        p1.add(b6);
        b6.setBounds(190, 280, 120, 110);

        b5.setForeground(new java.awt.Color(0, 51, 204));
        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/17.png"))); // NOI18N
        b5.setText("Manage");
        b5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        p1.add(b5);
        b5.setBounds(30, 280, 120, 110);

        b2.setForeground(new java.awt.Color(0, 51, 204));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/26.png"))); // NOI18N
        b2.setText("Quick Report");
        b2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        p1.add(b2);
        b2.setBounds(190, 100, 120, 120);

        b13.setForeground(new java.awt.Color(0, 51, 204));
        b13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/20.png"))); // NOI18N
        b13.setText("Print Receipt");
        b13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        p1.add(b13);
        b13.setBounds(30, 100, 120, 120);

        jd.add(p1);
        p1.setBounds(10, 180, 340, 480);

        p2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        p2.setLayout(null);

        l4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(0, 0, 204));
        l4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/12.png"))); // NOI18N
        l4.setText("          ORDER ENTRY");
        p2.add(l4);
        l4.setBounds(10, 10, 367, 53);

        b8.setForeground(new java.awt.Color(0, 51, 204));
        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/3.png"))); // NOI18N
        b8.setText("Clear phone");
        b8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        p2.add(b8);
        b8.setBounds(140, 80, 120, 100);

        b7.setForeground(new java.awt.Color(0, 51, 204));
        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/10.png"))); // NOI18N
        b7.setText("Begin Order");
        b7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        p2.add(b7);
        b7.setBounds(270, 80, 110, 100);

        l6.setText("Customer Phone Number");
        p2.add(l6);
        l6.setBounds(10, 190, 367, 25);

        t1.setForeground(new java.awt.Color(0, 51, 204));
        p2.add(t1);
        t1.setBounds(10, 210, 310, 50);

        b10.setForeground(new java.awt.Color(0, 51, 204));
        b10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/1.png"))); // NOI18N
        b10.setText("Find Customer");
        b10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        p2.add(b10);
        b10.setBounds(10, 80, 120, 100);

        b11.setForeground(new java.awt.Color(0, 51, 204));
        b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/5.png"))); // NOI18N
        b11.setText("Void Order");
        b11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        p2.add(b11);
        b11.setBounds(210, 280, 160, 100);

        b12.setForeground(new java.awt.Color(0, 51, 204));
        b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/4.png"))); // NOI18N
        b12.setText("Cash Out");
        b12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        p2.add(b12);
        b12.setBounds(20, 280, 150, 100);

        l7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        l7.setForeground(new java.awt.Color(0, 51, 255));
        l7.setText("Log In To Continue");
        p2.add(l7);
        l7.setBounds(80, 390, 240, 60);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/44.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        p2.add(jButton1);
        jButton1.setBounds(319, 210, 60, 50);

        jd.add(p2);
        p2.setBounds(500, 180, 390, 480);

        lgf.setTitle("!!!Login!!!");
        lgf.setVisible(true);
        lgf.getContentPane().setLayout(null);

        b17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        lgf.getContentPane().add(b17);
        b17.setBounds(190, 200, 140, 60);

        b18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        lgf.getContentPane().add(b18);
        b18.setBounds(30, 200, 140, 60);

        p4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        p4.setForeground(new java.awt.Color(0, 51, 204));
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });
        lgf.getContentPane().add(p4);
        p4.setBounds(190, 150, 130, 40);

        l9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l9.setForeground(new java.awt.Color(0, 51, 204));
        l9.setText("Password");
        lgf.getContentPane().add(l9);
        l9.setBounds(30, 150, 110, 40);

        l10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l10.setForeground(new java.awt.Color(0, 51, 204));
        l10.setText("Username");
        lgf.getContentPane().add(l10);
        l10.setBounds(30, 90, 90, 40);

        t2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 51, 204));
        lgf.getContentPane().add(t2);
        t2.setBounds(190, 90, 130, 40);

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r2.setForeground(new java.awt.Color(0, 51, 204));
        r2.setText("Cashier");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        lgf.getContentPane().add(r2);
        r2.setBounds(250, 40, 90, 25);

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r1.setForeground(new java.awt.Color(0, 51, 204));
        r1.setText("Admin");
        lgf.getContentPane().add(r1);
        r1.setBounds(120, 40, 90, 25);

        l11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l11.setForeground(new java.awt.Color(0, 51, 204));
        l11.setText("Login As");
        lgf.getContentPane().add(l11);
        l11.setBounds(30, 30, 90, 40);

        j1.setForeground(new java.awt.Color(0, 51, 204));
        j1.setText("Invalid Details");
        lgf.getContentPane().add(j1);
        j1.setBounds(140, 270, 80, 30);

        jd.add(lgf);
        lgf.setBounds(0, 50, 150, 50);

        p5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        p5.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("@PIzZA");
        p5.add(jLabel1);
        jLabel1.setBounds(0, 0, 150, 40);

        jd.add(p5);
        p5.setBounds(0, 0, 160, 50);

        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/11.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 100, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/11.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 0, 90, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/11.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1200, 0, 80, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/11.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1280, 0, 80, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("@PIzZA                            *** ALL THE TASTE , NOT ON YOUR WAIST***");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(380, 10, 770, 30);

        jd.add(jPanel1);
        jPanel1.setBounds(0, 700, 1360, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/back1.jpg"))); // NOI18N
        jd.add(jLabel2);
        jLabel2.setBounds(0, 0, 1370, 770);

        Customer.setVisible(true);
        Customer.getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Contact Number:");
        Customer.getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 140, 120, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Address:");
        Customer.getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 200, 120, 50);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Customer Name:");
        Customer.getContentPane().add(jLabel12);
        jLabel12.setBounds(70, 80, 120, 50);

        t4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t4.setForeground(new java.awt.Color(0, 51, 204));
        Customer.getContentPane().add(t4);
        t4.setBounds(270, 150, 140, 30);

        t5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t5.setForeground(new java.awt.Color(0, 51, 204));
        Customer.getContentPane().add(t5);
        t5.setBounds(270, 210, 140, 30);

        t3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t3.setForeground(new java.awt.Color(0, 51, 204));
        Customer.getContentPane().add(t3);
        t3.setBounds(270, 90, 140, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/27.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Customer.getContentPane().add(jButton2);
        jButton2.setBounds(250, 270, 130, 50);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/42.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Customer.getContentPane().add(jButton3);
        jButton3.setBounds(100, 270, 130, 50);

        jd.add(Customer);
        Customer.setBounds(10, 130, 150, 40);

        getContentPane().add(jd);
        jd.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
t1.setText("");       
    }//GEN-LAST:event_b8ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
TotalSaleReports tsr=new TotalSaleReports(1);
     jd.add(tsr);
    tsr.setVisible(true);
    tsr.setBounds(0,0,1366,768);
    
    }//GEN-LAST:event_b13ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

  
            
        jd.remove(lgf);
             jd.add(lgf);
              lgf.setVisible(true);
              lgf.setBounds(500, 150, 390, 350);
    jd.setComponentZOrder(lgf, 0);
    
   
    
    }//GEN-LAST:event_b1ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
     Order o=new Order("","","");
     jd.add(o);
    o.setVisible(true);
    o.setBounds(0,0,1366,768);
    }//GEN-LAST:event_b7ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
             t2.setText("");
       p4.setText("");
        j1.setVisible(false);
       lgf.dispose();
        
    }//GEN-LAST:event_b17ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed

        try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
           
            ResultSet rs = null;
            if(r1.isSelected())
            {
                rs=st.executeQuery("select * from admin where UserName='"+t2.getText()+"' and Pwd='"+p4.getText()+"'");
                if(rs.next())
                {
                   b1.setEnabled(false);
        t1.setEnabled(true);
         b2.setEnabled(true);
          
            b5.setEnabled(true);
             b6.setEnabled(true);
              b7.setEnabled(true);
               b8.setEnabled(true);
              
                 b10.setEnabled(true);
                  b11.setEnabled(true);
                   b12.setEnabled(true);
                    b13.setEnabled(true);
                     b14.setEnabled(true);
                      b15.setEnabled(true); 
                    jButton1.setEnabled(true);
                       lgf.dispose();
                       l7.setText("     Current: Admin");
                }
                  else   j1.setVisible(true);
            }
            else if(r2.isSelected())
            {
                       rs=st.executeQuery("select * from cashier where UserName='"+t2.getText()+"' and Pwd='"+p4.getText()+"'");
                if(rs.next())
                {
                   b1.setEnabled(false);
        t1.setEnabled(true);
         b2.setEnabled(true);
         
          
            b5.setEnabled(true);
             b6.setEnabled(true);
              b7.setEnabled(true);
               b8.setEnabled(true);
               
                 b10.setEnabled(true);
                  b11.setEnabled(true);
                   b12.setEnabled(true);
                    b13.setEnabled(true);
                     b14.setEnabled(true);
                      b15.setEnabled(true); 
        jButton1.setEnabled(true);
                       lgf.dispose();
                l7.setText("   Current: Cashier");
                }
                else     j1.setVisible(true);
            }
               else  j1.setVisible(true);
            
         c.close();
         rs.close();
         st.close();
        }
        
        catch(ClassNotFoundException | SQLException e)
        {
           JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_b18ActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed
       
    }//GEN-LAST:event_p4ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
       
    }//GEN-LAST:event_r2ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
             t2.setText("");
       p4.setText("");    
       lgf.setVisible(false);
        t1.setEnabled(false);
        b1.setEnabled(true);
         b2.setEnabled(false);
         
            b5.setEnabled(false);
             b6.setEnabled(false);
              b7.setEnabled(false);
               b8.setEnabled(false);
                
                 b10.setEnabled(false);
                  b11.setEnabled(false);
                   b12.setEnabled(false);
                    b13.setEnabled(false);
                     b14.setEnabled(false);
                      b15.setEnabled(false); 
                         jButton1.setEnabled(false);
                        j1.setVisible(false);
                       l7.setText("Log In To Continue");

    }//GEN-LAST:event_b15ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       if(l7.getText().equals("     Current: Admin"))
       {
        Manage n=new Manage();
          jd.add(n);
          n.setVisible(true);
                  n.setBounds(0,0,1366,768);
       }
else
       {
           JOptionPane.showMessageDialog(this,"Please Login As Admin!!!!");
       }
    }//GEN-LAST:event_b5ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
System.exit(0);       
    }//GEN-LAST:event_b16ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
ChangePassword c=new ChangePassword();
jd.add(c);
c.setVisible(true);
c.setBounds(500, 150, 390, 380);       
    }//GEN-LAST:event_b14ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
     PaidOut p=new PaidOut();
            jd.add(p);
            p.setVisible(true);
            p.setBounds(300,150,800,300);    
    }//GEN-LAST:event_b6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Customer.dispose();       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals(""))
{
    JOptionPane.showMessageDialog(this,"Please Fill All The Fields");
}
else
{
    int i;
       i=1; 
        try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
          ResultSet rs= st.executeQuery("Select Max(CId) from Customer");
          if(rs.next())
          {
           i = rs.getInt(1);
          
          
          i=i+1;
          
          } 
                    
            c.close();
         rs.close();
         st.close();
        }
          catch(ClassNotFoundException | SQLException | NumberFormatException e)
          {
             JOptionPane.showMessageDialog(this,e);
          } 
        try
        {
          java.util.Date d=new java.util.Date();
          java.sql.Date d1=new java.sql.Date(d.getTime());
                   
                  
            Class.forName("com.mysql.jdbc.Driver");
          
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
           
      
            PreparedStatement ps=c.prepareStatement("insert into Customer values(?,?,?,?,?)");
           
        ps.setString(1,""+i);
        ps.setString(2,t3.getText());
        ps.setString(3,t4.getText());
        ps.setString(4,t5.getText());
        ps.setDate(5,d1);
        ps.executeUpdate();
        ps.close();
        c.close();
        
              Order O=new Order(t3.getText(),t4.getText(),t5.getText());
          jd.add(O);
             O.setVisible(true);
          O.setBounds(0,0,1366,768);
          t1.setText("");
          
          t3.setText("");
          t4.setText("");
          t5.setText("");
           
              c.close();
         ps.close();
          Customer.dispose();
        }
        
          catch(Exception e)
          {
             JOptionPane.showMessageDialog(this,e);
         
         }
}       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(t1.getText().equals(""))
{
    JOptionPane.showMessageDialog(this,"Please Enter The Contact Number!!");
}
      else
      {
        try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","root");
           
            Statement  st=c.createStatement();
          ResultSet rs= st.executeQuery("Select * from Customer where Contact='"+t1.getText()+"'");
          if(rs.next())
          {
              
          
             Order O=new Order(rs.getString(2),t1.getText(),rs.getString(4));
          jd.add(O);
             O.setVisible(true);
          O.setBounds(0,0,1366,768);
          t1.setText("");
          } 
           else
{
        jd.remove(Customer);
             jd.add(Customer);
              Customer.setVisible(true);
              Customer.setBounds(480,150,516, 408);
    jd.setComponentZOrder(Customer, 0);
    t4.setText(t1.getText());
}         
       c.close();
         rs.close();
         st.close(); 
         t1.setText("");
        }
          catch(ClassNotFoundException | SQLException | NumberFormatException e)
          {
              JOptionPane.showMessageDialog(this,e);
          } 
        
      }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
CashOut c1=new CashOut();
jd.add(c1);
c1.setVisible(true);
c1.setBounds(0,0,1366,768);
    }//GEN-LAST:event_b12ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
FindCustomer fc =new FindCustomer();
jd.add(fc);
fc.setVisible(true);
fc.setBounds(421,150,520,450);

    }//GEN-LAST:event_b10ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
QuickReport qr =new QuickReport();
jd.add(qr);
qr.setVisible(true);
qr.setBounds(450,150,300,500);        
    }//GEN-LAST:event_b2ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
VoidOrder vo =new VoidOrder();
jd.add(vo);
vo.setVisible(true);
vo.setBounds(200,150,910,413);      
    }//GEN-LAST:event_b11ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame Customer;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b2;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel j1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane jd;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JInternalFrame lgf;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPasswordField p4;
    private javax.swing.JPanel p5;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
                for(;;)
                {
                    
                    SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy   hh:mm:ss a");
                    String s=sf.format(new java.util.Date());
                    l8.setText(s);
        
                    
                }
        
    }
}
