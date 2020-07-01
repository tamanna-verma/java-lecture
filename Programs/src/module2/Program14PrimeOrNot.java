package module2;
import java.util.Scanner;
public class Program14PrimeOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int divisor=2;
		while(divisor<n) {
			if(n%divisor==0) {
				System.out.println("not prime");
				return;}
			divisor++;
			}
		
		System.out.println("Prime");

	}

}
