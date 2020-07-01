package module10Programs;
import java.util.Scanner;
public class Program95CompressTheString
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		str=str+" ";
		int n=str.length();
		String str2="";str2+=str.charAt(0);
		int count=1;
		for(int i=1;i<n;i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
			{
				count=count+1;
			}if(str.charAt(i)!=str.charAt(i-1)) 
				{
					str2+=count;
					str2+=str.charAt(i);
					count=1;

				}
          }
System.out.print(str2);
	}

}
