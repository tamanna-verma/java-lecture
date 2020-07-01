package module10Programs;
import java.util.Scanner;
public class Program81CountWords {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		String str=scan.nextLine();
		int n=str.length();
		int count=0;
		for(int i=0;i<n;i++) 
		{
			if(str.charAt(i)==' ')
			{
				count =count+1;
			}
		}
System.out.print(count+1);
	}

}
