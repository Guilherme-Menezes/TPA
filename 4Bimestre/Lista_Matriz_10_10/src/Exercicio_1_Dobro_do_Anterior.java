import java.util.*;
public class Exercicio_1_Dobro_do_Anterior {
public static void main(String [] args) {
	int lin, col,soma = 1;
	int m[][] = new int [4][4]; 
	for(lin = 0; lin<4;lin++) {
		for(col = 0; col<4; col++) {
		
				soma = soma*2;
				m[lin][col] = soma;
			
			
		}
	}
	for(lin = 0;lin<4; lin++) {
		for(col = 0; col<4; col++) {
			System.out.print("["+m[lin][col]+"]");
			if(col == 2) {
				System.out.print("\n");
			}
		}
	
	}
}
}