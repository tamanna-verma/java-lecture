package module6Programs;
import java.util.Scanner;
public class Program54BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int x=0;
		int Product;
		int Sum=0;
		int rem;
		while(n>0) {
			rem=n%10;
			Product=(int)(rem*((Math.pow(2, x))));
			Sum=Sum+Product;
	x++;
	n=n/10;
		}System.out.println(Sum);
	}

}
