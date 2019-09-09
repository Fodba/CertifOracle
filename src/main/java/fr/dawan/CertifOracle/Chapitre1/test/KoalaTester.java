package fr.dawan.CertifOracle.Chapitre1.test;

public class KoalaTester {

	public static void main(String[] args) {

		// Creation d'un objet de type Koala
		Koala koala1 = new Koala();
		Koala koala2 = new Koala("Fred");
		Koala koala3 = new Koala(3);
		Koala koala4 = new Koala("Frederic", 25);

		
		// Pour accerder à une variable d'instance, je suis obligé de créer
		// un objet du type qui contient la variable d'instance (donc de type Koala).
//		System.out.println("Le nom du koala 1 est: " + koala1.nom);
//		System.out.println("Le nom du koala 1 est: " + koala1.age);
//		System.out.println();
//		System.out.println("Le nom du koala 2 est: " + koala2.nom);
//		System.out.println("Le nom du koala 2 est: " + koala2.age);
//		System.out.println();
//		System.out.println("Le nom du koala 3 est: " + koala3.nom);
//		System.out.println("Le nom du koala 3 est: " + koala3.age);
//		System.out.println();
//		System.out.println("Le nom du koala 4 est: " + koala4.nom);
//		System.out.println("Le nom du koala 4 est: " + koala4.age);
//		System.out.println();
//		System.out.println("Le nombre de koala (depuis koala2) est : " + koala2.count);
//		System.out.println("Le nombre de koala est : " + Koala.count);
		
		Koala koala5 = new Koala();
		Koala koala6 = null;

		System.out.println("Le nombre de koala (depuis koala5) est : " + koala5.count);
		System.out.println("Le nombre de koala (depuis koala5) est : " + koala6.count);
//		System.out.println("Le nombre de koala (depuis koala5) est : " + koala6.nom);
		koala6.maMethodeStatique();
		Koala.maMethodeStatique();
		
		koala5.maMethodeStatique();
		
		
		
		
		

	}

}
