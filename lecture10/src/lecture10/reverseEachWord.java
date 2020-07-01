package lecture10;
import java.util.Scanner;
public class reverseEachWord
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int n=str.length();
		String newstr="";
		int start=0;
		for(int i=0;i<n;i++) 
		{
			if(str.charAt(i)==' ') 
			{
				for(int x=i-1;x>=start;x--)
				{
					newstr+=str.charAt(x);
				}newstr+=" ";
				start=i+1;
			}
			if(i==n-1) 
			{
				for(int x=i;x>=start;x--)
				{
					newstr+=str.charAt(x);

				}
			}
		}System.out.print(newstr);
	}

}
