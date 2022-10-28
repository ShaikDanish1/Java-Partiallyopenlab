package JavaAssignment;
import java.util.Scanner;
public class Swap2Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number = ");
		num1 = scan.nextInt();
		System.out.println("Enter the second number = ");
		num2 = scan.nextInt();
		scan.close();
		//Swappin starts here
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		 System.out.println("\nThe new 1st number is "+num1);
	        System.out.println("The new 2nd number is "+num2);
	
	}
}
		
	