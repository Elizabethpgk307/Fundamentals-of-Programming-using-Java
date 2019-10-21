package inputoutput;
import java.util.Scanner;

public class chartoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.print("Enter the integer number:");
        int num=s.nextInt();
        System.out.printf("The Character is:%s",(char)num);
	}

}
