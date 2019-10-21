package Dicisionmaking;
import java.util.Scanner;
public class ifstatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		int number=s.nextInt();
		if(number%2==0)
		{
			System.out.printf("Even number");
		}
		else
		{
			System.out.printf("Odd number");
		}
		
		

	}

}