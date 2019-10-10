import java.util.*;
public class Exercicio_8_Somatorio {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int a[] = {1,2,3,4,5,6,7,8,9,10};
	int b[] = new int [10];
	int i, j, soma = 0;
	
	System.out.print("B{");
	for(j =0, i= 0; j<10; i++,j++) {
		soma = soma+a[i];
		b[j] = soma;
		System.out.print(b[j]+" ");
	}
	System.out.println("}");
}
}
