import java.util.*;
public class Exemplo_Matriz_Random {
public static void main (String[] args) {
	Random ram = new Random(1);
	int lin, col;
	int m[][] = new int [3][3];
	for(lin = 0;lin<3; lin++) {
		for(col = 0; col<3; col++) {
			m[lin][col] = ram.nextInt(10);
		}
	}
	
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
