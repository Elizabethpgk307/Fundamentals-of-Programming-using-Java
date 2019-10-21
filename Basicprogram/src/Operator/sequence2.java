package Operator;
import java.util.Scanner;

public class sequence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int a=num%10;
		int b=a*a;
		int c=num/100;
		int d=c*a;
		int m=b*d;
		System.out.printf("%d%d",b,d);
		System.out.printf("\n%d",m);

	}

}
