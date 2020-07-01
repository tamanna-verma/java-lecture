package module5programs;
import java.util.Scanner;
public class invertedtriangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
	int i=1;
	while(i<=n) {
	
	int j=1;
	while (j<=n-i+1) {
	 {
	System.out.print("*");

	j=j+1;
		}
	}
	System.out.println();
	i=i+1;}

	}
}
