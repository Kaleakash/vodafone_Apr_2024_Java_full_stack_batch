package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemo
 */
@WebServlet("/SessionDemo")		// SessionDemo is utl-mapping 
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SessionDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	int count=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession hs = request.getSession();
		response.setContentType("text/html");
		pw.println("Count value is "+count);
		pw.print("<br/>Session Id is "+hs.getId()); // unique session id 
		if(hs.isNew()) {
			pw.println("<br/> New Client");
		}else {
			pw.println("<br/> Old Client");
		}
		pw.println("<br/>Session Creation time in default time format "+hs.getCreationTime()); // millisecond format 
		pw.println("<br/> Session Creation time in time format "+new Date(hs.getCreationTime()));
		pw.println("<br/> Last access time for the session "+new Date(hs.getLastAccessedTime()));
		pw.println("<br/> Default session time is "+hs.getMaxInactiveInterval());  //1800
		hs.setMaxInactiveInterval(600);
		pw.println("<br/> Session Inactive interaval time is "+hs.getMaxInactiveInterval());  //600
		if(count%5==0) {
			hs.invalidate();    // destroy the session with condition 
		}
		count++;
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
