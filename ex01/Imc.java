package ex01;
import java.util.Scanner;


public class Imc {
	
	public void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		try {
			System.out.println("Digite a sua altura: ");
			int altura = sc1.nextInt();
			System.out.println("Digite a sua massa: ");
			float massa = sc1.nextFloat();
			
			float resultadoIMC = massa/(altura*altura);
			System.out.println("O seu IMC é: "+resultadoIMC);
		}
		finally {
			sc1.close();
		}
		
	}
	
	
	
}
