package fr.dawan.CertifOracle.Chapitre1;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        Object obj = new Integer(3);
////        String str = (String) obj;
//        String str2 = String.valueOf(obj);
//        System.out.println(str2);
//
//        ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
//        ExceptionInInitializerError e1 = new ExceptionInInitializerError();
//        IOException e2 = new IOException();
//        NullPointerException e3 = new NullPointerException();
//        NumberFormatException e4 = new NumberFormatException();
//        
////        int n = 5/0;
//        System.out.println(5/1);

		System.out.println("Hello world!");
		try {
			if(args.length>0)
			System.out.println("Je m'appelle " + args[0]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		for (String string : args) {
			System.out.println(string);
		}

	}
}
