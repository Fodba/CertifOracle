package fr.dawan.CertifOracle.Chapitre2;

public class CompoundAssignmentOperators {

	public static void main(String[] args) {
		int x = 2, z = 3;
		x = x * z;
		System.out.println("x=" + x);
		System.out.println();
		// équivaut à
		x = 2;
		z = 3;
		x *= z;
		System.out.println("x=" + x);
		System.out.println();

		// NE COMPILE PAS
//		int a += x; "a" n'a pas encore de valeur assignée
//		int a = a + z; on ne peut donc pas lui additionner une valeur

		long i = 10;
		int j = 5;
		// NE COMPILE PAS
//		j = j * i; car les 2 variables ne sont pas du même type (long et int)
		j *= i;
		// puisque "j" est de type int, il est casté implicitement en long
		// puis le resultat est casté en int
		// équivaut à j = (int)(j * i)

		// on assigne 5 à une variable "s" que l'on vient de créer
		long s = 5;
		// d'abord on assigne 3 à la variable "s" initialisée plus haut
		// ensuite le resultat de cette assignation (3) est assigné à
		// la variable "d" que l'on vient de créer.
		long d = (s = 3);

		System.out.println("s=" + s);
		System.out.println("d=" + d);

	}

}
