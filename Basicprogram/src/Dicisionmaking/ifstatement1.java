package Dicisionmaking;
import java.util.Scanner;
public class ifstatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Fooditem:");
		String food=s.nextLine();
		if(food.equals("Biriyani"))
		{
			System.out.printf("It is Available");
		}
		else
		{
			System.out.printf("Not Available");
		}
	}

}
