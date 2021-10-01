
package travel.managementsystem;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class updatecustomer extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t14;
     JComboBox c1;
    JRadioButton r1,r2,r3;
    String usernmae;
            
    
    updatecustomer(String username){
       // this.usernmae=username;
                   setBounds(600,250,850,550);
                   getContentPane().setBackground(Color.white);
                   setLayout(null);
                   
                   
                   JLabel l1=new JLabel("Updates Customber Details");
                     l1.setBounds(100,0,350,23);
                    l1.setFont(new Font("Tahoma",Font.BOLD,25));
                   l1.setForeground(Color.red);             
                   add(l1);
                   
                   
                      
                   JLabel l11=new JLabel("User Name:");
                   l11.setBounds(30,60,140, 20);
                   l11.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l11);
                   
                      
                   JLabel l2=new JLabel("ID:");
                   l2.setBounds(30,90,100, 20);
                   l2.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l2);
                   
                   
                      
                   JLabel l3=new JLabel("Number:");
                   l3.setBounds(30,30,100,220);
                   l3.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l3);
                   
                   
                      
                   JLabel l4=new JLabel("Name:");
                   l4.setBounds(30,170,100, 20);
                   l4.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l4);
                           
                            
                      
                   JLabel l5=new JLabel("Gender:");
                   l5.setBounds(30,215,100, 20);
                   l5.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l5);
                   
                   
                   
                      
                   JLabel l6=new JLabel("Country:");
                   l6.setBounds(30,255,100, 20);
                   l6.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l6);
                   
                      
                   JLabel l7=new JLabel("Address:");
                   l7.setBounds(30,295,100, 20);
                   l7.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l7);
                   
                   
                      
                   JLabel l8=new JLabel("Mobile NO:");
                   l8.setBounds(30,335,100, 20);
                   l8.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l8);
                   
                     
                   JLabel l9=new JLabel("Email:");
                   l9.setBounds(30,365,100, 20);
                   l9.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(l9);
                   
                  
                   
                   t1=new JTextField();
                   t1.setBounds(200,55, 250, 23);
                    t1.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(t1);
                   
                    t2=new JTextField();
                   t2.setBounds(200,95, 250, 23);
                    t2.setFont(new Font("Tahoma",Font.PLAIN,20));   //id
                   add(t2);
                      
                   
                    t3=new JTextField();
                   t3.setBounds(200,130, 250, 23);
                    t3.setFont(new Font("Tahoma",Font.PLAIN,20));//number
                   add(t3);
                   
                   
                     t4=new JTextField();
                   t4.setBounds(200,170, 250, 23);
                    t4.setFont(new Font("Tahoma",Font.PLAIN,20));
                      add(t4);
                       t5=new JTextField();
                   t5.setBounds(200,210, 250, 23);
                    t5.setFont(new Font("Tahoma",Font.PLAIN,20)); //gender%
                      add(t5);
                 
                
                    t6=new JTextField();
                   t6.setBounds(200,250, 250, 23);
                    t6.setFont(new Font("Tahoma",Font.PLAIN,20));
                      add(t6);
                      
                      
                      
                      
                        t7=new JTextField();
                   t7.setBounds(200,290, 250, 23);
                    t7.setFont(new Font("Tahoma",Font.PLAIN,20));
                      add(t7);
                  
                       
                   t8=new JTextField();
                   t8.setBounds(200,330, 250, 23);
                    t8.setFont(new Font("Tahoma",Font.PLAIN,20));
                      add(t8);
                      
                        t9=new JTextField();
                   t9.setBounds(200,360, 250, 23);
                    t9.setFont(new Font("Tahoma",Font.PLAIN,20));
                      add(t9);
                      
                       
                  
                                           
                       b1=new JButton("Updates");
                      b1.setBounds(220,400,100,30); 
                      b1.setForeground(Color.white);
                      b1.setFont(new Font("Tahoma",Font.BOLD,15));
                       b1.setBackground(Color.BLACK);
                       b1.addActionListener(this);
                      add(b1);
                      
                        b2=new JButton("BACK");
                      b2.setBounds(350,400,100,30);
                       b2.setForeground(Color.WHITE);
                       b2.setBackground(Color.BLACK);
                       b2.addActionListener(this);
                       b2.setFont(new Font("Tahoma",Font.BOLD,15));
                      add(b2);
                      
                      
                      
                      
                     
                      
                       ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travel/managementsystem/icon/update.png"));
                        Image i2=i1.getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT);
                        ImageIcon i3= new ImageIcon(i2);
                        JLabel l10=new JLabel(i1);
                        l10.setBounds(400,00,450,420);
                       add(l10);
                      
                       
                       String qry="select * from customber where username='"+username+"'";
                       try{
                       conn c=new conn();
                       c.con();
                       c.loaddriver();
                       ResultSet rs=c.st.executeQuery(qry);
                       while(rs.next())
                       {
                         t1.setText(rs.getString("username"));
                         t2.setText(rs.getString(3));
                         t3.setText(rs.getString("name"));
                         t4.setText(rs.getString(4));
                         t5.setText(rs.getString(5));
                         t6.setText(rs.getString(6));
                         t7.setText(rs.getString(7));
                         t8.setText(rs.getString(8));
                         t9.setText(rs.getString(9));
                         
                       }
                       }
                       catch(Exception e){}
                       
                       
                      
    }
    
    public static void main(String arg[])
    {
        new updatecustomer("").setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String username=t1.getText();
        String id=t2.getText();
        String id_number=t3.getText();
        String name=t4.getText();
        String radio=t5.getText();
                  
        String country=t6.getText();
        String address=t7.getText();
        String mobile=t8.getText();
        String email=t9.getText();
        
        
       if(ae.getSource()==b1)      
        
       {

                          
        try{                                       
         String qry="update customber set username='"+username+"',id='"+id+"',id_number='"+id_number+"',name='"+name+"',radio='"+radio+"',country='"+country+"',address='"+address+"',mobile='"+mobile+"',email='"+email+"'where username='"+username+"'";
         conn c1=new conn();
         c1.loaddriver();
         c1.con();
        c1.st.executeUpdate(qry);
        JOptionPane.showMessageDialog(null,"Customber Details Updated Successfully");
        this.setVisible(false);
        
        }
            catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Ye mujhe pata tha");
            }
        
        
        
       }
        
        
        else
        {
            setVisible(false);
            new dashbord("").setVisible(true);
        }
    }
}
