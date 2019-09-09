package fr.dawan.CertifOracle.Chapitre1.test;

public class Chick {

	// NE COMPILE PAS
//	{ System.out.println(name); }
	
	// 3
	private String name = "Poussin";

	// 4
	{ System.out.println(name); }
	
	// 5
	{ System.out.println("Setting field"); }

	// 8
	public Chick() {
		name = "Petit poussin";
		System.out.println("Setting constructor");
	}

	// 6
	{ System.out.println(name + " 3"); }
	
	// 1
	public static void main(String[] args) {
		// 2
		Chick chick = new Chick();
		// 9
		System.out.println(chick.name);
	}

	// 7
	{ System.out.println(name + " 2"); }

}
