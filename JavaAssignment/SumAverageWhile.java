package JavaAssignment;

public class SumAverageWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; 
        double average;
        double LOWERBOUND = 1; 
        double UPPERBOUND = 100;
        double number = LOWERBOUND;
	
	        while(number<=UPPERBOUND) { 
	           sum += number; 
		          ++number;                       
	        }   
	        System.out.println("The sum is 1 to 100 is : " + sum);
	    	average = (sum/UPPERBOUND);
	    	System.out.println("The average is : " + average);	
	}

}
