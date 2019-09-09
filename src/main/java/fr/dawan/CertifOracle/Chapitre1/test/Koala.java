 package fr.dawan.CertifOracle.Chapitre1.test;

public class Koala {
	

/*********************************ZONE STATIQUE***************************************/

	// Variable statique
	public static int count = 0;
	
	public static void maMethodeStatique() {
		System.out.println("Je suis une méthode statique");
		System.out.println(count);
		
		// Pour accéder à une varible d'instance 
		// depuis une méthode statique,
		// il faut créer un objet
		Koala koala1 = new Koala();
		System.out.println(koala1.nom);
		
		// La variable d'instance n'est pas 
		// accesible depuis une méthode statique
//		System.out.println(nom);
	}

	

/*********************************ZONE INSTANCE***************************************/
	// Variable d'instances.
	public String nom;
	public int age;

	public Koala() {
		super();
		this.nom = "un koala au hasard";
		this.age = 2;
		count++;
	}
	

	
	public void maMethodeDInstance() {
		System.out.println("Je suis une méthode d'instance");
		System.out.println(count);

		// Dans une méthode d'instance, 
		// On n'est pas obligé de créer un objet pour accéder 
		// variables d'instances
		System.out.println(age);
		System.out.println(nom);
		// équivaut au code de la ligne précédente.
		System.out.println(this.nom);
	}
	
	
	
/*********************************CONSTRUCTEURS***************************************/

	public Koala(String nom) {
		super();
		this.nom = nom;
		this.age = 100;
		count++;
	}
	
	

	public Koala(int age) {
		super();
		this.nom = "un koala avec un age";
		this.age = age;
		count++;
	}

	public Koala(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
		count++;
	}


/*********************************MAIN ET AUTRES**************************************/


	public static void main(String[] args) {
		System.out.println("count : " + count);
		System.out.println(args[0]);

	}

}
