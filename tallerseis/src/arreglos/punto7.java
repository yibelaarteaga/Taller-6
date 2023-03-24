package arreglos;
import java.util.Scanner;

public class punto7 {

	
	

	    public static void main(String[] args) {
	        
	        // Creamos un array para guardar los resultados de las 5 pruebas
	        double[] resultados = new double[5];
	        
	        try (// Pedimos al usuario que introduzca los resultados de cada prueba
			Scanner scanner = new Scanner(System.in)) {
				for (int i = 0; i < resultados.length; i++) {
				    System.out.print("Introduce el resultado de la prueba " + (i+1) + ": ");
				    resultados[i] = scanner.nextDouble();
				}
			}
	        
	        // Calculamos el promedio de los resultados
	        double promedio = 0;
	        
	        for (int i = 0; i < resultados.length; i++) {
	            promedio += resultados[i];
	        }
	        
	        promedio /= resultados.length;
	        
	        // Mostramos el promedio al usuario
	        System.out.println("El promedio de los resultados es: " + promedio);
	    }

	}


