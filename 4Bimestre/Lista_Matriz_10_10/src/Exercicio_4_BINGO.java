import java.util.*;
public class Exercicio_4_BINGO {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	Random ram = new Random();
	int lin, col, t =0, r, p = 0, n = 16;
	int m[][] = new int [4][4];
	for(lin = 0; lin<4; lin++) {
		for(col=0; col<4; col++) {
			m[lin][col] = ram.nextInt(75)+1;
		}
	}
	
	
	do {
		System.out.println("Entre o numero");
		r =leia.nextInt();
		t++;
		for(lin = 0; lin<4; lin++) {
			for(col=0; col<4; col++) {
				if(r == m[lin][col]) {
					p++;
					n--;
					System.out.println("Você conseguiu um numero, falta "+n+" numeros");
				}
			}
		}
	}while(p != 16);
	
	System.out.println("BINGO, Você precisou de "+t+" tentativas");
	for(lin = 0;lin<4; lin++) {
		for(col = 0; col<4; col++) {
			System.out.print("["+m[lin][col]+"]");
			if(col == 3) {
				System.out.print("\n");
			}
		}
	}
}
}

