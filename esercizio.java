import java.util.Scanner;

public class java_exercises {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double v1;
		int v2 = 0;
		double sum = 0;
		System.out.print("waiting for insert");
		
		do {v1 = in.nextDouble();
			System.out.println("Hai inserito: " + v1);
			if(v1 >= 0) {
		    sum += v1;
			v2++;}
			
			
			
			
		} while (v1 >= 0);
		 
		
		
		
		System.out.println("La somma dei numeri inseriti è: " + sum);
		System.out.println("La media dei numeri inseriti è: " + (sum/v2));
		
		

	}

}

