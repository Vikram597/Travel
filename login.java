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
public class login extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    JTextField t1;
    JPasswordField t2;
    
                    login()
                    {
                        setBounds(500,300,900,600);
                        setVisible(true);
                        setLayout(null); //By default setLayout(Bordar); some example of layout :- FlowLayouts,GridLayout
                        getContentPane().setBackground(Color.white);
                        //Panel adding Code
                        JPanel p1=new JPanel();
                        p1.setBounds(0,0,450,450);
                        add(p1);
                        p1.setBackground(new Color(131,193,233));
                        p1.setLayout(null);
                        // adding images
                        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travel/managementsystem/icon/login.png"));
                        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
                        ImageIcon i3= new ImageIcon(i2);
                        JLabel l1=new JLabel(i1);
                        l1.setBounds(100,120,200,200);
                        p1.add(l1);
                        JPanel p2=new JPanel();
                        p2.setLayout(null);
                        p2.setBounds(450,30,450,300);
                        add(p2);
                        
                        // UserName Field code
                        JLabel l2=new JLabel("USERNAME");
                        l2.setBounds(60,20,130, 25);
                        l2.setFont(new Font("SAM_SERIF",Font.BOLD,15));
                        p2.add(l2);
                       t1=new JTextField();
                       t1.setBounds(60,55,300,30);
                       p2.add(t1);
                       t1.setBorder(BorderFactory.createEmptyBorder() );
                       t1.setFont(new Font("SAM_SERIF",Font.PLAIN,30));
                       
                       // password field code
                       JLabel l3=new JLabel("Password");
                       l3.setBounds(60,90,100,30);
                       l3.setFont(new Font("SAM_SERIF",Font.BOLD,15));
                       p2.add(l3);
                       
                        t2=new JPasswordField();
                       t2.setBounds(60,125,300,30);
                      t2.setFont(new Font("SAM_SERIF",Font.BOLD,20));
                       p2.add(t2);
                       t2.setBorder(BorderFactory.createEmptyBorder());
                    
                      b1=new JButton("Login");
                       b1.setBounds(60,165,150,30);
                       p2.add(b1);
                       b1.addActionListener(this);
                      // b1.setBackground(new Color(133,193,233));
                       
                    b2=new JButton("Signup");
                       b2.setBounds(280,165,150,30);
                       p2.add(b2);
                       b2.addActionListener(this);
                       
                        b3=new JButton("Forget Password");
                       b3.setBounds(170,210,150,30);
                       b3.setBorder(BorderFactory.createEmptyBorder());
                       b3.addActionListener(this);
                       p2.add(b3);
                       
                       
                       JLabel l4=new JLabel("Trouble in Login");
                       l4.setBounds(330,210,150,30);
                       l4.setForeground(Color.red);
                       p2.add(l4);
                       
                                             
                                     }
                    
    @Override
  public void actionPerformed(ActionEvent ae)
  {
      conn c=new conn();
      c.loaddriver();
      c.con();
      if(ae.getSource()==b1) 
      {
          
          String username=t1.getText();
          String password=t2.getText();
          String sql="select * from accounts where username='"+username+"' and password='"+password+"'";
          ResultSet rs;
            try {
                rs = c.st.executeQuery(sql);
                if(rs.next())
          {
              this.setVisible(false);
              new loading(username).setVisible(true);
          }
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid user Id and Password");
                }
            } catch (SQLException ex) {
                
            }
          
          
      }
      
      else if(ae.getSource()==b2)
      {
          
         new signup().setVisible(true);
         this.setVisible(false);
         
      }
      
      else
      {
          this.dispose();
          new forgetpassword().setVisible(true);
      }
      
  }
  
  
 public static void main(String arg[])
 {
   //new login();
     new login();
 }
}