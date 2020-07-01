package pattern;
import java.util.Scanner;
public class NewPatternSIR {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();

		int i=1;
		int j=1;
		int ans=1;

		while(i<=n) 
		{

			int val=1;
			while(val<=j) {
				System.out.print(ans);
				ans=ans+1; 
				if(ans==10) {
					ans=1;
				}

				val=val+1;
			}

			j=j*2;
		
		System.out.println();
		i=i+1;}
	}

}