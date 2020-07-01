package module10Programs;
import java.util.Scanner; 
public class Program92ReverseEachWord
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int n=str.length();int Start=0;
		String str2="";

		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)==' ')
			{
				for(int j=i-1;j>=Start;j--)
				{
					str2+=str.charAt(j);

				}str2+=" ";
				Start=i+1;
			}
			if(i==n-1)
			{
				for(int j=i;j>=Start;j--)
				{
					str2+=str.charAt(j);

				}
			}
		}
		System.out.print(str2);
	}
}
