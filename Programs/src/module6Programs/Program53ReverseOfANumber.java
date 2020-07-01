package module6Programs;
import java.util.Scanner;
public class Program53ReverseOfANumber {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int rev=0;
while(n>0) {
	int rem=n%10;
	rev=rev*10+rem;
	n=n/10;
}System.out.println(rev);

	}

}
