import java.util.*;
public class Exercicio_4_Pares_ate_0 {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int a[] = new int [10];
	int i, t;
	for (i = 0; i<10; i++ ) {
		System.out.println("Coloque o numero");
		a[i] = leia.nextInt();
		System.out.printf("%d = {",a[i]);
		for(t=0;t<=a[i]; t= t+2) {
			System.out.printf("%d ",t);
		}
		System.out.printf("}\n");
	}
}
}
