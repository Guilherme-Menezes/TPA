import java.util.*;
public class Exercicio_12_palíndromos {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int a[] = new int [10];
	int i, j, r= 0 ;
	for (i=0; i<10; i++) {
		System.out.println("Informe o numero que será colocado na "+(i+1)+" posição");
		a[i] = leia.nextInt();
	}
	for(i = 0, j = 9; i<10 && j>-1; i++, j--) {
		if(a[i] == a[j]) {
			r++;
		}
	}
	
	if(r>=10) {
		System.out.println("É Palindromo");
	}else {
		System.out.println("Não é Palindromo");
	}
}
}
