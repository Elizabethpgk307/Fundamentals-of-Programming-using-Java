package Controlstructures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class armstrong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number:");
		int num=Integer.parseInt(br.readLine());
		int arm=0,r;
		int n=num;
		while(num>0)
		{
			r=num%10;
			arm=(r*r*r)+arm;
			num=num/10;
		}
       //System.out.printf(arm);
		if(arm == n)
		{
			System.out.printf("It is Armstrong Number");
		}
		else
		{
			System.out.printf("Not Armstrong number");
		}
	}

}
