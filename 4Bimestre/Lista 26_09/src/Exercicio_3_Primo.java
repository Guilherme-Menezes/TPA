import java.util.*;
public class Exercicio_3_Primo {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int i,r, p =0, j, a[] = new int [10];
	for (i = 0; i<10; i++ ) {
		System.out.println("Coloque o numero");
		a[i] = leia.nextInt();
		for(j=1, p=0; j<a[i];j++) {
			r = a[i]%j;
			
			if (r==0) {
				p++;
			}
			
			}
		
		if(p<=2) {
			System.out.println("Seu numero � Primo");
		}else {
			
			System.out.println("Seu numero n�o � Primo");
		}
	}
	
}
}
