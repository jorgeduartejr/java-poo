package ex01;
import java.util.Scanner;
public class Notas {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int nota = 0;
		for(int i = 0;i < 3;i++) {
			nota =  nota +  scan.nextInt();
		}
		
		float media = nota / 3;
		if(media >= 9) {
			System.out.println("Conceito A");
		} else if(media >= 8) {
			System.out.println("Conceito B");
		} else if(media >= 7) {
			System.out.println("Conceito C");
		} else if(media >= 6) {
			System.out.println("Conceito D");
		
		} else {
			System.out.println("Reprovado!");
		}
		scan.close();
		}
	
}
