package patterns;
import java.util.Scanner;
public class Program27Pattern {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int i=1;
	while(i<=n) {
		int j=1;char ch=65;
		while(j<=n) {
		
		System.out.print(ch);
		ch++;
		j++;
		}
		System.out.println();
		i++;
		
	}

	}

}
