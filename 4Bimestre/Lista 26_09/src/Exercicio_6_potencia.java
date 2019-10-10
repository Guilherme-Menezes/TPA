import java.util.*;
public class Exercicio_6_potencia {
public static void main ( String [] args ) {
	Scanner leia = new Scanner (System.in);
	int i, j, aux, a[] = new int [11];
	for (i=0; i<11; i++) {
	
		a[i] = 2;
		for(j=0; j<i;j++ ) {
            a[i] = a[i]*2;
		}
		System.out.println("a["+(i+1)+"] = "+a[i]);
	}
}
}


