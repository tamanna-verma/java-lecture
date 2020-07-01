package module1;
import java.util.Scanner;
public class Program8LogicalOperator {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int a = scan.nextInt();
		int b=scan.nextInt();
		int c= scan.nextInt();
		Boolean isa_Largest=(a>=b)&&(a>=c);
		Boolean isb_Largest=(b>=a)||(b>=c);
		Boolean isc_Largest=(c>=a)&&(c>=b);
		System.out.println("a is largest"+isa_Largest);
		System.out.println("b is largest"+isb_Largest);
		System.out.println("c is largest"+isc_Largest);
	}

}
