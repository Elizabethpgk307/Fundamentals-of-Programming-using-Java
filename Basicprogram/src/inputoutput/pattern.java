package Basicprogram;
import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		float num=s.nextFloat();
		System.out.printf("\n %d",(int)num);
		System.out.printf("\n %.1f",num);
		System.out.printf("\n %.2f",num);
		System.out.printf("\n %.3f",num);

	}

}
