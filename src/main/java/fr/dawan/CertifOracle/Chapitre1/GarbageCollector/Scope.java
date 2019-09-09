package fr.dawan.CertifOracle.Chapitre1.GarbageCollector;

public class Scope {

	public static void main(String[] args) {
		String one, two;
		one = new String("a");
		two = new String("b");

		System.out.println("one: " + one);
		System.out.println("two: " + two);
		System.out.println();
		
		
		one = two;

		System.out.println("one: " + one);
		System.out.println("two: " + two);
		System.out.println();
		
		String three = one;

		System.out.println("one: " + one);
		System.out.println("two: " + two);
		System.out.println("three: " + three);
		System.out.println();
		
		
		one = null;


		System.out.println("one: " + one);
		System.out.println("two: " + two);
		System.out.println("three: " + three);
	}

}
