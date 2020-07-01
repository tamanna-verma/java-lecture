package patterns;
import java.util.Scanner;
public class Program28Pattern {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) 
		{
			char ch=(char)(65+i-1);
			for(int j=1;j<=n;j++) {
				System.out.print(ch);
				ch++;
			}
System.out.println();

		}	
	}

}
