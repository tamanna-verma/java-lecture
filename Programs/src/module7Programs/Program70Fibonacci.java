package module7Programs;
import java.util.Scanner;
public class Program70Fibonacci {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a=0;
	int b=1;
	int x=scan.nextInt();
	while(a<=Math.pow(10, 4)) {
		int c=a+b;
		a=b;
		b=c;
		if(a==x) {
			System.out.println(true);
			return;
		}else if(a>x)
		{
			System.out.println(false);
			return;
			}
	}
	}

}
