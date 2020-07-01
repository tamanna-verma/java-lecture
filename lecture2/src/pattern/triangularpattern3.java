package pattern;
import java.util.Scanner;
public class triangularpattern3  {

	public static void main(String[] args) {
	
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int i=1;
			int startingnumber=1;
			while(i<=n) {
				int j=1;
				while(j<=i) {
					int val=i+j-1;
					System.out.print(startingnumber);
					
					
				
				j=j+1;
				startingnumber=startingnumber+1;
			}System.out.println();
			i=i+1;}
			

			}

	
}
