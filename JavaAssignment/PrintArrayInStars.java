package JavaAssignment;
import java.util.Scanner;
public class PrintArrayInStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of items");
        Scanner scan=new Scanner(System.in);
        final int MAX_ITEM=scan.nextInt();
        int[] arr=new int[MAX_ITEM];
        System.out.println("Enter the Items of the array");
        if(MAX_ITEM>0)
        for(int i=0;i<MAX_ITEM;i++){
            arr[i]=scan.nextInt();
        }
        scan.close();
        System.out.println("\nThe elements of the arrays are ");
        for(int i=0;i<MAX_ITEM;i++){
            for(int star=1;star<=arr[i];star++){
                System.out.print("*");
            }
            System.out.print("("+arr[i]+")");
            System.out.println();
        }
	}

}
