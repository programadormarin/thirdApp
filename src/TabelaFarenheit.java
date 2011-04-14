

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TabelaFarenheit
 */
public class TabelaFarenheit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		response.setContentType("text/html");
		out.println("<html><head><title>Tabela Celsius/Farenheit</title></head>");
		out.println("<body>");
		
		
		
		out.println("<table style=\"border: 1px solid #dadada; \" cellspacing=\"5\" cellpadding=\"5\" >");
		out.println("<tr style=\"background:#dadada;\" ><td>Celcius</td><td>Farenheit</td><td>Kelvin</td></tr>");
		for (int i = 0; i <= 100; i = (i+10)) {
			out.println("<tr>");
				out.println("<td>");
					out.println("" + i);
				out.println("</td>");
				out.println("<td>");
					out.println("" + (i * (9/5) + 32));
				out.println("</td>");
				out.println("<td>");
					out.println("" + (i - 273));
				out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body></html>");
	}
}
