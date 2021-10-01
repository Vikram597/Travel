package travel.managementsystem;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class signup extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    JTextField t1,t2,t3,t4;
    Choice c1;
                       signup(){
                           setBounds(400,300,1200,500);
                           getContentPane().setBackground(Color.WHITE);
                           setLayout(null);
                           setVisible(true);
                           
                          JPanel p1=new JPanel();
                          p1.setBackground(new Color(133,193,233));
                          p1.setBounds(0,0,500,500);
                          p1.setLayout(null);
                          add(p1);
                          
                          
                          JLabel l1=new JLabel("Username");
                          l1.setBounds(50,20,100,25);
                          l1.setFont(new Font("Tahoma",Font.BOLD,15));
                          p1.add(l1);
                          
                          
                          t1=new JTextField();
                          t1.setBounds(245,20,200,25);
                          t1.setFont(new Font("Tahoma",Font.PLAIN,15));
                          t1.setBorder(null);
                          p1.add(t1);
                          
                          
                          JLabel l2=new JLabel("Name");
                          l2.setBounds(50,60,200,25);
                          l2.setFont(new Font("Tahoma",Font.BOLD,15));
                          p1.add(l2);
                          
                          t2=new JTextField();
                          t2.setBounds(245,55,200,25);
                          t2.setBorder(null);
                          t2.setFont(new Font("Tahoma",Font.PLAIN,15));
                          p1.add(t2);
                         
                          JLabel l3=new JLabel("Password");
                          l3.setBounds(50,100,200,25);
                          l3.setFont(new Font("Tahoma",Font.BOLD,15));
                          p1.add(l3);
                          
                          t3=new JTextField();
                          t3.setBounds(245,90,200,25);
                          t3.setBorder(null);
                          t3.setFont(new Font("Tahoma",Font.PLAIN,15));
                          p1.add(t3);
                          
                          JLabel l4=new JLabel("Security Question");
                          l4.setBounds(50,130,200,25);
                          l4.setFont(new Font("Tahoma",Font.BOLD,15));     
                          p1.add(l4);
                          
                          
                          
                          c1=new Choice();
                          c1.add("Your Fav Character from The Boys");
                          c1.add("Captain America or Iron man");
                          c1.add("Your Lucky Numbre");
                          c1.add("Your Childhood Superhero");
                          c1.setBounds(195,130,250,100);
                          p1.add(c1);
                          
                          
                          JLabel l5=new JLabel("Answer");
                          l5.setBounds(50,170,200,25);
                          l5.setFont(new Font("Tahoma",Font.BOLD,15));
                          p1.add(l5);
                          
                          t4=new JTextField();
                          t4.setBounds(245,170,200,25);
                           l5.setFont(new Font("Tahoma",Font.PLAIN,15));
                          p1.add(t4);
                          
                          b1=new JButton("Create");
                          b1.setBounds(370 ,250,100,25);
                          p1.add(b1);
                          b1.addActionListener(this);
                          
                          
                          b2=new JButton("Back");
                          b2.setBounds(200,250,100,25);
                          p1.add(b2);
                          b2.addActionListener(this);
                          
                          ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/managementsystem/icon/signup.png"));
                          JLabel l6=new JLabel(i1);
                          l6.setBounds(550, 50, 200, 200);
                          add(l6);
                          
                                                   
                       }
                       
                       
      public void actionPerformed(ActionEvent ae)
      {
          String username,name,password,security,answer,qry;
          conn c=new conn();
                    c.loaddriver();
                    c.con();
          if(ae.getSource()==b1)
          {
          
               username=t1.getText();
               name=t2.getText();
               password=t3.getText();
               security=c1.getSelectedItem();
                answer=t4.getText();
               qry="insert into accounts values('"+username+"',  '"+name+"',  '"+password+"', '"+security+"', '"+answer+"')";
              
               try{
                    c.st.executeUpdate(qry);
                   JOptionPane.showMessageDialog(null,"Account Created"); 
               }catch(Exception e){
                   
                   
               }
               
               
               
               }
          
          else if(ae.getSource()==b2)
          {
              new login().setVisible(true);
              this.setVisible(false);
              
          }
      }
                       
                       
                       
public static void main(String arg[]) 
{
    new signup();
}
    
}
