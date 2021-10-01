/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.managementsystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Administrator
 */
public class view extends JFrame implements ActionListener{
    JButton b2;
    
    view(String username)
    {
        setBounds(700,250,880,700);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travel/managementsystem/icon/viewall.jpg"));
                        Image i2=i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
                        ImageIcon i3= new ImageIcon(i2);
                        JLabel l10=new JLabel(i3);
                        l10.setBounds(100,460,600,200);
                       add(l10);
                        JLabel l11=new JLabel("Updates Customber Details");
                     l11.setBounds(100,0,350,23);
                    l11.setFont(new Font("Tahoma",Font.BOLD,25));
                   l11.setForeground(Color.red);             
                   add(l11);
                   
                   
                      
                   JLabel l1=new JLabel("User Name:");
                   l1.setBounds(30,60,140, 20);
                   l1.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l1);
                   
                      
                   JLabel l2=new JLabel("ID:");
                   l2.setBounds(400,60,100, 20);
                   l2.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l2);
                   
                   
                      
                   JLabel l3=new JLabel("Number:");
                   l3.setBounds(30,60,100,220);
                   l3.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l3);
                   
                   
                      
                   JLabel l4=new JLabel("Name:");
                   l4.setBounds(400,170,100, 20);
                   l4.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l4);
                           
                            
                      
                   JLabel l5=new JLabel("Gender:");
                   l5.setBounds(30,255,100, 20);
                   l5.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l5);
                   
                   
                   
                      
                   JLabel l6=new JLabel("Country:");
                   l6.setBounds(400,255,100, 20);
                   l6.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l6);
                   
                      
                   JLabel l7=new JLabel("Address:");
                   l7.setBounds(30,335,100, 20);
                   l7.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l7);
                   
                   
                      
                   JLabel l8=new JLabel("Mobile NO:");
                   l8.setBounds(400,335,100, 20);
                   l8.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l8);
                   
                     
                   JLabel l9=new JLabel("Email:");
                   l9.setBounds(50,380,100, 20);
                   l9.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l9);
                   
                        
                   JLabel l12=new JLabel("username12");
                   l12.setBounds(180,60,140, 20);
                   l12.setFont(new Font("Tahoma",Font.BOLD,18));
                   add(l12);
                         
                  
                   
                    JLabel l13=new JLabel("id13");
                   l13.setBounds(500,60,150, 20);
                   l13.setFont(new Font("Tahoma",Font.BOLD,18));
                   add(l13);
                       
                    JLabel l14=new JLabel("Number14:");
                   l14.setBounds(180,60,150,220);
                   l14.setFont(new Font("Tahoma",Font.BOLD,18));
                   add(l14);
                   
                    JLabel l15=new JLabel("Name15:");
                   l15.setBounds(500,170,150, 20);
                   l15.setFont(new Font("Tahoma",Font.BOLD,18));
                   add(l15);
                   
                   JLabel l16=new JLabel("Gender16:");
                   l16.setBounds(180,255,100, 20);
                   l16.setFont(new Font("Tahoma",Font.BOLD,18));
                   add(l16);
                   JLabel l17=new JLabel("Gender:");
                   l17.setBounds(500,255,150, 20);
                   l17.setFont(new Font("Tahoma",Font.BOLD,18));
                   add(l17);
                    JLabel l18=new JLabel("Address:");
                   l18.setBounds(180,335,150, 20);
                   l18.setFont(new Font("Tahoma",Font.BOLD,18));
                   add(l18);
                   
                       
                   JLabel l19=new JLabel("Mobile NO:");
                   l19.setBounds(500,335,150, 20);
                   l19.setFont(new Font("Tahoma",Font.BOLD,18));
                   add(l19);
                   
                      
                   JLabel l20=new JLabel("Email:");
                   l20.setBounds(130,380,150, 20);
                   l20.setFont(new Font("Tahoma",Font.BOLD,18));
                   add(l20);
                       
                         b2=new JButton("BACK");
                      b2.setBounds(300,430,100,30);
                       b2.setForeground(Color.WHITE);
                       b2.setBackground(Color.BLACK);
                       b2.addActionListener(this);
                       b2.setFont(new Font("Tahoma",Font.BOLD,15));
                      add(b2);
                      
                      
                      
                        String qry="select * from customber where username='"+username+"'";
                       try{
                       conn c=new conn();
                       c.con();
                       c.loaddriver();
                       ResultSet rs=c.st.executeQuery(qry);
                       while(rs.next())
                       {
                         l12.setText(rs.getString("username"));
                         l13.setText(rs.getString(3));
                         l14.setText(rs.getString("name"));
                         l15.setText(rs.getString(4));
                         l16.setText(rs.getString(5));
                         l17.setText(rs.getString(6));
                         l18.setText(rs.getString(7));
                         l19.setText(rs.getString(8));
                         l20.setText(rs.getString(9));
                         
                       }
                       }
                       catch(Exception e){}
                      
                      
                      
                      
                      
                      
    }
    
    
    public static void main(String arg[])
    {
        new view("").setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae) {
         
     if(ae.getSource()==b2){
     
     setVisible(false);
     new dashbord("").setVisible(true);
     
     
     }    
     }
   
    
}
