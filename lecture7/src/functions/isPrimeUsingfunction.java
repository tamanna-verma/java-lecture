package functions;
import java.util.Scanner;

public class isPrimeUsingfunction {
	public static boolean isPrime(int n){
		int divisor=2;
		while(divisor<n) {
			if(n%divisor==0) {
				return false;
			}
			divisor++;
		}return true;
		}
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
boolean ans=isPrime(13);
System.out.println(ans);

	}

}
