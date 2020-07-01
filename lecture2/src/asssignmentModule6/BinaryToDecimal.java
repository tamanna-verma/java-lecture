package asssignmentModule6;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int ans=0;
int pv=1;
while(n>0) {
int rem=n%10;

ans=ans+pv*rem;

pv=pv*2;
n=n/10;
}System.out.print(ans);

	}

}
