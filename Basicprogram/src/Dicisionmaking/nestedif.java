package Dicisionmaking;
import java.util.Scanner;
public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Brand:");
		String brand=s.nextLine();
		System.out.print("Enter the material:");
		String material=s.nextLine();
		System.out.print("Enter the size:");
		String size=s.nextLine();
		if(brand.equals("fastrack"))
		{
			if(material.equals("lether"))
			{
				if(size.equals("medium"));
			}
			System.out.printf("Available");
		}
		else
		{
			System.out.printf("Not Available");
		}

	}

}
