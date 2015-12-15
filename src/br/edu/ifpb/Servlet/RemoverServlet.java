package br.edu.ifpb.Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifpb.Entidades.Volume;
import br.edu.ifpb.Entidades.VolumeADV;

@WebServlet("/RemoverServlet.do")
public class RemoverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			
			Volume volume = new Volume();

			VolumeADV volumedao = new VolumeADV();
			
			volume.setTitulo(request.getParameter("tituloVolume"));
			volume.setTipo(request.getParameter("tipo"));
			
			try {

				volumedao.remove(volume);
				volumedao.disconnect();

			} catch (SQLException e) {

				System.out.println("Erro de funcionamento");
			}

			response.sendRedirect("index.html");
		}
		
	}

