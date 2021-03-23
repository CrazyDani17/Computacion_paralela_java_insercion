package secuencial;

public class Insercion {
	int arreglo[];
	int extraido;
	int i;

	public Insercion(int a[]) {//Recibir el arreglo
    	arreglo = a;
	}
	
	public void ordenar() {//Implementar el ordenameinto por inserion
		for(int j=1;j<arreglo.length;j++){
	      extraido = arreglo[j];
	      i = j - 1;
	      while(i>=0 && arreglo[i]>extraido) {
	    	  arreglo[i+1] = arreglo [i];
	    	  i = i - 1;
	    			  
	      }
	      arreglo[i+1] = extraido;
	      
	    }
	}
}
