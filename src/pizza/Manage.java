
package pizza;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;




public class Manage extends javax.swing.JInternalFrame {

    
    public Manage() {
        super("!!!Manage!!!");
        
        initComponents();
        p1.setVisible(false);
        
        P5.setVisible(false);
        
        P6.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        P4 = new javax.swing.JPanel();
        b21 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        P6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        P5 = new javax.swing.JPanel();
        b30 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        p1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jButton8.setText("jButton8");

        getContentPane().setLayout(null);

        P4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        P4.setLayout(null);

        b21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/32.png"))); // NOI18N
        b21.setContentAreaFilled(false);
        b21.setMaximumSize(new java.awt.Dimension(200, 75));
        b21.setPreferredSize(new java.awt.Dimension(100, 70));
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        P4.add(b21);
        b21.setBounds(650, 20, 160, 70);

        b19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/34.png"))); // NOI18N
        b19.setContentAreaFilled(false);
        b19.setMaximumSize(new java.awt.Dimension(200, 75));
        b19.setPreferredSize(new java.awt.Dimension(100, 70));
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });
        P4.add(b19);
        b19.setBounds(450, 20, 140, 70);

        b18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/38.png"))); // NOI18N
        b18.setContentAreaFilled(false);
        b18.setMaximumSize(new java.awt.Dimension(200, 75));
        b18.setPreferredSize(new java.awt.Dimension(100, 70));
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        P4.add(b18);
        b18.setBounds(230, 20, 130, 70);

        b22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/31.png"))); // NOI18N
        b22.setContentAreaFilled(false);
        b22.setMaximumSize(new java.awt.Dimension(200, 75));
        b22.setPreferredSize(new java.awt.Dimension(100, 70));
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        P4.add(b22);
        b22.setBounds(880, 20, 160, 70);

        b23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/30.png"))); // NOI18N
        b23.setContentAreaFilled(false);
        b23.setMaximumSize(new java.awt.Dimension(200, 75));
        b23.setPreferredSize(new java.awt.Dimension(100, 70));
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });
        P4.add(b23);
        b23.setBounds(1140, 20, 140, 70);

        b17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b17.setForeground(new java.awt.Color(0, 51, 204));
        b17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/35.png"))); // NOI18N
        b17.setContentAreaFilled(false);
        b17.setMaximumSize(new java.awt.Dimension(200, 75));
        b17.setPreferredSize(new java.awt.Dimension(100, 70));
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        P4.add(b17);
        b17.setBounds(30, 20, 140, 70);

        getContentPane().add(P4);
        P4.setBounds(0, 10, 1350, 110);

        P6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        P6.setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/40.png"))); // NOI18N
        jButton2.setText("Update Employee");
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        P6.add(jButton2);
        jButton2.setBounds(580, 30, 140, 90);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/41.png"))); // NOI18N
        jButton3.setText("Remove Employee");
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        P6.add(jButton3);
        jButton3.setBounds(1120, 40, 140, 90);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/39.png"))); // NOI18N
        jButton5.setText("Add Employee");
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        P6.add(jButton5);
        jButton5.setBounds(50, 30, 140, 90);

        getContentPane().add(P6);
        P6.setBounds(530, 150, 240, 560);

        P5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        P5.setMinimumSize(new java.awt.Dimension(880, 510));
        P5.setLayout(null);

        b30.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b30.setForeground(new java.awt.Color(0, 51, 204));
        b30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/39.png"))); // NOI18N
        b30.setText("Add Item");
        b30.setContentAreaFilled(false);
        b30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b30.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b30ActionPerformed(evt);
            }
        });
        P5.add(b30);
        b30.setBounds(680, 20, 150, 100);

        b27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b27.setForeground(new java.awt.Color(0, 51, 204));
        b27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/40.png"))); // NOI18N
        b27.setText("Remove Item");
        b27.setContentAreaFilled(false);
        b27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b27.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b27ActionPerformed(evt);
            }
        });
        P5.add(b27);
        b27.setBounds(900, 20, 150, 100);

        b28.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b28.setForeground(new java.awt.Color(0, 51, 204));
        b28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/41.png"))); // NOI18N
        b28.setText("Edit Item");
        b28.setContentAreaFilled(false);
        b28.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b28.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b28ActionPerformed(evt);
            }
        });
        P5.add(b28);
        b28.setBounds(1130, 20, 150, 100);

        b31.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b31.setForeground(new java.awt.Color(0, 51, 204));
        b31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/39.png"))); // NOI18N
        b31.setText("Add Category");
        b31.setContentAreaFilled(false);
        b31.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b31.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b31ActionPerformed(evt);
            }
        });
        P5.add(b31);
        b31.setBounds(20, 20, 150, 100);

        b29.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b29.setForeground(new java.awt.Color(0, 51, 204));
        b29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/40.png"))); // NOI18N
        b29.setText("Remove Category");
        b29.setContentAreaFilled(false);
        b29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b29.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b29ActionPerformed(evt);
            }
        });
        P5.add(b29);
        b29.setBounds(230, 20, 150, 100);

        b32.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b32.setForeground(new java.awt.Color(0, 51, 204));
        b32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/41.png"))); // NOI18N
        b32.setText("Edit Category");
        b32.setContentAreaFilled(false);
        b32.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b32.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b32ActionPerformed(evt);
            }
        });
        P5.add(b32);
        b32.setBounds(460, 20, 150, 100);

        getContentPane().add(P5);
        P5.setBounds(60, 150, 220, 560);

        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/22.png"))); // NOI18N
        jButton1.setText("ItemWise Reports");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        p1.add(jButton1);
        jButton1.setBounds(300, 30, 160, 100);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/26.png"))); // NOI18N
        jButton4.setText("PaidOut Reports");
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        p1.add(jButton4);
        jButton4.setBounds(20, 30, 139, 100);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 51, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/21.png"))); // NOI18N
        jButton6.setText("PaymentType Reports");
        jButton6.setContentAreaFilled(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        p1.add(jButton6);
        jButton6.setBounds(560, 30, 180, 100);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 51, 204));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/16.png"))); // NOI18N
        jButton7.setText("TotalSale Reports");
        jButton7.setContentAreaFilled(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        p1.add(jButton7);
        jButton7.setBounds(860, 30, 150, 100);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 51, 204));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/40.png"))); // NOI18N
        jButton9.setText(" Cancel Reports");
        jButton9.setContentAreaFilled(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        p1.add(jButton9);
        jButton9.setBounds(1130, 30, 140, 100);

        getContentPane().add(p1);
        p1.setBounds(1040, 150, 180, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
p1.setVisible(true);
p1.setBounds(0,130,1340,580);
P6.setVisible(false);P5.setVisible(false);
    }//GEN-LAST:event_b21ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
       
        P6.setVisible(true); 
        P6.setBounds(0,130,1340,580);
        P5.setVisible(false);p1.setVisible(false);
       
    }//GEN-LAST:event_b19ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        P5.setVisible(true);
        P5.setBounds(0,130,1340,580);
          P6.setVisible(false);p1.setVisible(false);     
    }//GEN-LAST:event_b18ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
      PasswordChange c=new PasswordChange();  
JDesktopPane jd=this.getDesktopPane();
      jd.add(c);
c.setVisible(true);
c.setBounds(500, 150, 390, 380);
    }//GEN-LAST:event_b22ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        JDesktopPane jd = this.getDesktopPane();
        JInternalFrame[] af = jd.getAllFrames();
        for(int i=0;i<af.length;i++){
            af[i].dispose();
        }
     
    }//GEN-LAST:event_b23ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
Manage m=new Manage();
JDesktopPane jd=this.getDesktopPane();
jd.add(m);
   m.setVisible(true);
   m.setBounds(0,0,1366,768);
    }//GEN-LAST:event_b17ActionPerformed

    private void b30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b30ActionPerformed
 AddItem aid= new AddItem();
 JDesktopPane jd=this.getDesktopPane();
 jd.add(aid);
 aid.setVisible(true);
aid.setBounds(475, 300, 390, 350);   

    }//GEN-LAST:event_b30ActionPerformed

    private void b27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b27ActionPerformed
      RemoveItem rid= new RemoveItem();
 JDesktopPane jd=this.getDesktopPane();
 jd.add(rid);
 rid.setVisible(true);
rid.setBounds(430, 300, 600, 400);   
    }//GEN-LAST:event_b27ActionPerformed

    private void b28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b28ActionPerformed
EditItem eid= new EditItem();
 JDesktopPane jd=this.getDesktopPane();
 jd.add(eid);
 eid.setVisible(true);
eid.setBounds(430, 150, 580,480) ;        
    }//GEN-LAST:event_b28ActionPerformed

    private void b31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b31ActionPerformed
 AddCategory ad= new AddCategory();
 JDesktopPane jd=this.getDesktopPane();
 jd.add(ad);
 ad.setVisible(true);
ad.setBounds(475, 300, 390, 350);

    }//GEN-LAST:event_b31ActionPerformed

    private void b29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b29ActionPerformed
        
         
        RemoveCategory rd= new RemoveCategory();
 JDesktopPane jd=this.getDesktopPane();
 jd.add(rd);
 rd.setVisible(true);
rd.setBounds(430, 300, 500,380);
    }//GEN-LAST:event_b29ActionPerformed

    private void b32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b32ActionPerformed
      EditCategory ed= new EditCategory();
 JDesktopPane jd=this.getDesktopPane();
 jd.add(ed);
 ed.setVisible(true);
ed.setBounds(400, 150, 580,475) ; 
    }//GEN-LAST:event_b32ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
ItemWiseReport iwr=new ItemWiseReport();
JDesktopPane jd =this.getDesktopPane();
jd.add(iwr);
iwr.setVisible(true);
iwr.setBounds(400,150,580,475);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
AddEmployee am=new AddEmployee();
JDesktopPane jd=this.getDesktopPane();
jd.add(am);
am.setVisible(true);
am.setBounds(475, 280, 390,380);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
RemoveEmployee rd= new RemoveEmployee();
 JDesktopPane jd=this.getDesktopPane();
 jd.add(rd);
 rd.setVisible(true);
rd.setBounds(430, 300, 500,380);       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       UpdateEmployee rd= new UpdateEmployee();
 JDesktopPane jd=this.getDesktopPane();
 jd.add(rd);
 rd.setVisible(true);
rd.setBounds(430, 300, 500,380); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       PaidOutReports pr=new PaidOutReports();
JDesktopPane jd =this.getDesktopPane();
jd.add(pr);
pr.setVisible(true);
pr.setBounds(0,0,1360,760);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
             SalePayTypeReports s=new  SalePayTypeReports();
JDesktopPane jd =this.getDesktopPane();
jd.add(s);
s.setVisible(true);
s.setBounds(480,200,364,520); 
          
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    TotalSaleReports ts=new  TotalSaleReports(0);
JDesktopPane jd =this.getDesktopPane();
jd.add(ts);
ts.setVisible(true);
ts.setBounds(0,0,1360,760);    
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        CancelReports cs=new  CancelReports();
JDesktopPane jd =this.getDesktopPane();
jd.add(cs);
cs.setVisible(true);
cs.setBounds(0,0,1360,760); 

    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P4;
    private javax.swing.JPanel P5;
    private javax.swing.JPanel P6;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b29;
    private javax.swing.JButton b30;
    private javax.swing.JButton b31;
    private javax.swing.JButton b32;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel p1;
    // End of variables declaration//GEN-END:variables

   
    }

