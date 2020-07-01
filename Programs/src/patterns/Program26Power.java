
package patterns;
import java.util.Scanner;
public class Program26Power {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int Product=1;
		while(m>0) {
			Product=Product*n;
		m--;
			
		}System.out.println(Product);
	}

}
