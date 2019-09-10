package fr.dawan.CertifOracle.Chapitre2.Operators;

public class RelationalOperators {

	public static void main(String[] args) {
		int x = 10, y = 20, z = 10;
		System.out.println("x < y = " + (x < y));
		System.out.println("x <= y = " + (x <= y));
		System.out.println("x >= z = " + (x >= z));
		System.out.println("x > z = " + (x > z));
		System.out.println();

		long a = 15;
		// Quand les 2 variables sont de types différents
		// le type le plus petit est automatiquement casté dans le type 
		// du plus grand
		System.out.println("a < y = " + (a > y));
		System.out.println("a <= y = " + (a <= y));
		System.out.println("a >= z = " + (a >= z));
		System.out.println("a > z = " + (a < z));
	}

}
