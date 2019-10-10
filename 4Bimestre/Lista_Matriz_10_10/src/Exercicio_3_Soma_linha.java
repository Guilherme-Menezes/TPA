import java.util.*;
public class Exercicio_3_Soma_linha {
public static void main(String [] args ) {
	Scanner leia = new Scanner(System.in);
	int lin, col, sl =0;
	int m[][] = new int [3][4];
	for(lin = 0,sl=0; lin<3;lin++) {
		sl = 0;
		for(col=0;col<4; col++) {
			if(col!=3) {
				System.out.print("Entre com o valor ["+(lin+1)+"] ["+(col+1)+"]\n");
				m[lin][col] = leia.nextInt();
				sl = sl+m[lin][col];
			}else {
				
				m[lin][col] = sl;
			}
		}
	}
	for(lin = 0;lin<3; lin++) {
		for(col = 0; col<4; col++) {
			System.out.print("["+m[lin][col]+"]");
			if(col == 3) {
				System.out.print("\n");
			}
		}
	}
}
}
