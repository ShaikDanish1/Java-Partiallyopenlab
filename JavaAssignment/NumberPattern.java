package JavaAssignment;
import java.util.Scanner;
public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
        System.out.println("Enter the size of the pattern");
        Scanner scan=new Scanner(System.in);
        size=scan.nextInt();
        scan.close();
        for(int row=1;row<=size;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
	}

}
