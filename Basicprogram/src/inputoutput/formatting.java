package inputoutput;
import java.util.Scanner;

public class formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the string:");
    String str=s.nextLine();
    System.out.print("Enter the string:");
    String str1=s.nextLine();
    System.out.print("Enter the number:");
    int number=s.nextInt();
    System.out.print("Enter the number:");
    int number1=s.nextInt();
   // System.out.print("The output is:");
    System.out.printf("%-15s %03d",str,number);
    System.out.printf("\n%-15s %03d",str1,number1);
    
	}

}
