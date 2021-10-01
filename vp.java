
package travel.managementsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class vp extends JFrame implements ActionListener{
     JLabel l9,l10,l11,l12,l13,l14,l15;
     JButton b1;
    vp(String username){
            setBounds(600,200,800,600);
            getContentPane().setBackground(Color.white);
            setLayout(null);
            
            JLabel l1=new JLabel("VIEW PACKAGE DETAILS");
            l1.setBounds(200,00,500,30);
            l1.setFont(new Font("",Font.BOLD,30));
            l1.setForeground(Color.red);
            add(l1);
            
            
             JLabel l2=new JLabel("Username");
            l2.setBounds(20,80,200,30);
            l2.setForeground(Color.BLACK);
            l2.setFont(new Font("",Font.PLAIN,20));
            add(l2);
            
            JLabel l3=new JLabel("Package");
            l3.setBounds(20,140,200,30);
            l3.setFont(new Font("",Font.PLAIN,20));
            l3.setForeground(Color.BLACK);
            add(l3);
            
            JLabel l4=new JLabel("Total Person");
            l4.setBounds(20,200,200,30);
            l4.setFont(new Font("",Font.PLAIN,20));
            l4.setForeground(Color.BLACK);
            add(l4);
            
            JLabel l5=new JLabel("ID");
            l5.setBounds(20,250,200,30);
            l5.setFont(new Font("",Font.PLAIN,20));
            l5.setForeground(Color.BLACK);
            add(l5);
            
            
            JLabel l6=new JLabel("Number");
            l6.setBounds(20,300,200,30);
            l6.setFont(new Font("",Font.PLAIN,20));
            l6.setForeground(Color.BLACK);
            add(l6);
            
            JLabel l7=new JLabel("Phone");
            l7.setBounds(20,360,200,30);
            l7.setFont(new Font("",Font.PLAIN,20));
            l7.setForeground(Color.BLACK);
            add(l7);
            
            JLabel l8=new JLabel("Price");
            l8.setBounds(20,400,200,30);
            l8.setFont(new Font("",Font.PLAIN,20));
            l8.setForeground(Color.BLACK);
            add(l8);
            
            b1=new JButton("Back");
            b1.setBounds(70,450,200,40);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.white);
            b1.addActionListener(this);
            add(b1);
            l9=new JLabel("Username");
            l9.setBounds(220,75,200,30);
            l9.setFont(new Font("",Font.PLAIN,20));
            l9.setForeground(Color.BLACK);
            add(l9);
            
           l10=new JLabel("Username");
            l10.setBounds(220,135,200,30);
            l10.setFont(new Font("",Font.PLAIN,20));
            l10.setForeground(Color.BLACK);
            add(l10);
            
           l11=new JLabel("Username");
            l11.setBounds(220,200,200,30);
            l11.setFont(new Font("",Font.PLAIN,20));
            l11.setForeground(Color.BLACK);
            add(l11);
            
           l12=new JLabel("Username");
            l12.setBounds(220,245,200,30);
            l12.setFont(new Font("",Font.PLAIN,20));
            l12.setForeground(Color.BLACK);
            add(l12);
            
             
           l13=new JLabel("Username");
            l13.setBounds(220,285,200,30);
            l13.setFont(new Font("",Font.PLAIN,20));
            l13.setForeground(Color.BLACK);
            add(l13);
            
           l14=new JLabel("Username");
            l14.setBounds(220,350,200,30);
            l14.setFont(new Font("",Font.PLAIN,20));
            l14.setForeground(Color.BLACK);
            add(l14);
            
             l15=new JLabel("Username");
            l15.setBounds(220,410,200,30);
            l15.setFont(new Font("",Font.PLAIN,20));
            l15.setForeground(Color.BLACK);
            add(l15);
            try{
            conn c1=new conn();
            c1.con();
            c1.loaddriver();
            String qry="select * from BOOKPACKAGE where username='"+username+"'";
           ResultSet rs=c1.st.executeQuery(qry);
           while(rs.next())
           {
               l9.setText(rs.getString(1));
               l10.setText(rs.getString(2));
               l11.setText(rs.getString(3));
               l12.setText(rs.getString(4));
               l13.setText(rs.getString(5));
               l14.setText(rs.getString(6));
               l15.setText(rs.getString(7));
           }
            }catch(Exception e){
                       }
           
    ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travel/managementsystem/icon/bookedDetails.jpg"));
                        Image i2=i1.getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT);
                        ImageIcon i3= new ImageIcon(i2);
                        JLabel l16=new JLabel(i3);
                        l16.setBounds(400,75,300,400);
                       add(l16);     
}
    
    
    
    
     public static void main(String arg[])
    {
        new vp("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1)
        {
            this.setVisible(false);
        }
    }
     
     
}
