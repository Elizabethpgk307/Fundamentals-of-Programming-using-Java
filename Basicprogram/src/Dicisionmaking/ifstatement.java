package Dicisionmaking;
import java.util.Scanner;

public class ifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter the first number:");
		int a=s.nextInt();
		System.out.println("\nEnter the second number:");
		int b=s.nextInt();
		if(a>b)
		{
			System.out.printf("A is Greater:%d",a);
		}
		else
		{
			System.out.printf("B is Greater:%d",b);
		}
	}

}
