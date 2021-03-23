package secuencial;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {3,5,6,2,1,7,0,11,22,34};
		
		System.out.println("Arreglo sin ordenar:");
		
		imprimir(arr1);
		
		Insercion p1 = new Insercion(arr1);
		
		p1.ordenar();
		
		System.out.println("Arreglo ordenado:");
		
		imprimir(arr1);

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
