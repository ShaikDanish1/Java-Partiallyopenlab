package JavaAssignment;

public class PrintDayInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int daynumber = 7;  // Set the value of "number" here! 
		  
	      // Using nested-if 
	      if (daynumber == 0) {   // Use == for comparison 
	         System.out.println( "SUNDAY"); 
	      } 
	      else if(daynumber == 1) { 
	          System.out.println("MONDAY");
	      }
	      else if (daynumber == 2 ) { 
	          System.out.println("TUESDAY");
	      }
	      else if (daynumber == 3) { 
		      System.out.println("WEDNESDAY"); 
	      } 
	      else if (daynumber == 4 ) { 
	          System.out.println("THURSDAY");
	      }    
	      else if (daynumber == 5) {
	          System.out.println("FRIDDAY");
	      }  
	      else if (daynumber == 6) { 
	          System.out.println("SATURDAY");  
	      } 
	      else { 
	    	  System.out.println("NOT A VALID DAY");
	      }

	}

}
