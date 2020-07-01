package pattern;
import java.util.Scanner;

public class starpattern {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int i=1;
while(i<=n) {
 int space=1;
 while (space<=n-i)
 {System.out.print(" ");
 space=space+1;
 }
	 int j=1;
	 while(j<=(2*i)-1) {
System.out.print("*");
j=j+1; 
	 }
	 System.out.println();
	 i=i+1;
	}
	}
}
