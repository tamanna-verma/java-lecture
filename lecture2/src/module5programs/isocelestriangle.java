package module5programs;
import java.util.Scanner;
public class isocelestriangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i =1;
		while(i<=n) {
			int space=1;
			while(space<=n-i) { 
				System.out.print(" ");
				space=space+1;
			}
			int j=1;
			int val=1;
			while(j<=i) {
				System.out.print(j);
				j=j+1;
			}
			val=i-1;
			int r=1;
			while(r<=i-1) {
				System.out.print(val);
				val=val-1;
				r=r+1;}
				System.out.println();
				i=i+1;
		}
	}}

