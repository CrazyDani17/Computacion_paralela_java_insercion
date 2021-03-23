package secuencial2;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int TOPE = 10;
		int arr[];
		for(int n=1;n<=TOPE;n++) {
			//generar un arreglo de tamano "n"
			arr = generar(n);
			
			System.out.println("Arreglo sin ordenar:");
			
			imprimir(arr);
			
			Insercion p1 = new Insercion(arr);			
			
			p1.ordenar();
			
			System.out.println("Arreglo ordenado:");
			
			imprimir(arr);			
		}		

	}

	//Generar arreglos de peores casos
	//Ejemplo: Si n=5 0> arr={5,4,3,2,1}
	private static int[] generar(int n) {
		// TODO Auto-generated method stub
		int arr[] = new int[n];
		for(int i = n; i>0; i--) {
			arr[n-i] = i;
		}
		return arr;
	}

	private static void imprimir(int[] arr1) {
		// TODO Auto-generated method stub
	    String arreglo = "" + arr1[0];
		for(int i=1;i<arr1.length;i++){
	      arreglo = arreglo + ","  +  arr1[i];
	    }
		System.out.println("{" + arreglo + "}");
	}

}
