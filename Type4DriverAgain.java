import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Type4DriverAgain{
public static void main(String[] args)throws SQLException,ClassNotFoundException{

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/advancejava","root","root");
Statement stmt=con.createStatement();
stmt.executeUpdate("update country set gdp=000 where S_no=3");
stmt.close();
con.close();
}
}