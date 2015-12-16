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
import br.edu.ifpb.Entidades.Volume;
import br.edu.ifpb.Entidades.VolumeADV;

/**
 * Servlet implementation class CadastroServlet
 */
@WebServlet("/CadastroServlet")
public class CadastroServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		

		Volume volume = new Volume();

		VolumeADV volumedao = new VolumeADV();

		volume.setAno_public(request.getParameter("anoPublicacao"));
		volume.setAutor(request.getParameter("autores"));
		volume.setDescricao(request.getParameter("descricao"));
		volume.setEditora(request.getParameter("editora"));
		volume.setTipo(request.getParameter("tipoVolume"));
		volume.setNum_pag(request.getParameter("paginas"));
		volume.setTitulo(request.getParameter("titulo"));

		try {

			volumedao.insert(volume);
			volumedao.disconnect();

		} catch (SQLException e) {

			System.out.println("Erro de funcionamento");
		}

		response.sendRedirect("index.html");
	}

}
