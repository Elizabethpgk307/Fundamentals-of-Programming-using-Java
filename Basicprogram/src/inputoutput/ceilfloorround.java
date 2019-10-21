package Basicprogram;
import java.util.*;
//import java.util.Scanner;

public class ceilfloorround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		float num=s.nextFloat();
		System.out.printf("\nRounded value is:%d",Math.round(num));
		System.out.printf("\nCeil value is:%.1f",Math.ceil(num));
		System.out.printf("\nFloor value is:%.1f",Math.floor(num));
		
	}

}
 