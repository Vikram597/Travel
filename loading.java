
package travel.managementsystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;


public class loading extends JFrame implements Runnable {
    JProgressBar p1;
    String username;
   
    Thread t;
   public void run()
    {
        try{
            
            for(int i=1;i<=101;i++)
            {
                int m=p1.getMaximum();  //getMaximum return 100 because max value of i is 100
                int n=p1.getValue();             //getvalue of i
                  
                if(n<m)
                {
                   // i=101;
                    p1.setValue(p1.getValue() +1 );
                }
                
                else
                {
                    setVisible(false);
                    new dashbord(username).setVisible(true);
                }
            
            Thread.sleep(50);
            }
        }catch(Exception e)
        {
            
        }
        }
        
       
       
        loading(String user)
    {
         username=user;
        setBounds(500,300,800,600);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel l1=new JLabel("Travel And Tourism Application");
        l1.setBounds(80,20,1500,150);
        //setLayout(null);
        l1.setFont(new Font("Rayeway",Font.BOLD,40));
        l1.setForeground(Color.BLUE);
                add(l1);
                
                p1=new JProgressBar();
                p1.setStringPainted(true);
                p1.setBounds(220,150,350,25);
                add(p1);
                
                JLabel l2=new JLabel("Please Wait...");
                l2.setBounds(290,160,130,80);
                l2.setFont(new Font("Tahoma",Font.BOLD,18));
                l2.setForeground(Color.red);
                add(l2);
                
                
                 JLabel l3=new JLabel("Welcome  " +user);
                l3.setBounds(10,480,200,80);
                l3.setFont(new Font("Tahoma",Font.BOLD,18));
                l3.setForeground(Color.red);
                add(l3);
                 t=new Thread(this);
                t.start();
    }
    
    public static void main(String arg[])
    {
        new loading("");
    }
    
}
