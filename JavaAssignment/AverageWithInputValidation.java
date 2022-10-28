package JavaAssignment;
import java.util.Scanner;
public class AverageWithInputValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_STUDENTS=3;

        int total=0,mark;
        double average;
        boolean isvalid=false;

        Scanner scan=new Scanner(System.in);

        for(int i=1;i<=MAX_STUDENTS;i++){
            do{
            isvalid=false;
            System.out.println("Enter the mark for student "+i);
            mark=scan.nextInt();
            if(mark>=0&&mark<=100)
            {
            isvalid=true;
            total+=mark;
            }
            else
            System.out.println("Enter a valid input");
            }while(!isvalid);
        }
        scan.close();
        average=(double)total/MAX_STUDENTS;
        System.out.printf("The average is %.2f",average);
	}

}
