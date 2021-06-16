package jo.edu.htu.programming.calculator;

import java.util.Scanner;

public class TestGpa {

	public static void main(String[] args) {
	
		
	double[] stuMarks = new double[10];
	String stuName;
	int numOfCourses;
	
	Scanner name = new Scanner(System.in);
	Scanner courses = new Scanner(System.in);
	Scanner marks = new Scanner(System.in);	
	
	
	System.out.println("Please enter your name:");
	stuName = name.nextLine();
	System.out.println("How many courses did you finish this semester?");
	numOfCourses= courses.nextInt();
	System.out.println("Now, enter your marks for this semseter:");
	for(int i=0; i<numOfCourses; i++)
	{	stuMarks[i] = marks.nextDouble();}
	
	name.close();
	courses.close();
	marks.close();
	
	GpaCalc stuGpa = new GpaCalc(stuName);
	stuGpa.setStudentArr(stuMarks);
	double s = stuGpa.getSum(stuMarks);
	double a = stuGpa.getAvg(stuMarks, s, numOfCourses);
	double g = stuGpa.getGpa(a);
	
	if(g <= 4.0 && g >= 3.7)
	{System.out.println("Your GPA is " + g + " which is the equivilent to an A!");}
	
	else if(g < 3.7 && g >= 2.7 )
	{System.out.println("Your GPA is " + g + " which is the equivilent to a B!");}
	
	else if(g < 2.7 && g >= 1.7 )
	{System.out.println("Your GPA is " + g + " which is the equivilent to a C!");}
	
	else if(g < 1.7 && g >= 1.0 )
	{System.out.println("Your GPA is " + g + " which is the equivilent to a D!");}
	
	else if(g < 1.0 && g >= 0 )
	{System.out.println("Your GPA is " + g + " which is the equivilent to a F!");}
	
	else
	{System.out.println("Invalid Input");}
	
	}

}
