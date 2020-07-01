package module10Programs;
import java.util.Scanner;
public class Program94HighestOccuringCharacter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int n=str.length();
		int Highest=Integer.MIN_VALUE;
		int Arr[]=new int[256];char ans=' ' ;
		for(int i=0;i<n;i++) 
		{
			Arr[str.charAt(i)]=Arr[str.charAt(i)]+1;
		}
		for(int j=0;j<n;j++) {
		
			if(Arr[str.charAt(j)]>Highest)
			{
				Highest=Arr[str.charAt(j)];
				ans=str.charAt(j);
			}
		}System.out.print(ans);
	}
}
