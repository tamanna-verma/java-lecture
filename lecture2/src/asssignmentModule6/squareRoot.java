package asssignmentModule6;
import java.util.Scanner;
public class squareRoot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
int var=0;
int square=1;
		for(int x=1;x<n;x++) {
			
			square =	x*x;
			if(square<=n) {
				var=x;}			
		}System.out.print(var);
		}
	}

