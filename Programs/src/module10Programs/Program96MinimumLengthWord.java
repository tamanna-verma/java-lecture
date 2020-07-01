package module10Programs;
import java.util.Scanner;
public class Program96MinimumLengthWord {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int n=str.length();
		int si=0;int ei=0;
		int minstartindex=0;
		int minlength=n;
		while(ei<=n)//si=start index of string aur ei is the end index of the string
		{
			if(ei<n&&str.charAt(ei)!=' ')
			{
				ei++;
			}else {
				int currentlength=ei-si;

				if(currentlength<minlength)
				{
					minlength=currentlength;
					minstartindex=si;

				}ei++;
				si=ei;

			}
		}
		System.out.print(str.substring(minstartindex, minstartindex+minlength));
	}
}
