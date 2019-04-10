package com.fest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.festdao;
import com.dao.festdaoimpl;


@WebServlet("/event")
public class event extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public event() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String m_username=request.getParameter("Username");
		String m_password=request.getParameter("Password");
		
		festdao dao = new festdaoimpl();
		
		PrintWriter out= response.getWriter();
		
		
		if("authorized".equals(dao.authenticate(m_username, m_password))){
			out.print("authorized user");
		}
		else
		{
			out.print("not authorized");
		}
		
	}

}
