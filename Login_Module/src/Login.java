
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(description = "Login to the portal", urlPatterns = { "/Login" })
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("user");
		String password=request.getParameter("passwd");
		
		if(username.equals("jay") && password.equals("jay@123"))
		{
			HttpSession session =request.getSession();
			session.setAttribute("user",username);
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
			//intWriter out=new Pri;
  			//out.print("Wrong credentials!!!")
			response.sendRedirect("login.jsp");
			//response.
		}
		
	}

	

}
