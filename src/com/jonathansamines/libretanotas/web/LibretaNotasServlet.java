package com.jonathansamines.libretanotas.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;

import java.io.IOException;

import java.util.ArrayList;

import com.jonathansamines.libretanotas.controllers.LibretaController;

import com.jonathansamines.libretanotas.data.models.Libreta;
import com.jonathansamines.libretanotas.data.connector.SqlDataConnector;

@SuppressWarnings("serial")
public class LibretaNotasServlet extends HttpServlet {
	
	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		SqlDataConnector connector = new SqlDataConnector("127.0.0.1","root","jnsamines.2093","libretanotas");
		LibretaController controller = new LibretaController( connector );
		ArrayList<Libreta> libretas = controller.obtenerLibretasDeNotas();	
		
		request.setAttribute("libretas", libretas );
		request.getRequestDispatcher("Views/LibretaNotas.jsp").forward(request, response);
	}
	
	@Override
	protected void doGet( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		this.doPost(request, response);
	}
	
	
}
