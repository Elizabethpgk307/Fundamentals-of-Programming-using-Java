package Controlstructures;
import java.util.Scanner;
public class checkfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int a=0;
		int b=1;
		int i,c,m=0,d;
		if(num==0 || num==1)
		{
			//System.out.print("Yes");
		}
			 for(i=0;i<=100;i++)
			 {
				 c=a+b;
				 if(num == c)
				 {
					 m++;
				 }
				
				 
				 a=b;
				 b=c;
			 }
			 if(m!=0) 
			 {
			 System.out.printf("Yes");
			 }
			 else
			 {
				 System.out.printf("No");
			 }
	  }
}