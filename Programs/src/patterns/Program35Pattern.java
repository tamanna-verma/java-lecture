package patterns;
import java.util.Scanner;
public class Program35Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
			System.out.print(i);
			
			j++;
			}
			System.out.println();
			i++;
		}
	}

}
