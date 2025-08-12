import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Type4DriverDelete{
public static void main(String[] args)throws ClassNotFoundException,SQLException{

//step1:load the query
Class.forName("com.mysql.jdbc.Driver");
System.out.println("Driver loaded successfully");

//step2:Establish the connection
Connection connew=DriverManager.getConnection("jdbc:mysql://localhost:3307/advancejava","root","root");
System.out.println("Connection established successfully");

//step3:Create the statement
Statement stmtnew=connew.createStatement();
System.out.println("Statement created successfully");

//step4:Execute the query
stmtnew.executeUpdate("delete from employee where id=103 ");
System.out.println("Query deleted successfully");

//step4:Release the resources
stmtnew.close();
connew.close();
System.out.println("Resourses closed successfully");

}
}