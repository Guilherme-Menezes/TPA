import java.util.*;
public class Exercicio_14_C_Regras_De_Formacao {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int a[] = new int [10];
	int b[] = new int [10];
	int c[] = new int [10];
	int i;
	
	for(i= 0; i<10; i++) {
		System.out.println("Insira o "+(i+1)+" numero do vetor A");
		a[i] = leia.nextInt();
		System.out.println("Insira o "+(i+1)+" numero do vetor B");
		b[i] = leia.nextInt();
		System.out.println("/////////////////");
		
		if(a[i]>b[i]) {
			c[i] = 1;
		}else if(a[i]==b[i]) {
			c[i] = 0;
		}else {
			c[i] = -1;
		}
	}
	
	System.out.print("C=[");
	for(i = 0; i<10; i++) {
		System.out.printf(" %d",c[i]);
	}
	System.out.println(" ]");
}
}
