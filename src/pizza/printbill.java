
package pizza;

import java.awt.Font;
import java.awt.Graphics;





import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Date;
import javax.swing.ImageIcon;


public class printbill implements Printable {

    String s1;
    PageFormat pf1;
    int bno=0;
    String tb="";
String tp;    
    printbill()
    { 
        PrinterJob job=PrinterJob.getPrinterJob();
        try
        {
            boolean b1 = job.printDialog();
            if(b1==true)
            {
                PageFormat pf=job.defaultPage();
                Paper paper=pf.getPaper();
                paper.setSize(PAGE_EXISTS, PAGE_EXISTS);
                paper.setImageableArea(1.0d, 1.0d, 80.0d, PAGE_EXISTS);
                pf.setPaper(paper);
                job.setPrintable(this, pf);
       
            job.print();
            }
        }
        catch(Exception e)
        {
        System.out.println(e)    ;
        }
    }
     printbill(String s,int ik,String s2,String s3)
    {
        bno=ik;
        tb=s2;
        s1=s;
        tp=s3;
        PrinterJob job=PrinterJob.getPrinterJob();
        
        
         

        try
        {
            boolean b1 = job.printDialog();
            if(b1==true)
            {
                PageFormat pf=job.defaultPage();
                Paper paper=pf.getPaper();
                paper.setSize(PAGE_EXISTS, PAGE_EXISTS);
                paper.setImageableArea(1.0d, 1.0d, 80.0d, PAGE_EXISTS);
                pf.setPaper(paper);
                job.setPrintable(this, pf);

            job.print();
            }
        }
        catch(Exception e)
        {
        System.out.println(e)    ;
        }
    }
        public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
             if (page > 0) { 
            return -1;
        }    
        Paper p = pf.getPaper();
        Double d=10.1   ;
        String[] sp = s1.split("--");    
        
            int y=125;
            Font f122=new Font("Times New Roman",60,35);
             g.setFont(f122);
             g.drawString("@PIzZA", 20, 43);
             Font f=new Font("Times New Roman",8,8);
             g.setFont(f);
             g.drawLine(0, 50, 230, 50);
             g.drawString("Bill No. ", 10, 62);
           g.drawString(""+bno, 35, 62);
             g.drawString("Date", 130, 62);
                 Date d1 = new java.util.Date();
                 String f12 = new java.text.SimpleDateFormat("dd/MM/YYYY").format(d1);
             g.drawString(f12, 155, 62);
             g.drawString("Estimate Only ", 85, 80);
             g.drawString("Sr. No.", 10, 100);
             g.drawString("Particulars", 35, 100);
             
             
             g.drawString("Qty", 165, 100);
             g.drawString("Total", 185,100);
             g.drawLine(0, 105, 230, 105);
             Font f1=new Font("Times New Roman",8,8);
             g.setFont(f1);
            
             for(int tt=0;tt<sp.length;tt++)
        {
            
            int tt1=tt+1;
             g.drawString(""+tt1, 20, y);
                 String[] sp1 = sp[tt].split("-");
                 g.drawString(sp1[0]+"   "+sp1[1], 35,y);
                 
             g.drawString(sp1[2], 165, y);
             g.drawString(sp1[3], 180, y);
                 y=y+20;
        }
                 g.drawString("Total Bill", 130, y+8);
                 g.drawString(tb, 177, y+8);
             g.drawLine(0, y+10, 230, y+10);
             Font f11=new Font("Times New Roman",10,10);
             g.setFont(f11);
             g.drawString("!!!! Thanks For Visit !!!!", 65, y+25);
             g.drawString("Software By :- Anurag Bajaj", 25, y+45);
        
          
        return 0;
        }
   
}
