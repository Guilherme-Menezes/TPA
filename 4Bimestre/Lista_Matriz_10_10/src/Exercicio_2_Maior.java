import java.util.*;
public class Exercicio_2_Maior {
public static void main (String[]args) {
	Random ram = new Random ();
	int lin, col, maior, menor, plinma, pcolme, pcolma, plinme;
	int m[][] = new int [3][3];
			
	for(lin = 0; lin<3; lin++) {
		for(col = 0; col<3; col++) {
			m[lin][col] = ram.nextInt(50);
		}
	}
	maior = m[0][0];
	menor = m[0][0];
	plinma = 0;
	plinme = 0;
	pcolma = 0;
	pcolme = 0;
			for(lin = 0; lin<3; lin++) {
				for(col = 1; col<3; col++) {
					if(m[lin][col]>maior) {
						maior = m[lin][col];
						plinma = lin;
						pcolma = col;
				}else if(m[lin][col]<menor) {
					menor = m[lin][col];
					plinme = lin;
					pcolme = col;
				}
			}
		}
			
		System.out.println("O maior numero é "+maior+" Na posição ["+(plinma+1)+"] ["+(pcolma+1)+"]");
		System.out.println("O maior numero é "+menor+" Na posição ["+(plinme+1)+"] ["+(plinme+1)+"]");
		for(lin = 0;lin<3; lin++) {
			for(col = 0; col<3; col++) {
				System.out.print("["+m[lin][col]+"]");
				if(col == 2) {
					System.out.print("\n");
				}
			}
		}
}
}
