import java.util.*;
public class Exercicio_1_Par_e_Impar {
public static void main (String [] args ) {
	Scanner leia = new Scanner (System.in);
	int A[] = new int [20];
	
	int i, tp, tip, impar = 0 , par =0 , B[] = new int [20];
	
	for (i=0; i<20; i++) {
		System.out.println("Escreva o "+(i+1)+" numero");
		A[i] = leia.nextInt();
	}
		for ( i = 0; i<20; i++) {
			if (A[i] %2 == 0) {
				B[i] = A[i];
				System.out.print(B[i]+" ");
			}
	

	}
		for ( i = 0; i<20; i++) {
			if (A[i] %2 != 0) {
				B[i] = A[i];
				System.out.print(B[i]+" ");
			}
	
	}

	
}
}
