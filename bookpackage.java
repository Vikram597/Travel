
package travel.managementsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class bookpackage extends JFrame implements ActionListener{
    JComboBox c1;
    JTextField t1;
    JLabel l9,l10,l11,l12,l13;
    JButton b1,b2,b3;
   
    bookpackage(String username)
    {
        setBounds(600,240,1000,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        JLabel l1=new JLabel("BOOK Package");
        l1.setBounds(100,00,200,30);
        l1.setFont(new Font("",Font.BOLD,20));
        add(l1);
        
        JLabel l2=new JLabel("Username");
        l2.setBounds(10,60,200,30);
        l2.setFont(new Font("",Font.PLAIN,20));
        add(l2);
        
        JLabel l3=new JLabel("Select Package");
        l3.setBounds(10,100,200,30);
        l3.setFont(new Font("",Font.PLAIN,20));
        add(l3);
        
         JLabel l4=new JLabel("Total Persons");
        l4.setBounds(10,140,200,30);
        l4.setFont(new Font("",Font.PLAIN,20));
        add(l4);
        
         JLabel l5=new JLabel("ID");
        l5.setBounds(10,180,200,30);
        l5.setFont(new Font("",Font.PLAIN,20));
        add(l5);
        
         JLabel l6=new JLabel("Number");
        l6.setBounds(10,220,200,30);
        l6.setFont(new Font("",Font.PLAIN,20));
        add(l6);
        
         JLabel l7=new JLabel("Phone");
        l7.setBounds(10,260,200,30);
        l7.setFont(new Font("",Font.PLAIN,20));
        add(l7);
        
         JLabel l8=new JLabel("Total Price");
        l8.setBounds(10,320,200,30);
        l8.setFont(new Font("",Font.PLAIN,20));
        add(l8);
         l9=new JLabel(username);
        l9.setBounds(200,60,200,30);
        l9.setFont(new Font("",Font.PLAIN,20));
        add(l9);
        c1=new JComboBox(new String[]{"Gold Package","Silver Package","Bronze Package"});
                   c1.setBounds(200,100,200,20);
                    c1.setFont(new Font("Tahoma",Font.PLAIN,20));
                   add(c1);
         t1=new JTextField();
         t1.setBounds(200,140,200,20);
         add(t1);
             l10=new JLabel("pass");
        l10.setBounds(200,180,200,30);
        l10.setFont(new Font("",Font.PLAIN,20));
        add(l10); 
        
        l11=new JLabel("5958");
        l11.setBounds(200,220,200,30);
        l11.setFont(new Font("",Font.PLAIN,20));
        add(l11);
        
        l12=new JLabel("mm");
        l12.setBounds(200,260,200,30);
        l12.setFont(new Font("",Font.PLAIN,20));
        add(l12);
         l13=new JLabel();
        l13.setBounds(200,320,200,30);
        l13.setFont(new Font("",Font.BOLD,20));
        add(l13);
         b1=new JButton("Check Price");
        b1.setBounds(60,380,150,30);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.setFont(new Font("",Font.BOLD,15));
        b1.addActionListener(this);
        add(b1);
          b2=new JButton("Book Package");
        b2.setBounds(200,380,150,30);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.addActionListener(this);
        b2.setFont(new Font("",Font.BOLD,15));
        
        add(b2);
        b3=new JButton("Book Package");
        b3.setBounds(340,380,150,30);
        b3.setForeground(Color.white);
        b3.setBackground(Color.black);
        b3.setFont(new Font("",Font.BOLD,15));
        b3.addActionListener(this);
        add(b3);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travel/managementsystem/icon/bookpackage.jpg"));
                        Image i2=i1.getImage().getScaledInstance(800,700,Image.SCALE_DEFAULT);
                        ImageIcon i3= new ImageIcon(i2);
                        JLabel l14=new JLabel(i1);
                        l14.setBounds(450,30,450,300);
                       add(l14);
                       
                       
                         String qry="select * from customber where username='"+username+"'";
                       try{
                       conn c=new conn();
                       c.con();
                       c.loaddriver();
                       ResultSet rs=c.st.executeQuery(qry);
                       while(rs.next())
                       {
                         
                         l10.setText(rs.getString(2));
                         l11.setText(rs.getString(3));
                         l12.setText(rs.getString(8));
                        
                                                  
                       }
                       }
                       catch(Exception e){}
                   
    }
    public void actionPerformed(ActionEvent ae)
    {
        int cost=0;
    if(ae.getSource()==b1)
    {
      String p=(String)c1.getSelectedItem();  
       
      if(p.equals("Gold Package"))
          cost+=12000;
      else if(p.equals("Silver Package"))
          cost+=25000;
      
       else if(p.equals("Bronze Package"))
          cost+=32000;
    }
    else if(ae.getSource()==b2){
        try{
            String username=l9.getText();
            String dpackage=(String)c1.getSelectedItem();
            String person=t1.getText();
            String id=l10.getText();
            String id_number=l11.getText();
            String phone=l12.getText();
            String tprice=l13.getText();
                                                 // username package person id id_number phone price
            String qry="insert into bookpackage values('"+l9.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+l10.getText()+"','"+l11.getText()+"','"+l12.getText()+"','"+l13.getText()+"')";
        conn c1=new conn();
        c1.loaddriver();
        c1.con();
        c1.st.executeUpdate(qry);
          JOptionPane.showMessageDialog(null,"Customber Details Add Successfully");
        
       
    }
        catch(Exception e){e.printStackTrace();}
        
        
            }
    else if(ae.getSource()==b3)
    {
        this.setVisible(false);
       
    }
    
     int person=Integer.parseInt(t1.getText()); 
     cost *=person;
     l13.setText("RS "+cost);
    }
    
   
   
    public static void main(String arg[])
    {
        new bookpackage("").setVisible(true);
    }
}
