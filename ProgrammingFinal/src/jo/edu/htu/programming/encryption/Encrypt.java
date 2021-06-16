package jo.edu.htu.programming.encryption;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		
		int userKey;
		String userStr;
		Scanner myScanner = new Scanner(System.in);
		Scanner numScanner = new Scanner(System.in);
		System.out.println("First...choose a key (a number from 1-10)"); //Ill let the user test out different keys
		userKey=numScanner.nextInt();
		System.out.println("Enter a cool sentence to Encrypt!");
		userStr=myScanner.nextLine();
		myScanner.close();
		numScanner.close();
		
		
		char [] userChar = userStr.toCharArray();
		
		for(int i=0; i<userChar.length; i++)	//Encryption
		{	userChar[i] += userKey;
		System.out.print(userChar[i]); }
		
		System.out.println("\n\nNow lets Decipher that back to original...");
		
		for(int i=0; i<userChar.length; i++)	//Decipher
		{	userChar[i] -= userKey;
		System.out.print(userChar[i]); }
		
	}

}
