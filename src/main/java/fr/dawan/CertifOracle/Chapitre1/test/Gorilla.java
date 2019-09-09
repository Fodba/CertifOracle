package fr.dawan.CertifOracle.Chapitre1.test;

public class Gorilla {
	public static int count;

	// Methode de classe (méthode statique)
	public static void addGorilla() {
		count++;
	}

	// Méthode d'instance
	public void babyGorilla() {
		count++;
	}

	public void announceBabies() {
		addGorilla();
		babyGorilla();

	}

	//
	public static void announceBabiesToEveryone() {
		addGorilla();
		// CETTE LIGNE NE COMPILE PAS
//		babyGorilla();
	}

	public int total;
	// CETTE LIGNE NE COMPILE PAS
//	public static double average = total / count;

}
