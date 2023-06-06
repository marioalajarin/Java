
public class Ejemplo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//si divides entre 3 me tienes que lanzar una exception personalizada.
	//crear esta excepcion personalizada ExceptionDividirEntre3
		int numero1=15;
		int numero2=3;
		try {
		int solucion=numero1/numero2;
		System.out.println(solucion);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("no puedo dividir por cero");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Algo paso, pero no sé decirte");
		}
		
		
	}

}
