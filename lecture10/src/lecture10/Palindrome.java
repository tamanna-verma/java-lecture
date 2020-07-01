package lecture10;
import java.util.Scanner;
public class Palindrome 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		Boolean palindrome=true;
		int x=str.length();
		for(int i=0,n=x-1;i<=x/2&&n>=x/2;i++,n--) 
		{
			{
				if(str.charAt(i)==str.charAt(n))
				{
					palindrome=true;
				}
				else
				{
					palindrome=false;
				}
			}
		}System.out.println(palindrome);
	}
}