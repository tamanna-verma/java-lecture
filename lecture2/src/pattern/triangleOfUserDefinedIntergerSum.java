package pattern;
import java.util.Scanner;
public class triangleOfUserDefinedIntergerSum
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;int sum=0;
			
			while(j<=i) 
			{
				System.out.print(j);
				if((j>=1)&&(j<i)) {
					System.out.print("+");
				}
				if(j==i) {
					System.out.print("=");
				}
				sum=sum+j;
			if(j==i) {
				System.out.print(sum);}
				j++;
			}	
			System.out.println();
			i++;
		}
	}
}
