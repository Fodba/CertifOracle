package fr.dawan.CertifOracle.Chapitre2;

public class IncrementationDecrementation {

	public static void main(String[] args) {
		// POST INCREMENT

		System.out.println("POST INCREMENT");
		int counter = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("tour " + i + ": " + counter++);// L'incrémentation se fait après avoir utilisé la
																// variable
		}
		System.out.println("hors-boucle : " + counter);
		System.out.println();

		// PRE INCREMENT
		System.out.println("PRE INCREMENT");
		int counter2 = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("tour " + i + ": " + ++counter2);// L'incrémentation se fait avant l'utilsation de la
																// variable
		}
		System.out.println("hors-boucle : " + counter2);
		System.out.println();

		// UTILISATION DES POST ET PRE INCREMENT DANS LES CALCULS
		System.out.println("CALCULS");
		int x = 3;
		int a = ++x * 5;
		int z = a / x--;
		int y = z + --x;
		//equivaut à 
		int X = 3;
		int Y = ++X * 5 / X-- + --X;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("a = " + a);
		System.out.println("X = " + X);
		System.out.println("Y = " + Y);
		System.out.println();

	}

}
