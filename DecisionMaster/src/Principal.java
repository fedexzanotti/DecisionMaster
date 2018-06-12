import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner s=new Scanner(System.in);
		int cant;
		System.out.println("Cantidad de elementos a sortear: ");
				cant=Integer.parseInt(s.nextLine());
		
		int [] arreglo = new int[cant];
				
		for (int i=1 ; i < arreglo.length; i++)
	    {
	        arreglo[i]=i;
	        
	    }
		
		for (int y=0; y<cant; y++)
		{
			
			System.out.println("Opción " + (arreglo[y]+1));
			
		}
		
		int array2 []= arreglo;
		
		ArrayMezclado arreglosorteo = new ArrayMezclado();
		arreglosorteo.mezclaArray(array2);
		
		
		System.out.println("Ganador : " + "Opción "+ (array2[0]+1));
		
		for (int y=1; y<cant; y++)
		{
			
			System.out.println("Opción " + (array2[y]+1));
			
		}
		
	
		
				
		s.close();
	}

}
