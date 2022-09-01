package luta;

public class main {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Preety boy","Franca",31,1.75,68.9,11,2,4);
		
		l[1] = new Lutador("Savage meme","Zambia",29,1.68,57.8,14,2,3);
		
		l[2] = new Lutador("Travis isCot","Russia",34,1.65,80.9,12,3,1);
		
		l[3] = new Lutador("Osotogari nee","Austraria",28,1.93,81.5,12,4,5);
		
		l[4] = new Lutador("Narutu Uzucrack","Namimbia",26,1.94,85.6,15,3,5);
		
		l[5] = new Lutador("Maxy PennIS","Congo",24,1.95,83.5,14,5,5);
		
		
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
		
		
		

	}

}
