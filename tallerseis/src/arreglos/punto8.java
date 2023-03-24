package arreglos;

import java.util.Scanner;
public class punto8 {
	
	
	public static void main(String[] args) {
		
		double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        Scanner scanner = new Scanner(System.in);
        String option = "";
        
        while (!option.equals("F")) {
        	
        	System.out.println("menu de operaciones :");
            System.out.println("A. Ingresar Arreglo A");
            System.out.println("B. Ingresar Arreglo B");
            System.out.println("C. Mostrar A + B");
            System.out.println("D. Mostrar A - B");
            System.out.println("E. Mostar A * B");
            System.out.println("F. Salir ");
            
            System.out.println("Ingrese la opcion deseada");
            option = scanner.nextLine();
            
            switch (option) {
            case "A":
                System.out.println("Mostrar Arreglo A:");
                enterArray(scanner, a);
                break;
            case "B":
                System.out.println("Mostrar Arreglo B:");
                enterArray(scanner, b);
                break;
            case "C":
                double[][] sum = addArrays(a, b);
                System.out.println("A + B:");
                displayArray(sum);
                break;
            case "D":
                double[][] diff = subtractArrays(a, b);
                System.out.println("A - B:");
                displayArray(diff);
                break;
            case "E":
                double[][] product = multiplyArrays(a, b);
                System.out.println("A * B:");
                displayArray(product);
                break;
            case "F":
                System.out.println("salir del programa");
                break;
            default:
                System.out.println("Intentalo de nuevo ");
            
            
            }
            
        	
        }
		
		
	}
	
	 public static void enterArray(Scanner scanner, double[][] arr) {
		 for (int i = 0; i < arr.length; i++) {
			 for (int j = 0; j < arr[0].length; j++) {
			System.out.print("ingrese el valor para la posicion (" + (i+1) + "," + (j+1) + "): ");
	           arr[i][j] = scanner.nextDouble(); 
				 
				 
			 }
			 
			 
			 
		 }
		 scanner.nextLine();
		 	 
	 }
	 public static void displayArray(double[][] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[0].length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	 
	 public static double[][] addArrays(double[][] arr1, double[][] arr2) {
	        double[][] result = new double[arr1.length][arr1[0].length];
	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0; j < arr1[0].length; j++) {
	                result[i][j] = arr1[i][j] + arr2[i][j];
	            }
	        }
	        return result;
	    }
	 
	 public static double[][] subtractArrays(double[][] arr1, double[][] arr2) {
	        double[][] result = new double[arr1.length][arr1[0].length];
	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0; j < arr1[0].length; j++) {
	                result[i][j] = arr1[i][j] - arr2[i][j];
	            }
	        }
	        return result;
	    }
	  
	    public static double[][] multiplyArrays(double[][] arr1, double[][] arr2){
	    	 double[][] result = new double[arr1.length][arr1[0].length];
	    	 for (int i = 0; i < arr1.length; i++) {
	    		 for (int j = 0; j < arr1[0].length; j++) {
	    			 result[i][j] = arr1[i][j] - arr2[i][j];
	    		 }
	    	 }
	    	 return result;
	    }




	
	 
	 
	
}
	
	

	    
	   
