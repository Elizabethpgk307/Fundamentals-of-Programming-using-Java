package Dicisionmaking;

import java.util.Scanner;

public class ifelseif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Mark:");
		int Mark=s.nextInt();
		if(Mark>=90)
		{
			System.out.printf("Grade A");
		}
		else if(Mark<90 && Mark>=70)
		{
			System.out.printf("Grade B");
		}
		else if(Mark<70 && Mark>=50)
		{
			System.out.printf("Grade C");
		}
		else 
		{
			System.out.printf("Fail");
		}


	}

}
