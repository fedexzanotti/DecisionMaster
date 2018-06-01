import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner s=new Scanner(System.in);
		int op;
		System.out.println("1- Español / 2- English: ");
				op=Integer.parseInt(s.nextLine());
		
				
		if (op == 1){		
		SaludoEsp sal = new SaludoEsp();
		System.out.println(sal.saludo);
		};
						
		if (op == 2){
		SaludoEng sal = new SaludoEng();
		System.out.println(sal.saludo);
		};
		
		
			
		s.close();

	}

}
