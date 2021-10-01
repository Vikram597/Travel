
package travel.managementsystem;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class checkhotel extends JFrame implements Runnable{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,cap;
        JLabel[] label=new JLabel[]{l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
    public void run() {
        for(int i=0;i<=9;i++)
        {
            this.label[i].setVisible(true);
            try {
                Thread.sleep(8000);
                this.label[i].setVisible(false);
            } catch (InterruptedException ex) {
                Logger.getLogger(checkhotel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    checkhotel(){
        Thread t1;
        ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
        ImageIcon[] Image=new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
        
        Image j1=null;Image j2=null;Image j3=null;Image j4=null;Image j5=null;Image j6=null;Image j7=null;Image j8=null;Image j9=null;Image j10=null;
         Image[] Jimage=new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
         
       ImageIcon i11=null,i12=null,i13=null,i14=null,i15=null,i16=null,i17=null,i18=null,i19=null,i20=null;
        ImageIcon[] iImage=new ImageIcon[]{i11,i12,i13,i14,i15,i16,i17,i18,i19,i20};
        setBounds(650,240,900,700);
                        for(int i=0;i<=9;i++)
                        {
                             Image[i]= new ImageIcon(ClassLoader.getSystemResource("travel/managementsystem/icon/hotel"+(i+1)+".jpg"));
                        Jimage[i]=Image[i].getImage().getScaledInstance(900,700,500);
                        iImage[i]= new ImageIcon(Jimage[i]);
                        this.label[i]=new JLabel(iImage[i]);
                       this.label[i].setBounds(400,00,450,420);
                       add(this.label[i]);
                   }
                 
                        t1=new Thread(this);
                        t1.start();
                         
                        cap=new JLabel();
                        cap.setBounds(50,550,1000,70);
                        cap.setForeground(Color.red);
                        cap.setFont(new Font("",Font.BOLD,20));
                        //add(cap);
                        
        
    }
    
    
  public static void main(String arg[])
{
new checkhotel().setVisible(true);
}

    
    
}


