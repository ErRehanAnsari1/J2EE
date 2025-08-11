import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Type4Driver{
public static void main(String[] args) throws ClassNotFoundException,SQLException{

//Step1:Load the driver

Class.forName( "com.mysql.jdbc.Driver");
System.out.println("Driver loaded successfully");

//Step2:Establish the connection

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/advancejava","root","root");
System.out.println("Connection established successfully");

//Step3:Create the statement

Statement stmt=con.createStatement();
System.out.println("Statement created successfully");

//Step4:Execute the query
stmt.executeUpdate("insert into employee values(101,'sanskar',22,'sanskar@gmail')(102,' rehan' ,22,'rehan@gmail'),(103,'gautam',23,'gautam@gmail.com')");
System.out.println("Query executed successfully");

//Step5:Release the resources

stmt.close();
con.close();
System.out.println("resources closed successfully");



}
}