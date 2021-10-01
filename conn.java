 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.managementsystem;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conn {
    Connection con;
    Statement st;
    ResultSet rs;
    public void loaddriver()
    {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Unable to Load driver");
        }
    }
    public void con()
    {
        try {
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","vicky");
            
           st=con.createStatement();
         
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());  
        }
    }
    public void fetch(String s)
    {
        try {
            rs=st.executeQuery(s);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}