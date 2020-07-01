package module2;
import java.util.Scanner;
public class Program10EvenOdd {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%2==0) {
			System.out.println("NUMBER IS EVEN");
			return;
		}
		
		System.out.println("NUMBER IS ODD");
		

	}

}
