import java.util.Scanner;

public class Exercicio_2_Tabuada {
	public static void main (String [] args ) {
		Scanner leia = new Scanner (System.in);
		int a[] = new int [5];
		int i,j, r;
		
		for (i = 0; i<5; i++) {
			System.out.println(" ");
			a[i] = leia.nextInt();
			for (j = 0; j<=10; j++) {
				r = j*a[i];
				System.out.println(a[i]+" x "+j+" = "+r);
			}
		}
		
		}
		
}

