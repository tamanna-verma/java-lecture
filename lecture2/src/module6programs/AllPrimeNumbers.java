package module6programs;
import java.util.Scanner;
public class AllPrimeNumbers 
{
	public static void main(String[] args) 
	{	
		Scanner scan=new Scanner(System.in); 
		int n=scan.nextInt();
		for(int num=2;num<=5;num++)
		{ 
			boolean isPrime = true;
			for(int divisor=2;divisor<num;divisor++)
			{
				if(num%divisor==0)   
				{
					isPrime = false;
					break;

				}
			}
			if(isPrime)
			{
				System.out.println(num);
			}
		}

	}
}
