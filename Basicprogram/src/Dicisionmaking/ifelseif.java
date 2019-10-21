package Dicisionmaking;
import java.util.Scanner;
public class ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the weight:");
		int Weight=s.nextInt();
		if(Weight>=100)
		{
			System.out.printf("Over weight");
		}
		else if(Weight<100 && Weight>80)
		{
			System.out.printf("Medium weight");
		}
		else if(Weight<80 && Weight>50)
		{
			System.out.printf("Lower weight");
		}
		else 
		{
			System.out.printf("Very Lower weight");
		}

	}

}
