package Basicprogram;

import java.util.Scanner;

public class inttocharconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the character:");
    char c=s.next().charAt(0);
    System.out.printf("The integer is:%d",(int)c);
	}

}
