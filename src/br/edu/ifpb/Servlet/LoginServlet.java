package br.edu.ifpb.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifpb.Conexão.ConnectionFactory;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{

		String nome = request.getParameter("login");
		String senha = request.getParameter("senha");

		if(nome.equals("admin")&&senha.equals("admin"))
			response.sendRedirect("Redirecionamento.jsp");
		else
			response.sendRedirect("index.html");

	}

}
