package Controlstructures;
import java.util.Scanner;

public class naturalnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int i,sum=0;
		for(i=num1;i<=num2;i++)
		{
			sum=i;
		}
		System.out.printf("The sum is:%d",sum);

	}

}
