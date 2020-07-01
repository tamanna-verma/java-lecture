package module10Programs;
import java.util.Scanner;
public class Program91RemoveConsecutiveDuplicates
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int n=str.length();
		String str2="";
		str2+=str.charAt(0);
		for(int i=1;i<n;i++) 
		{
			if(str.charAt(i-1)==str.charAt(i))
			{
				continue;
			}else 
			{
				str2+=str.charAt(i);
			}
		}
System.out.print(str2);
	}

}
