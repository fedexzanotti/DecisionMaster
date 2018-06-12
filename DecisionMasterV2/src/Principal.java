import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner s=new Scanner(System.in);
		int cant;
		System.out.println("Cantidad de elementos a sortear: ");
				cant=Integer.parseInt(s.nextLine());
		
		String [] arreglo = new String[cant];
				
		Scanner entrada=new Scanner(System.in);
		for (int i=0 ; i < arreglo.length; i++)
	    {
			System.out.println("Ingrese opción " + (i+1) +": ");
			arreglo[i]= entrada.nextLine();
			
	    }
		entrada.close();
		
		String array2 []= arreglo;
		
		ArrayMezclado arreglosorteo = new ArrayMezclado();
		arreglosorteo.mezclaArray(array2);
		
		
		System.out.println("Ganador : " + (array2[0]));
		
		for (int y=1; y<cant; y++)
		{
			
			System.out.println((y+1) +"º = " + (array2[y]));
			
		}
		
	
		
				
		s.close();
	}

}
