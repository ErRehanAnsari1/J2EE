import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class Type4DriverNewTry{
public static void main(String[] args)throws ClassNotFoundException,SQLException{

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/advancejava","root","root");
Statement stmt=con.createStatement();
stmt.executeUpdate("create table Country(S_no int primary key,country_name varchar(20),region varchar(20) )");
 
stmt.close();
con.close();
}
}