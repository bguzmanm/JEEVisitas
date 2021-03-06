package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AdminVisita;
import model.Visita;

/**
 * Servlet implementation class ControllerVisita
 */
@WebServlet("/ControllerVisita")
public class ControllerVisita extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerVisita() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		AdminVisita listaVisitas = new AdminVisita();
		
		request.setAttribute("visitas", listaVisitas.getAllVisitas());
		
		//Manejo de cookies.
		Cookie cookieNombre = new Cookie("cookieNombre", "Deyanira");
		cookieNombre.setDomain(request.getLocalName());
		//ojo que solo vive 5 segundos.
		cookieNombre.setMaxAge(5); 

		response.addCookie(cookieNombre);
		
		//manejo de sesiones.
		HttpSession sesion = request.getSession();
		sesion.setAttribute("apellido", "Silva");
		
		
		getServletContext().getRequestDispatcher("/view/index.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
