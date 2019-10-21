package Dicisionmaking;
import java.util.Scanner;
public class ifelseif1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      System.out.print("Enter the Brand name:");
      String brand=s.nextLine();
      if(brand.equals("Puma"))
      {
    	  System.out.printf("In-Stock");
      }
      else if(brand.equals("fasttrack"))
      {
    	  System.out.printf("Out of Stock");
      }
      else if(brand.equals("Nike"))
      {
    	  System.out.printf("Coming Soon");
      }
      else
      {
    	  System.out.printf("Not Available");
      }
	}

}
