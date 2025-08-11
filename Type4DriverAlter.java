import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Type4DriverAlter{
public static void main(String[] args)throws SQLException,ClassNotFoundException{

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/advancejava","root",
"root");
Statement stmt=con.createStatement();
stmt.executeUpdate("insert into employee values(105,'ikhlas',24,'ikhlas@gmail') ");

stmt.close();
con.close();


}
}