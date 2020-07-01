package patterns;
import java.util.Scanner;
public class Program36Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int val=i;
			while(j<=i) {
			System.out.print(val);
		val--;
			j++;
			}
			System.out.println();
			i++;
		}
	}
}
