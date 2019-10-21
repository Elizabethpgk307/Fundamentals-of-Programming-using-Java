package Operator;
import java.util.Scanner;

public class swapwithtemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a=s.nextInt();
		System.out.print("\nEnter the second number:");
        
        int b=s.nextInt();
        int temp;
        
        System.out.printf("Before Swapping:");
        System.out.printf("\na=%d",a);
        System.out.printf("\nb=%d",b);
        temp=a;
        a=b;
        b=temp;
        System.out.printf("\nAfter Swapping:");
        System.out.printf("\na=%d",a);
        System.out.printf("\nb=%d",b);
        
        
	}

}

