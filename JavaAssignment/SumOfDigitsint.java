package JavaAssignment;
import java.util.Scanner;
public class SumOfDigitsint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a positive integer");
        number=scan.nextInt();
        scan.close();
        int num=number;
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        System.out.println("The sum of the individual digits is "+sum);
	}

}
