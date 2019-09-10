package fr.dawan.CertifOracle.Chapitre2.Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		boolean x = false, y = false;
		boolean i = true, j = true;
		boolean k = true, l = false;
		boolean a = false, b = true;

		// OPERATEUR "AND"
		System.out.println("OPERATEUR AND");
		boolean andOperatorXY = x && y;
		boolean andOperatorIJ = i && j;
		boolean andOperatorKL = k && l;
		boolean andOperatorAB = a && b;
		System.out.println("andOperatorXY = " + andOperatorXY);
		System.out.println("andOperatorIJ = " + andOperatorIJ);
		System.out.println("andOperatorKL = " + andOperatorKL);
		System.out.println("andOperatorAB = " + andOperatorAB);
		System.out.println();

		// OPERATEUR "OR"
		System.out.println("OPERATEUR OR INCLUSIF");
		boolean inclusiveOrXY = x || y;
		boolean inclusiveOrIJ = i || j;
		boolean inclusiveOrKL = k || l;
		boolean inclusiveOrAB = a || b;
		System.out.println("inclusiveOrXY = " + inclusiveOrXY);
		System.out.println("inclusiveOrIJ = " + inclusiveOrIJ);
		System.out.println("inclusiveOrKL = " + inclusiveOrKL);
		System.out.println("inclusiveOrAB = " + inclusiveOrAB);
		System.out.println();

		// OPERATEUR "OR"
		System.out.println("OPERATEUR OR EXCLUSIF");
		boolean exclusiveOrXY = x ^ y;
		boolean exclusiveOrIJ = i ^ j;
		boolean exclusiveOrKL = k ^ l;
		boolean exclusiveOrAB = a ^ b;
		System.out.println("exclusiveOrXY = " + exclusiveOrXY);
		System.out.println("exclusiveOrIJ = " + exclusiveOrIJ);
		System.out.println("exclusiveOrKL = " + exclusiveOrKL);
		System.out.println("exclusiveOrAB = " + exclusiveOrAB);
		System.out.println();

		int variable = 7;
		// la partie droite du || n'est jamais évaluée
		// car la partie gauche vaut true et puisqu'il suffit que l'une des
		// deux expressions soit true pour que l'ensemble soit true 
		boolean evaluation = true || (variable < 4);
		
		
		int nombre = 6;
		boolean nombre2 = (nombre >= 6) || (++nombre <= 7);
		System.out.println(nombre); // nombre = 6 car la partie gauche n'est
		// jamais évaluée. L'incrémentation ne se fait donc pas. 
	}

}
