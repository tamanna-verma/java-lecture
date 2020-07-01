package lecture10;
import java.util.Scanner;
public class RemoveCharacters 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int n=str.length();
		String newstr="";
		char c=scan.next().charAt(0);
		for(int i=0;i<n;)
		{
			if(str.charAt(i)==c) 
			{
				i++;
			}
			newstr+=str.charAt(i);i++;
		}System.out.print(newstr);
	}

}
