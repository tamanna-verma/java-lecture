package module2;
import java.util.Scanner;
public class Program17NumberPattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i =1;
		
		while(i<=n)
		{
			int j=1;
			int value=i; 
			while(j<=i)
			{
			
			
			System.out.print(value);
			value=value+1;
			j=j+1;
					
					
			}
		System.out.println();
		i=i+1;
		
		}
	}

}
