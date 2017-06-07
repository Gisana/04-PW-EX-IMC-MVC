package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(value = "/mvc/imc")
public class CalculoIMCController extends HttpServlet {

	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//Prepara para a execu��o.
		String alturaStr = request.getParameter("altura");
		alturaStr = alturaStr == null ? "0" : alturaStr;
		float altura = Float.parseFloat(alturaStr);
		
		String pesoStr = request.getParameter("peso");
		pesoStr = pesoStr == null ? "0" : pesoStr;
		float peso = Float.parseFloat(pesoStr);
		
		
		//Executa "regras de neg�cio".
		CalculoIMCModel calculoIMCModel = new CalculoIMCModel(altura, peso);
		String resultado = calculoIMCModel.resultado();
		
		//Passa a v�ri�vel para a p�gina JSP.
		request.setAttribute("resultado", resultado);
		//Chama p�gina JSP.
		request.getRequestDispatcher("imc-view.jsp").
			forward(request, response);

	}
	
}
