package JavaAssignment;

public class ExtractDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=276394,n=0;
        String revnum="";
        while(num>0){
            n=num%10;
            revnum=revnum+" "+n;
            num=num/10;
        }
        System.out.println("The reverse digits goes like "+revnum);

	}

}
