
package travel.managementsystem;

import java.awt.*;
import javax.swing.*;


public class checkpackage extends JFrame{
        
checkpackage()
{
 setBounds(600,250,900,600);
 String package1[]=new String[]{"GOLD PACKAGE","6 Days and 7 Nights","Airport Assitance","Half Day Tour","Daily Buffet","Welcome Drinks Arrival","Full Day 3 island Cruise","English Speaking Guide","Book Now","Summer Special","12000/-","package3.jpg"};
 String package3[]=new String[]{"BRONE PACKAGE","6 Days and 5 Nights","Return Airfare","Free Clubbing,Hosre Riding ","Daily Buffet","Welcome Drinks Arrival","Full Day 3 island Cruise","BBQ Dinner","Book Now","Winter Special","32000/-","package1.jpg"};
 JPanel p1=createPackage(package1);
  JPanel p2=createPackage1();
 
 JTabbedPane pane=new JTabbedPane();
 pane.addTab("Package 1",null,p1);
 add(pane);
 pane.addTab("Package 2",null,p2);
 add(pane);
 JPanel p3=createPackage(package3);
 pane.addTab("Package 3",null,p3);
 add(pane); 
 add(pane,BorderLayout.CENTER);
 
}
public JPanel createPackage(String pack[]){
       
        JPanel  p1=new JPanel();
        p1.setLayout(null);
    p1.setBackground(Color.white);
    
    JLabel l1=new JLabel(pack[0]);
        l1.setBounds(10,10,300,30);
   l1.setFont(new Font("Tahoma",Font.BOLD,30));
    p1.add(l1);
    
    
    JLabel l2=new JLabel(pack[1]);
    l2.setForeground(Color.red);
    l2.setBounds(30,60,300,30);
   l2.setFont(new Font("Tahoma",Font.PLAIN,20));
   l2.setForeground(Color.blue);
    p1.add(l2);
    
    JLabel l3=new JLabel(pack[2]);
    l3.setForeground(Color.red);
    l3.setBounds(30,100,300,30);
   l3.setFont(new Font("Tahoma",Font.PLAIN,20));
   l3.setForeground(Color.red);
    p1.add(l3);
    JLabel l4=new JLabel(pack[3]);
    l4.setForeground(Color.red);
    l4.setBounds(30,150,300,30);
   l4.setFont(new Font("Tahoma",Font.PLAIN,20));
   l4.setForeground(Color.blue);
    p1.add(l4);
    
    JLabel l5=new JLabel(pack[4]);
    l5.setForeground(Color.red);
    l5.setBounds(30,200,300,30);
   l5.setFont(new Font("Tahoma",Font.PLAIN,20));
   l5.setForeground(Color.red);
    p1.add(l5);
    
    
    JLabel l6=new JLabel(pack[5]);
    l6.setForeground(Color.red);
    l6.setBounds(30,250,300,30);
   l6.setFont(new Font("Tahoma",Font.PLAIN,20));
   l6.setForeground(Color.blue);
    p1.add(l6);
    
    JLabel l7=new JLabel(pack[6]);
    l7.setForeground(Color.red);
    l7.setBounds(30,300,300,30);
   l7.setFont(new Font("Tahoma",Font.PLAIN,20));
   l7.setForeground(Color.red);
    p1.add(l7);
    
    
    
    JLabel l8=new JLabel(pack[7]);
    l8.setForeground(Color.red);
    l8.setBounds(30,350,300,30);
   l8.setFont(new Font("Tahoma",Font.PLAIN,20));
   l8.setForeground(Color.blue);
    p1.add(l8);
    
    JLabel l9=new JLabel(pack[8]);
    l9.setForeground(Color.red);
    l9.setBounds(30,400,300,30);
   l9.setFont(new Font("Tahoma",Font.BOLD,30));
   l9.setForeground(Color.red);
    p1.add(l9);
    
    JLabel l10=new JLabel(pack[9]);
    l10.setForeground(Color.red);
    l10.setBounds(400,420,300,50);
   l10.setFont(new Font("Tahoma",Font.PLAIN,35));
   l10.setForeground(Color.blue);
    p1.add(l10);
    
     JLabel l11=new JLabel(pack[10]);
    l11.setForeground(Color.red);
    l11.setBounds(700,430,300,30);
   l11.setFont(new Font("Tahoma",Font.PLAIN,35));
   l11.setForeground(Color.red);
    p1.add(l11);
    
     ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travel/managementsystem/icon/"+pack[11]));
                        Image i2=i1.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
                        ImageIcon i3= new ImageIcon(i2);
                        JLabel l12=new JLabel(i1);
                        l12.setBounds(350,30,450,300);
                       p1.add(l12);
    
    
    return p1;  
}
public JPanel createPackage1(){
       
        JPanel  p2=new JPanel();
        p2.setLayout(null);
    p2.setBackground(Color.white);
    
    JLabel l13=new JLabel("SILVER PACKAGE");
        l13.setBounds(10,10,300,30);
   l13.setFont(new Font("Tahoma",Font.BOLD,30));
    p2.add(l13);
    
    
   JLabel l14=new JLabel("5 Days and 6 night");
    l14.setForeground(Color.red);
    l14.setBounds(30,60,300,30);
   l14.setFont(new Font("Tahoma",Font.PLAIN,20));
   l14.setForeground(Color.blue);
    p2.add(l14);
    
    JLabel l15=new JLabel("Toll Free and Entrace Tick");
    l15.setForeground(Color.red);
    l15.setBounds(30,100,300,30);
   l15.setFont(new Font("Tahoma",Font.PLAIN,20));
   l15.setForeground(Color.red);
    p2.add(l15);
    JLabel l16=new JLabel("Meet and Great at Airport");
    l16.setForeground(Color.red);
    l16.setBounds(30,150,300,30);
   l16.setFont(new Font("Tahoma",Font.PLAIN,20));
   l16.setForeground(Color.blue);
    p2.add(l16);
    
    JLabel l17=new JLabel("Night Safari");
    l17.setForeground(Color.red);
    l17.setBounds(30,200,300,30);
   l17.setFont(new Font("Tahoma",Font.PLAIN,20));
   l17.setForeground(Color.red);
    p2.add(l17);
    
    
    JLabel l18=new JLabel("Full day 3 Island Cruis");
    l18.setForeground(Color.red);
    l18.setBounds(30,250,300,30);
   l18.setFont(new Font("Tahoma",Font.PLAIN,20));
   l18.setForeground(Color.blue);
    p2.add(l18);
    
    JLabel l19=new JLabel("Cruise with Dinner");
    l19.setForeground(Color.red);
    l19.setBounds(30,300,300,30);
   l19.setFont(new Font("Tahoma",Font.PLAIN,20));
   l19.setForeground(Color.red);
    p2.add(l19);
    
    
    
    JLabel l20=new JLabel("English Speaking Guide");
    l20.setForeground(Color.red);
    l20.setBounds(30,350,300,30);
   l20.setFont(new Font("Tahoma",Font.PLAIN,20));
   l20.setForeground(Color.blue);
    p2.add(l20);
    
    JLabel l21=new JLabel("BOOK NOW");
    l21.setForeground(Color.red);
    l21.setBounds(30,400,300,30);
   l21.setFont(new Font("Tahoma",Font.BOLD,30));
   l21.setForeground(Color.red);
    p2.add(l21);
    
    JLabel l22=new JLabel("WINTER SPECIAL");
    l22.setForeground(Color.red);
    l22.setBounds(400,420,300,50);
   l22.setFont(new Font("Tahoma",Font.PLAIN,35));
   l22.setForeground(Color.blue);
    p2.add(l22);
    
     JLabel l23=new JLabel("RS 24000/-");
    l23.setForeground(Color.red);
    l23.setBounds(700,430,300,30);
   l23.setFont(new Font("Tahoma",Font.PLAIN,35));
   l23.setForeground(Color.red);
    p2.add(l23);
    
     ImageIcon i2= new ImageIcon(ClassLoader.getSystemResource("travel/managementsystem/icon/package2.jpg"));
                        Image i3=i2.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
                        ImageIcon i4= new ImageIcon(i3);
                        JLabel l60=new JLabel(i4);
                        l60.setBounds(350,30,450,300);
                       p2.add(l60);
    
    
    return p2;  
}

    public static void main(String arg[])
    {
        new checkpackage().setVisible(true);
    }
    
}
