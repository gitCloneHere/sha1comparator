package org.gitclonehere.hashcomparator;

import java.util.Scanner;

public class Sha1comparator {

	Scanner sc = new Scanner(System.in);
	String expectedSHA1Sum;
	String fileSHA1Sum;
	String result;
	boolean comparisonResult;

//	Constructeur par défaut
	
	public Sha1comparator() {

		System.out.println("SHA1Sum attendu");
		expectedSHA1Sum = sc.nextLine();
		System.out.println("SHA1Sum constaté");
		fileSHA1Sum = sc.nextLine();
		comparisonResult = expectedSHA1Sum.equalsIgnoreCase(fileSHA1Sum);
		if (comparisonResult == true) {
			System.out.println("les checksum sont identiques");
		} else {
			System.out.println("les checksum sont différents");
		}
	}
	
//	Constructeur avec Paramètres

	public Sha1comparator(String pExpectedSHA1Sum, String pFileSHA1Sum) {

		expectedSHA1Sum = pExpectedSHA1Sum;
		fileSHA1Sum = pFileSHA1Sum;
		comparisonResult = expectedSHA1Sum.equalsIgnoreCase(fileSHA1Sum);
		if (comparisonResult == true) {
			System.out.println("les checksum sont identiques");
			result = "CheckSum ok";
		} else {
			System.out.println("les checksum sont différents");
			result = "CheckSum failed";
		}
	}

	
//	Accesseurs
	public String getResult(){
		return result;
	}
	
//	Mutateurs
	
	public void setExpectedSHA1Sum(String pExpectedSHA1Sum){
		expectedSHA1Sum = pExpectedSHA1Sum;
	}
	
	public void setFileSHA1Sum(String pFileSHA1Sum){
		fileSHA1Sum = pFileSHA1Sum;
	}

}
