import java.util.*;
public class Exercicio_15_Crescente_Descrescentes {
public static void main (String [] args ) {
	Scanner leia = new Scanner (System.in);
	int A[] = new int [10];
	int B[] = new int [10];
	int C[] = new int [10];
	int  aux = 0, ns, i = 0, f;
	for (ns = 0; ns<5; ns++) {
		System.out.printf("Fale o %d numero\n",ns+1);
		A[ns] = leia.nextInt();
	
	}
		Arrays.sort(A);
		System.out.print("Crescente{ ");
		for(i = 0; i<5; i++) {
			B[i] = A[i];
			System.out.printf(B[i]+" ");
			
	}
		System.out.println(" }");
		System.out.print("Decrescente{ ");
		i=0;
		for(f=4; f>=0; f--) {
			C[f] = A[i];
			i++;
		
			
		}
		for(i = 0; i<5; i++) {
			System.out.print(C[i]+" ");
		}
		System.out.println(" }");
}
}
