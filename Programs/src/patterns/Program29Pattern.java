package patterns;
import java.util.Scanner;

public class Program29Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
		int i=1;
		while(i<=n) {
		int j=1;
		while(j<=n) {
			
			System.out.print("*");
			j++;
			
		}
			
			System.out.println();
			i++;
		}

	}

}
