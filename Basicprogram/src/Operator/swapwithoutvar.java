package Operator;
import java.util.Scanner;
public class swapwithoutvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a=s.nextInt();
		System.out.print("Enter the second number:");
		int b=s.nextInt();
		System.out.printf("Before Swaping:a=%d b=%d",a,b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("\nAfter Swaping:a=%d b=%d",a,b);
		
		

	}

}
