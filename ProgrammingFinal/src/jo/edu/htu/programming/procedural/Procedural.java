package jo.edu.htu.programming.procedural;


import java.util.Scanner;

public class Procedural {

	public static void main(String[] args) {
		
		/*this program is inspired by a web site known as "Spend Bill Gates' Money" where you are given his net worth
		money and you spend it on different items like cars, private jets, building and villas...etc
		i decided that i want to do the same concept but with Jeff Bezos' net worth, 
		the CEO of Amazon and the head of capitalism itself and because i do not condone	capitalism */
		
		double n = 190.0;
		double num;
		int userchoice;
		Scanner choice = new Scanner(System.in);
		
		System.out.println("Imagine that you are Jeff Bezos\nYour networth is 190 Billion USD\nYou are given options on what you would like to \nSpend your money on with only one try...."
				+ "spend it wisley ;)\nThe amount of money left at the end\n");
		

		System.out.println("1)Buy a Mansion in Miami...30 Mil USD\n2)Buy a private jet...1.2 Mil USD\n3)Buy everything on Amazon...12.8 Bil USD\n"
				+ "4)End World Hunger...112 Bil USD\n5)Stabalize the economy of Jordan...44.5 Bil USD");
				userchoice = choice.nextInt();
				choice.close();
				
					switch(userchoice) {
					case 1:
						num = buysMansion(n);
						System.out.println("\nYou have " + num + " bil USD left\nCool mansion B)");
						break;
					case 2:
						num = buysJet(n);
						System.out.println("\nYou have " + num + " bil USD left\nSo...where are you traveling?");
						break;
						
					case 3:
						num = buysAllAmazon(n);
						System.out.println("\nYou have " + num + " bil USD left\nJeff Bezos personally thanks you");
						break;
						
					case 4:
						num = endsWorldHunger(n);
						System.out.println("\nYou have " + num + " bil USD left\nChank you for ending world hunger :)");
						break;
						
					case 5:
						num = stabalizesEconomy(n);
						System.out.println("\nYou have " + num + " bil USD left\nCongrats you have saved the economy of Jordan!");
						break;
						
						default:
						System.out.println("\nInvalid Input");	}	
		
	}
	
	//outside of the main there are functions
	
		public static double buysMansion(double net)
		{	return net - 30;	}
	
		public static double buysJet(double net)
		{	return net - 1.2;	}
		
		public static double buysAllAmazon(double net)
		{	return net - 12.8;	}
		
		public static double endsWorldHunger(double net)
		{	return net - 112;	}
		
		public static double stabalizesEconomy(double net)
		{	return net - 44.5;	}
	
	
}
