package module10Programs;
import java.util.Scanner;
public class Program84ReverseStringWordWise 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int n=str.length();
		String str1="";
		for(int i=n-1;i>=0;i--)
		{
			str1+=str.charAt(i);
		}
		int start=0;
		for( int i=0;i<n;i++)
		{
			if(str1.charAt(i)==' ') 
			{
				for(int j=i-1;j>=start;j--) 
				{
				  System.out.print(str1.charAt(j));
				  
				}start=i+1;
				System.out.print(" ");
			}
			if(i==n-1) {
				for(int j=i;j>=start;j--) 
				{
				  System.out.print(str1.charAt(j));
				}System.out.print(" ");
				}
		}
	}

}
