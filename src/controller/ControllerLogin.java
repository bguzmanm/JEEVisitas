package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ControllerLogin
 */
@WebServlet("/ControllerLogin")
public class ControllerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/view/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String d_usr = "brian";
		String d_pdw = "kupita";
		
		if (d_usr.equals(request.getParameter("usr")) &&  d_pdw.equals(request.getParameter("pwd"))) {
			System.out.println("Usuario autenticado... creando sesión");
			//creamos la sesión 
			HttpSession sesion = request.getSession(true);
			//agregamos un atributo a la sesión, q se llama usr.
			sesion.setAttribute("usr", request.getParameter("usr"));
			
			getServletContext().getRequestDispatcher("/ControllerVisita").forward(request, response);
		} else {
			System.out.println("Usuario no existe: usr:" +  request.getParameter("usr") + " pwd: " + request.getParameter("pwd"));
			getServletContext().getRequestDispatcher("/view/login.jsp").forward(request, response);
		}
			
	}

}
