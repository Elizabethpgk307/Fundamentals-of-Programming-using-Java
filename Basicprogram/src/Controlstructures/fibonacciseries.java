package Controlstructures;
import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);
 int num=s.nextInt();
 int a=0;
 int b=1;
 int i,c;
 System.out.printf("%d %d",a,b);
 for(i=3;i<=num;i++)
 {
	 c=a+b;
	 System.out.printf("%d\n",c);
	 a=b;
	 b=c;
 }
 
	}

}
