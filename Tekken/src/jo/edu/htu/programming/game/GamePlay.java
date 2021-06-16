package jo.edu.htu.programming.game;

import java.util.Scanner;

public class GamePlay {

	public static void main(String[] args) {
		
		Scanner choice = new Scanner(System.in);
		
		System.out.println("Choose Your Fighter!\n1. Jin Kazama          2.Azuka Kazama");
		int num = choice.nextInt();
		choice.close();
		if(num == 1)
		{ 	JinKazama player1 = new JinKazama();
			System.out.println("\nJin pucnhes Azuka!" + "\n" + player1.getJinPunch() + " Damage!");}
		else if(num == 2)
		{	AzukaKazama player = new AzukaKazama();
			System.out.println("\nAzuka kicks Jin!" + "\n" + player.getAzukaKick()+ " Damage!");}
		else
		{System.out.println("Invalid Input...");}
		
		
	}

	
}
