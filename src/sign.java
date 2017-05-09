

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class sign extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out=response.getWriter();
		String s=request.getParameter("name");
		String p=request.getParameter("pass");
		String a=request.getParameter("age");
		String m=request.getParameter("mobile");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c;
			c = DriverManager.getConnection("jdbc:mysql://jhospital.000webhostapp.com//id1381900_hospital_db","id1381900_cloud_proj","placement123");
		

	//st.executeUpdate("create table login(name varchar2(20),pass varchar2(2000))");

		if(!s.equals(""))
		{
			if(!p.equals(""))
			{
PreparedStatement ps=c.prepareStatement("insert into signup values (?,?,?,?)");
ps.setString(1, s);
ps.setInt(3, Integer.parseInt(a));
ps.setString(2, p);
ps.setString(4, m);
ps.executeUpdate();
/*ResultSet rs=ps.executeQuery();
while(rs.next()){
	System.out.println(rs.getString(1)+" "+rs.getInt(3));
}*/
response.sendRedirect("http://localhost:4445/hos/login.jsp");
}
			else
			{
				out.println("password should not be empty");
				response.setHeader("refresh","2;http://localhost:4445/hos/signup.jsp");
				
			}
		}
		else
		{
			out.println("name should not be empty");

			response.setHeader("refresh","2;http://localhost:4445/hos/signup.jsp");
			
		}
		}
		 catch (Exception e) {
				e.printStackTrace();
			}
	}

}
