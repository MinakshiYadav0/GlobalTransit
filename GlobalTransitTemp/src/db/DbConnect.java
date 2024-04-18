
package db;
import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnect {
    public static Connection c;
    public static Statement st;
    static{
        try{
            //JDBC Code.
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/globaltransitdb", "root","Mini1575@");
            st=c.createStatement();
        }catch(SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null, "Entry Already Exists");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
