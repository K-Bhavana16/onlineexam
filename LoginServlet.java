/*import statements*/
import java.io.*;
import java.servlet.http.*;
import java.sql.*;
public class LoginServlet{
  protected void doGet(HttpServletRequest request,HttpServletResponse response)thows IOException,SQLException){
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    String name=request.getParameter("name");
    String password=request.getParameter("passwrd");
    Boolean flag=false;
    DBConnection dbc=new DBConnection();
    Connection conn=dbc.dbconnection();
    try{
      PreparedStatement pstmt=prepareStatement("select * from login");//database
      ResultSet rs=pstmt.executeQuery();
      while(rs.next()){
        if(rs.getString(1).equals(name)){
          if(rs.getString(2).equals(password)){
          flag=true;  
          
        
  }
}
        if(flag){
          out.print("<p>Valid</p>");
        }
        else{
            out.print("<p>Valid</p>");
        }
      }
        protected void doGet(HttpServletRequest request,HttpServletResponse response)thows IOException,SQLException){
          //default statements
        }
    }
        
