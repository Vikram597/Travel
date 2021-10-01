
package travel.managementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class dashbord extends JFrame implements ActionListener{
 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
 String username;
 
 
  dashbord(String username)
    {    
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travel/managementsystem/icon/home.jpg"));
        Image i2=i1.getImage().getScaledInstance(1950,1000,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,1950,1000);
        setLayout(null);
        add(l1);
        
        JPanel p1=new JPanel();
        setLayout(null);
        p1.setBounds(0,0,1950,70);
        p1.setBackground(new Color(0,0,180));
         l1.add(p1);
         
         JLabel l3=new JLabel("Dashboard");
         l3.setFont(new Font("Tahoma",Font.BOLD,25));
         l3.setForeground(Color.white);
         l3.setBounds(80,10,400,40);
         p1.add(l3);
         
         JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,70,300,1000);
        p2.setBackground(new Color(0,0,180));
        l1.add(p2);
        
        
                b1=new JButton("Add Personal Details");
                b1.setBounds(0,0,300,50);
                b1.setBackground(new Color(0,0,180));
                b1.setFont(new Font("Tahoma",Font.PLAIN,20));
                b1.setMargin(new Insets(0,0,0,60));
                b1.addActionListener(this);
                b1.setForeground(Color.white);
                       p2.add(b1);
                       
                       
                       b2=new JButton("Updates Personal Details");
                b2.setBounds(0,50,300,50);
                b2.setBackground(new Color(0,0,180));
                 b2.setMargin(new Insets(0,0,0,40));
                b2.setFont(new Font("Tahoma",Font.PLAIN,20));
                b2.addActionListener(this);
                b2.setForeground(Color.white);
                       p2.add(b2);
                       
                       
                       
                       
                       
                      b3=new JButton("View Details");
                b3.setBounds(0,100,300,50);
                b3.setBackground(new Color(0,0,180));
                 b3.setMargin(new Insets(0,0,0,145));
                b3.setFont(new Font("Tahoma",Font.PLAIN,20));
                  b3.addActionListener(this);
                b3.setForeground(Color.white);
                       p2.add(b3);
                       
                       
                       
                       
                      b4=new JButton("Delete Personal Details");
                b4.setBounds(0,150,300,50);
                b4.setBackground(new Color(0,0,180));
                 b4.setMargin(new Insets(0,0,0,45));
                b4.setFont(new Font("Tahoma",Font.PLAIN,20));
                  b4.addActionListener(this);
                b4.setForeground(Color.white);
                       p2.add(b4);
                       
                       
                       
                      b5=new JButton("Check Package");
                b5.setBounds(0,200,300,50);
                b5.setBackground(new Color(0,0,170));
                 b5.setMargin(new Insets(0,0,0,130));
                b5.setFont(new Font("Tahoma",Font.PLAIN,20));
                b5.setForeground(Color.white);
                  b5.addActionListener(this);
                       p2.add(b5);
                       
                       
                      b6=new JButton("Book Package");
                b6.setBounds(0,250,300,50);
                b6.setBackground(new Color(0,0,170));
                 b6.setMargin(new Insets(0,0,0,130));
                b6.setFont(new Font("Tahoma",Font.PLAIN,20));
                  b6.addActionListener(this);
                b6.setForeground(Color.white);
                       p2.add(b6);
                       
                       
                       
                       
                       
                   b7=new JButton("View Book Package");
                b7.setBounds(0,300,300,50);
                b7.setBackground(new Color(0,0,170));
                 b7.setMargin(new Insets(0,0,0,80));
                b7.setFont(new Font("Tahoma",Font.PLAIN,20));
                b7.setForeground(Color.white);
                  b7.addActionListener(this);
                       p2.add(b7);
                       
                       
                       
                       
                      b8=new JButton("View Hotels");
                b8.setBounds(0,350,300,50);
                b8.setBackground(new Color(0,0,180));
                b8.setFont(new Font("Tahoma",Font.PLAIN,20));
                 b8.setMargin(new Insets(0,0,0,150));
                b8.setForeground(Color.white);
                  b8.addActionListener(this);
                       p2.add(b8);
                       
                       
                       
                     b9=new JButton("Book Hotel");
                               
                b9.setBounds(0,400,300,50);
                b9.setBackground(new Color(0,0,180));
                 b9.setMargin(new Insets(0,0,0,150));
                b9.setFont(new Font("Tahoma",Font.PLAIN,20));
                b9.setForeground(Color.white);
                  b9.addActionListener(this);
                       p2.add(b9);
                       
                       
                      b10=new JButton("View Book Hotel");
                b10.setBounds(0,450,300,50);
                 b10.setMargin(new Insets(0,0,0,110));
                b10.setBackground(new Color(0,0,180));
                b10.setFont(new Font("Tahoma",Font.PLAIN,20));
                b10.setForeground(Color.white);
                  b10.addActionListener(this);
                       p2.add(b10);
                       
                       
                       
                       
                       
                     b11=new JButton("Destination");
                b11.setBounds(0,500,300,50);
                b11.setBackground(new Color(0,0,180));
                b11.setFont(new Font("Tahoma",Font.PLAIN,20));
                b11.setForeground(Color.white);
                 b11.setMargin(new Insets(0,0,0,170));
                   b11.addActionListener(this);
                       p2.add(b11);
                       
                       
                       
                       
                        b12=new JButton("Payment");
                b12.setBounds(0,550,300,50);
                b12.setBackground(new Color(0,0,180));
                b12.setFont(new Font("Tahoma",Font.PLAIN,20));
                b12.setForeground(Color.white);
                 b12.setMargin(new Insets(0,0,0,170));
                   b12.addActionListener(this);
                       p2.add(b12);
                       
                       
                       
                       
                       
                       
                       
                       
                         b13=new JButton("Calculator");
                b13.setBounds(0,600,300,50);
                b13.setBackground(new Color(0,0,180));
                b13.setFont(new Font("Tahoma",Font.PLAIN,20));
                b13.setForeground(Color.white);
                b13.addActionListener(this);
                 b13.setMargin(new Insets(0,0,0,170));
                   b13.addActionListener(this);
                       p2.add(b13);
                       
                       
                       b14=new JButton("Notepad");
                b14.setBounds(0,650,300,50);
                b14.setBackground(new Color(0,0,180));
                b14.setFont(new Font("Tahoma",Font.PLAIN,20));
                b14.setForeground(Color.white);
                 b14.setMargin(new Insets(0,0,0,170));
                   b14.addActionListener(this);
                 b14.addActionListener(this);
                       p2.add(b14);
                       
                       
                       
                       
                       
                        JButton b15=new JButton("About");
                b15.setBounds(0,700,300,50);
                b15.setBackground(new Color(0,0,180));
                b15.setFont(new Font("Tahoma",Font.PLAIN,20));
                 b15.setMargin(new Insets(0,0,0,190));
                   b15.addActionListener(this);
                b15.setForeground(Color.white);
                       p2.add(b15);
                       
                       
                       
                       
                     
                       
                       
                       
                       
                       
                       
                       
         
         setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("travel/managementsystem/icon/login.png"));
        Image i5=i4.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        p1.setLayout(null);
        l2.setBounds(0,0,70,70);
         p1.add(l2);
         
         
         
         JLabel l4=new JLabel("Travel and Tourism Management System");
         l4.setBounds(600,100,1950,80);
         l4.setForeground(Color.white);
         l4.setFont(new Font("Tahoma",Font.PLAIN,65));
         l1.add(l4);
    
    }       

    
       
                
            
    
    
        public static void main(String arg[]){
            
            
            
            
            new dashbord("").setVisible(true);
            
        }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b13){
           
           try{
               
               Runtime.getRuntime().exec("calc.exe");
           }catch(Exception e){}
           } 
        
        
        else if(ae.getSource()==b14)
            
        {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (IOException ex) {
                
            }
        }
        else if(ae.getSource()==b1)
        {
            new  addcustomber(username).setVisible(true);
        }
        
           
           else if(ae.getSource()==b2)
        {
            new  updatecustomer(username).setVisible(true);
        }
        
           else if(ae.getSource()==b3)
           {
               new view(username).setVisible(true);
           }
        
            else if(ae.getSource()==b5)
           {
               new checkpackage().setVisible(true);
           }
             else if(ae.getSource()==b6)
           {
               new bookpackage(username).setVisible(true);
           }
             else if(ae.getSource()==b7)
           {
               new vp(username).setVisible(true);
           }
        else if(ae.getSource()==b8)
           {
               new checkhotel().setVisible(true);
           }
           
        }
            
}

 




 
