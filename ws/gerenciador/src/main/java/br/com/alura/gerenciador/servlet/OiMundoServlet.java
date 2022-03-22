package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//oi
@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws IOException {
		PrintWriter out =  arg1.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("oi, mundo, parabens voce escreveu o primeiro servlets.");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("o servlet oiMundosevlet foi chamado");
	}
	
}
