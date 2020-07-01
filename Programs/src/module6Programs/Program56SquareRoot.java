package module6Programs;
import java.util.Scanner;
public class Program56SquareRoot {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int Square=1;
int i;
int ans=0;
for( i=1;i<=n;i++) {
	Square=i*i;
if(Square<=n)
{ans=i;}
}System.out.println(ans);
	}

}
