package com.empresa.crossfit;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcularServlet
 */
@WebServlet("/CalcularServlet")
public class CalcularServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcularServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("form.jsp");
                dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
                
                
                
                //Nombre
		String nombre=request.getParameter("nombre");
                request.setAttribute("nombre", nombre);
                
                //Plan entrenamiento
                String plan_entrenamiento=request.getParameter("planes-trabajo");
                float precio_plan_entrenamiento_sin_decimales = 0f;
                if(plan_entrenamiento.equals("principiante")){
                    precio_plan_entrenamiento_sin_decimales=25f;
                    String precio_plan_entrenamiento=String.format("%.2f",precio_plan_entrenamiento_sin_decimales);
                    request.setAttribute("precio_plan_entrenamiento", precio_plan_entrenamiento);
                    request.setAttribute("plan_entrenamiento", plan_entrenamiento);
                }else if(plan_entrenamiento.equals("intermedio")){
                    precio_plan_entrenamiento_sin_decimales=30f;
                    String precio_plan_entrenamiento=String.format("%.2f",precio_plan_entrenamiento_sin_decimales);
                    request.setAttribute("plan_entrenamiento", plan_entrenamiento);
                    request.setAttribute("precio_plan_entrenamiento", precio_plan_entrenamiento);
                }else if(plan_entrenamiento.equals("elite")){
                    precio_plan_entrenamiento_sin_decimales=35f;
                    String precio_plan_entrenamiento=String.format("%.2f",precio_plan_entrenamiento_sin_decimales);
                    request.setAttribute("plan_entrenamiento", plan_entrenamiento);
                    request.setAttribute("precio_plan_entrenamiento", precio_plan_entrenamiento);
                }
                
                
                //Clases privadas
		float clases_privadas_sin_decimales=Float.parseFloat(request.getParameter("clases-privadas"));
                clases_privadas_sin_decimales=clases_privadas_sin_decimales*9.5f;
                String clases_privadas_decimales=String.format("%.2f",clases_privadas_sin_decimales);
                request.setAttribute("clases_privadas", clases_privadas_decimales);
                
                //Competiciones
                String competiciones_si_no=request.getParameter("competiciones");
                float precio_competiciones_sin_decimales=0;
                if(competiciones_si_no.equals("si")){
                    precio_competiciones_sin_decimales=22f;
                    String precio_competiciones=String.format("%.2f",precio_competiciones_sin_decimales);
                    request.setAttribute("precio_competiciones", precio_competiciones);
                }else{
                    precio_competiciones_sin_decimales=0f;
                    String precio_competiciones=String.format("%.2f",precio_competiciones_sin_decimales);
                    request.setAttribute("precio_competiciones", precio_competiciones);
                }
                
                
                //Categoría por peso
                String categoria_peso=request.getParameter("categoria_peso");
                switch (categoria_peso) {
                    case "no_competir":
                        request.setAttribute("competir_si_no", "No puede competir");
                        break;
                    case "flyweight":
                        request.setAttribute("competir_si_no", "Peso pluma");
                        break;
                    case "lightweight":
                        request.setAttribute("competir_si_no", "Peso ligero");
                        break;
                    case "light_middleweight":
                        request.setAttribute("competir_si_no", "Peso medio-ligero");
                        break;
                    case "middleweigth":
                        request.setAttribute("competir_si_no", "Peso medio");
                        break;
                    case "light_heavyweight":
                        request.setAttribute("competir_si_no", "Peso pesado-ligero");
                        break;
                    case "heavyweight":
                        request.setAttribute("competir_si_no", "Peso pesado");
                        break;
                    default:
                        break;
                }
                
                //Sumar total
		float total_clases_semanal=precio_plan_entrenamiento_sin_decimales+clases_privadas_sin_decimales+precio_competiciones_sin_decimales;
                String total_clases_semanal_decimales=String.format("%.2f",total_clases_semanal);
                request.setAttribute("total_clases_semanal_decimales", total_clases_semanal_decimales);

		RequestDispatcher dispatcher = request.getRequestDispatcher("ver_resultados.jsp");
                dispatcher.forward(request, response);
                
                
		
	}

}
