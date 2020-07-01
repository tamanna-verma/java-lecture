package module6Programs;
import java.util.Scanner;
public class Program50Prime {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();

		for(int i=2;i<=n;i++) {boolean isprime=true;
			for(int divisor=2;divisor<i;divisor++)
			{
				if(i%divisor==0) {
isprime=false;
			}
			}if(isprime)
				System.out.println(i);
			}
		}
	}


