import java.util.*;
public class Exercicio_2 {
public static void main (String[]args) {
	Scanner leia = new Scanner (System.in);
	double v;
	double f;
	
	System.out.println("Quanto voc� gastou");
	v = leia.nextDouble();
	switch(Menu()){
		case 1:
			System.out.println("O valor ser� "+Dezporcento(v)+" reais");
			break;
		case 2:
			System.out.println("O valor total ser� "+v+" reais e cada parcela ser� de "+Duasvezes(v)+" reais");
			break;
		case 3:
			System.out.printf("O valor total ao fim das parcelas ser� %.2f reais",TresateDez(v));
			break;
	}
}



public static int Menu() {
		Scanner leia = new Scanner (System.in);
		int r;
		System.out.println("Forma de pagamento\n"
				+ "1-A vista com 10% de desconto\n"
				+ "2-Em duas vezes(pre�o da etiqueta)\n"
				+ "3-Parcelado de 3 at� 10 vezes");
		r = leia.nextInt();
		return r;
	}


public static double Dezporcento(double v) {
	    double r = v-((v*10)/100);
	    return r;
 }


public static double Duasvezes(double v) {
	double r;
	r = v/2;
	return r;
}

public static double TresateDez(double v) {
	Scanner leia = new Scanner (System.in);
	int parcela;
	double r, soma;
	soma = v;
	if(v<=100) {
		System.out.println("N�o � possivel pois seu valor � menor ou igual a 100");
		main(null);
	}else {
		System.out.println("Quantas parcelas voc� deseja?");
		parcela = leia.nextInt();
		if(parcela<3 || parcela >10) {
			System.out.println("numero de parcela invalido");
			main(null);
		}else {
			for(int i = 1; i<=parcela; i++) {
				r = (soma*3)/100;
				soma = soma+r;
				
			}
			
		}
	}
	return soma;
}
}


