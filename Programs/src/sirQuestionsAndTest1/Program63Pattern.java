package sirQuestionsAndTest1;
import java.util.Scanner;
public class Program63Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			int val=1;
			for(int space=1;space<=n-i;space++) 
			{
				System.out.print(" ");	
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(val);
				val++;
			}
			
			int value=i-1;
		for(int b=1;b<=i-1;b++)
		{	
			
			System.out.print(value);
			value--;
		}
		System.out.println();
		}
		
	}

}
