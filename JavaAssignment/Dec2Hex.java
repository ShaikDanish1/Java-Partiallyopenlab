package JavaAssignment;
import java.util.Scanner;
public class Dec2Hex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int decimal;
	        System.out.println("Enter the decimal number");
	        Scanner scan=new Scanner(System.in);
	        decimal=scan.nextInt();
	        scan.close();
	        System.out.println("The Hexadecimal equivalant is "+Integer.toHexString(decimal));
	}

}
