package JavaAssignment;
import java.util.Scanner;
public class CircleComputationDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double radius;
	        System.out.println("Enter the radius for the circle");
	        Scanner scan=new Scanner(System.in);
	        radius=scan.nextInt();
	        double diameter = 2.0 * radius; 
	        double area = Math.PI * radius * radius; 
	        double circumference = 2.0 * Math.PI * radius;
	        scan.close();
	        System.out.printf("The Diameter of the circle is %.2f\n",diameter);
	        System.out.printf("The Area of the circle is %.2f\n",area);
	        System.out.printf("The Circumference of the circle is %.2f\n",circumference);
	}

}
