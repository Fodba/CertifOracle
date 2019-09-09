package fr.dawan.CertifOracle.Chapitre1.test;

public class Egg {

//	{System.out.println(number);}
	
	// 7
	public Egg() {
		number = 5;
	}

//	{System.out.println(number);}
	
	// 1
	public static void main(String[] args) {
		// 2
		Egg egg = new Egg();
		// 8
		System.out.println(egg.number);
	}

//	{System.out.println(number);}
	
	// 3
	private int number = 3;

	// 4
	{System.out.println(number);}
	
	// 5
	{ number = 4; }

	// 6
	{System.out.println(number);}

}
