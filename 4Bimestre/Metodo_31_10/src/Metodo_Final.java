import java.util.Scanner; 
public class Metodo_Final {
 
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	String s;
	int r,f,v;
	r = Menu();
	switch (r) {
		case 1:
			System.out.println("Qual numero você quer saber o fatorial?");
			f = leia.nextInt();
			System.out.println("Seu Fatorial é "+Fatorial(f));
			break;
		case 2:
			System.out.println("Qual numero você quer saber a tabuada?");
			f = leia.nextInt();
			Tabuada(f);
			break;
		case  3:
			System.out.println("Você é homem ou mulher?");
			s= leia.next();
			System.out.println("Qual é a sua idade?");
			f = leia.nextInt();
			System.out.println("Vai demorar "+Aposentadoria(s,f)+" anos para se aposentar");
			break;
		case 4:
			System.out.println("Informe a base");
			f = leia.nextInt();
			System.out.println("Informe o expoente");
			v = leia.nextInt();
			System.out.println("A potencia é "+Potencia(f,v)+" ");
			break;
		case 5:
			System.out.println("Tchau :)");
			System.exit(0);
			break;
		default:
			System.out.println("Numero Invalido");
		
}
}


public static int Menu() {
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Qual você escolhe:\n1-Fatorial\n2-Tabuada\n3-Aposentadoria\n4-Potencia\n5-Sair");
	int r;
	r = leia.nextInt();
	return(r);
	
}


public static int Fatorial(int x) {
	int i = 1, nf=1, aux = 1;
	for(i =1;i<=x;i++) {
		nf = aux*i;
		aux = nf;
		
	}
	
	return(nf);
}

public static void Tabuada(int n) {
	int i;
	for(i = 0; i<=10; i++) {
		int r = n*i;
		System.out.printf(n+"X"+i+"="+r+"\n");
	}
}

public static int Aposentadoria(String s, int id) {
	int r = 1;
	if(s.equals("mulher")) {
		r = 60-id;
		
	}else if(s.equals("homem")){
		r = 65-id;
		
	}
	return(r);
}

public static int Potencia(int b, int e) {
	int i = 2, aux;
	aux = b;
	while(i<=e) {
		aux = aux*b;
		i++;
	}
	return(aux);
}



}



