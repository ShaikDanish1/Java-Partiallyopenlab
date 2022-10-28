package JavaAssignment;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;          
	      double average;      
	      final float LOWERBOUND = 1; 
	      final float UPPERBOUND = 100; 
	 
	     
	      for (float number = LOWERBOUND; number <= UPPERBOUND; ++number) 
	{
	         sum += number;     // same as "sum = sum + number" 
	      } 
	System.out.println("The sum is 1 to 100 is : " + sum);
	average = (sum/UPPERBOUND);
	System.out.println("The average is : " + average);
	} 
	} 
	