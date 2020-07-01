package functions;
import java.util.Scanner;
public class nCRusingFunctions {
	public static int factorial(int n) {
		int ans=1;
		for(int i=1;i<=n;i++) {
		ans=ans*i;
		}return ans;
	}
	 
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
 int n=scan.nextInt();
 int r=scan.nextInt();
 int num=factorial(n);
 int den1=factorial(r);
 int den2=factorial(n-r);
 int ans=num/(den1*den2);
 System.out.println(ans);
 
	}

}
