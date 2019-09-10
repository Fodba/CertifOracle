package fr.dawan.CertifOracle.Chapitre2;

public class Casting {

	public static void main(String[] args) {
		short x = 10;
		short y = 3;
		// short z = x * y; (x * y) devient un int => donc plus grand qu'un short
		// short z = (short) x * y; seul x est casté en short
		short z = (short) (x * y);

		System.out.println("z = " + z);

	}

}
