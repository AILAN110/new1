package com.eviac.blog.sdao;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eviac.blog.models.Client;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String name=(String)request.getParameter("name");
		String password=(String)request.getParameter("password");
		UserDao userDao=new UserDaoImpl();
		Client c=new Client();
//		System.out.println(name+password);
		c.setName(name);
		c.setPassword(password);
		try {
			if(userDao.getCount(c)!=0){
				response.sendRedirect("http://localhost:8989/RESTfulWS1/liuyan.html");
			}else{
				response.sendRedirect("http://localhost:8989/RESTfulWS1/index.jsp");
			}
		} catch (SQLException e) {
			response.sendRedirect("http://localhost:8989/RESTfulWS1/index.jsp");
		}
	}

}
