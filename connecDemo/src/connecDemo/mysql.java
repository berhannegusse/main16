package connecDemo;
import java.sql.*;
public class mysql {
public static void main(String[] args) {
try {
String driver = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/first-db";
String username = "root"; //your username
String password = "12345"; //your password
Class.forName(driver); //optional
Connection conn = DriverManager.getConnection(url,
username, password);
System.out.println("Established Connection");
}catch (Exception e) {
e.printStackTrace();// TODO: handle exception
}
}
}