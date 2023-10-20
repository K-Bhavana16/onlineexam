import java.sql.*;
public class DBConnection{
  Connection conn;
   Connection Dbconnection(){
     try{
     clss.forName("com.mysql.jdbc.driver");
     conn=DriverManager.getConnection("jdbc:mysql://localhost/stud","root","root")//database  name as stud
       return conn;
   }catch(SQLException e){
       e.printstackTrace();
     }
   }
   }
  
