import java.util.*;
public class Exemplo_Matriz_Dobro {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int m[][] =  new int [3][3];
	int lin, col;
	
	for(lin=0; lin<3; lin++) {
		for(col=0; col<3; col++) {
			System.out.print("Entre com o valor ["+(lin+1)+"] ["+(col+1)+"]\n");
			m[lin][col] = leia.nextInt();
		}
	}
	for(lin=0; lin<3; lin++) {
		for(col=0; col<3; col++) {
			System.out.print("["+m[lin][col]+"]");
			if(col == 2) {
				System.out.print("\n");
			}
		}
		
		}
}
}
