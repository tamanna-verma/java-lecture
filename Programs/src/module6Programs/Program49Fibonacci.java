package module6Programs;
import java.util.Scanner;
public class Program49Fibonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
int fa=0;
int fb=1;
int fc;
for(int i=1;i<=n;i++) {
		fc=fa+fb;
		fa=fb;
		fb=fc;		
}System.out.println(fa);	
	}

}
