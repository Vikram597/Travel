package travel.managementsystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class forgetpassword extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    forgetpassword()
    {
        setBounds(550,300,850,450);
        getContentPane().setBackground(Color.white);
        
        
        JPanel p=new JPanel();
        setLayout(null);
        p.setBounds(30,10, 500, 350);
        add(p);
       
        JLabel l1=new JLabel("Username");
        p.setLayout(null);
        l1.setBounds(30,25,100,30);
         l1.setFont(new Font("Tahoma",Font.BOLD,18));
        p.add(l1);
             
        t1=new JTextField();
        t1.setBounds(170,25,180,26);
        t1.setFont(new Font("Tahoma",Font.PLAIN,18));
        t1.setBorder(null);
        p.add(t1);
        
        b1=new JButton("Search");
        b1.setBounds(360,25,120,26);
        b1.setFont(new Font("Tahoma",Font.BOLD,15));
         b1.addActionListener(this);
        //b1.setBackground(Color.lightGray);
       
      // b1.setBorder(null);
        p.add(b1);
            
         JLabel l2=new JLabel("Name");
            l2.setBounds(30,65, 100, 26);
            l2.setFont(new Font("Tahoma",Font.BOLD,18));
            p.add(l2);
        
              t2=new JTextField();
              t2.setBounds(170,65,180,26);
              t2.setFont(new Font("Tahoma",Font.PLAIN,18));   
              t2.setBorder(null);
              p.add(t2);
              
              
              JLabel l3=new JLabel("Security Ques");
              l3.setBounds(30,35, 200, 160);
              l3.setFont(new Font("Tahoma",Font.BOLD,18));
              p.add(l3);
              
              t3=new JTextField();
              t3.setBounds(170, 105, 310, 26);
              t3.setFont(new Font("Tahoma",Font.BOLD,18));   
              t3.setBorder(null);
              p.add(t3);
              
          
              
              JLabel l4=new JLabel("Answer");
               p.setLayout(null);
        l4.setBounds(30,140,100,30);
         l4.setFont(new Font("Tahoma",Font.BOLD,18));
             p.add(l4);
             
        t4=new JTextField();
        t4.setBounds(170,140,180,26);
        t4.setFont(new Font("Tahoma",Font.PLAIN,18));
        t4.setBorder(null);
        p.add(t4);
        
        b2=new JButton("Retrive");
        b2.setBounds(360,140,120,26);
        b2.setFont(new Font("Tahoma",Font.BOLD,15));
         b2.addActionListener(this);
        //b2.setBackground(Color.lightGray);
       
       //b2.setBorder(null);
        p.add(b2);
        
        
        //JPassword p1=new Jpassword();
                JLabel l5=new JLabel("Password");
               p.setLayout(null);
        l5.setBounds(30,175,100,30);
         l5.setFont(new Font("Tahoma",Font.BOLD,18));
             p.add(l5);
             
              t5=new JTextField();
             t5.setBounds(170,175,180,26);
             t5.setBorder(null);
             t5.setFont(new Font("Tahoma",Font.BOLD,15));
              p.add(t5);
             
           
    
     b3=new JButton("Back");
        b3.setBounds(140,230,120,26);
        b3.setFont(new Font("Tahoma",Font.BOLD,15));
        p.add(b3);
        b3.addActionListener(this);
        
                       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/managementsystem/icon/forgotpassword.png"));
                 Image i2=i1.getImage().getScaledInstance(250,250,Image.SCALE_AREA_AVERAGING);
                 ImageIcon i3=new ImageIcon(i2);
                 JLabel l6=new JLabel(i3);
                l6.setBounds(520,10,300,300);
                add(l6);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        conn obj=new conn();
          obj.loaddriver();
          obj.con();
          ResultSet rs;        
      if(ae.getSource()==b1)
      {  
         //obj.fetch(qry);
            try {
                 String sql="select * from accounts where username='"+t1.getText()+"'";
                rs=obj.st.executeQuery(sql);
                while(rs.next())
                {
                   t2.setText(rs.getString(2));
                  t3.setText(rs.getString(4));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"User not found");
            }
                }
      
      else if(ae.getSource()==b2)
      {
          try {
                 String sql="select * from accounts where username='"+t1.getText()+"' AND answer='"+t4.getText()+"'";
                rs=obj.st.executeQuery(sql);
                while(rs.next())
                {
                   t5.setText(rs.getString(3));
                  //t3.setText(rs.getString(4));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"your Answer wrong");
            }
          
      }
      
      else
      {
          this.setVisible(false);
          new login();
      }
       
    }
    
    
    public static void main(String arg[])
    {
        new forgetpassword().setVisible(true);
    }
    
}
