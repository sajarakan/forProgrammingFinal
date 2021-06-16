package jo.edu.htu.programming.calculator;

public final class GpaCalc extends StudentInfo{

	
	private double[] studentArr;  	//for the marks
	private double sumArr;			//to find sum to use for average
	private double stuAvg;			//to find average and convert it to gpa (out of 4.0)
	private int courses;			//for number of courses to find average
	

	public GpaCalc(String n) {
		super(n);
		this.studentArr = new double [10];
		this.sumArr = 0;
		this.stuAvg = 0;
		this.courses = 0;
	}

	public void setStudentArr(double[] studentArr) {
		this.studentArr = studentArr;
	}

	public double getSum(double[] marks) {
		this.studentArr = marks;
		double sum = 0;
		for(int s=0; s<studentArr.length; s++)
			{	sum = sum + studentArr[s]; }
			return sum; }

	public double getAvg(double[] marks, double sum, int num) {
		this.sumArr = sum;
		this.studentArr = marks;
		this.courses = num;
		return this.sumArr/this.courses;
	}
	
	public double getGpa(double  avg) {
		this.stuAvg = avg;
		return (stuAvg/100)*4;
	}
	
	
	
}
