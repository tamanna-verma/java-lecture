package asssignmentModule6;
import java.util.Scanner;
public class ReverseOfNumber
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int rev=0;
	if((n>=0)&&(n<=Math.pow(10,8)))
	{while(n>0) {
	int rem=n%10;
	
			rev=rev*10+rem;
					n=n/10;}
	}System.out.print(rev);
  }
}
	
