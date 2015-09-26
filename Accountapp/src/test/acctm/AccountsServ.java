package test.acctm;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

public class AccountsServ extends HttpServlet {
	
public void doGet (HttpServletRequest req1,HttpServletResponse res1)throws IOException,ServletException{
doPost(req1,res1);
}
public void doPost (HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
	String nm = req.getParameter("userid");
	String pwd = req.getParameter("pwd");
	System.out.println("user name is:--->"+nm);
	System.out.println("pwd  is:--->"+pwd);
	if (nm != null && pwd != null){
		if (nm.equalsIgnoreCase("Bishnu") && pwd.equalsIgnoreCase("mama")){
		req.setAttribute("name", nm);	
		RequestDispatcher rd = req.getRequestDispatcher("/test.jsp");
		rd.forward(req,res);
		}
		else {
			processUser(req,res);
			}
	    }
	else{
	    	processUser(req,res);
	    }
}
public void processUser(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
	RequestDispatcher rd = req.getRequestDispatcher("/Login.html");
	rd.forward(req,res);
}
}
