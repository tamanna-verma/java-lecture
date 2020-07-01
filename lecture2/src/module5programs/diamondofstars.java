package module5programs;
import java.util.Scanner;
public class diamondofstars {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		while(i<=n/2 +1) {
			int space=1;
			while(space<=n/2-i+1)
			{System.out.print(" ");
			space=space+1;	
			}
			int j=1;
			while(j<=2*i-1)
			{System.out.print("*");
			j=j+1;
			}
			System.out.println();
			i=i+1;
		} 
		i =n/2+2;
		while(i<=n) {
			int space=1;
			while(space<=(i-(n/2 + 1))) {
				System.out.print(" ");
				space=space+1;
			}
			int j=1;
			while(j<=    ) { 
				System.out.print("*");
				j=j+1;

			}
		}

		System.out.println();
		i=i+1;

	}}
