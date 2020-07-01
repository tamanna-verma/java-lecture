package module6Programs;
import java.util.Scanner;
public class Program51SumOrProduct {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Num=scan.nextInt();
		int Choice=scan.nextInt();
		int Sum=0;
		int Product=1;
		for(int i=1;i<=Num;i++) {
		
		Sum=Sum +i;
		}		
		for(int j=1;j<=Num;j++)
		{
		Product=Product*j;
		}
		if(Choice==1) {
		System.out.println(Sum);
		}
		else if(Choice==2) {
			System.out.println(Product);
		}
		else {System.out.println("-1");}
	}
}
