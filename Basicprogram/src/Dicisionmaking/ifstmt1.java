package Dicisionmaking;
import java.util.Scanner;

public class ifstmt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.print("Enter the Alphabet:");
     char alphabet=s.next().charAt(0);
     if(alphabet=='a')
     {
    	 System.out.printf("It is correct");
     }
	}

}
