package patterns;
import java.util.Scanner;
public class Program47DiamonPattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;while(i<=(n+1)/2) {
	int space1=1;
	while(space1<=(((n+1)/2)-i)) {
		System.out.print(" ");
		space1++;
		}
	
	int j=1; while(j<=2*i-1) {
	System.out.print("*");
	j++;
	}
	System.out.println();
	i++;}
	
		
		int k=1;
		while(k<=(n-(n+1)/2)) {
		int space2=1;
		while(space2<=k)
		{	System.out.print(" ");
space2++;		
		}
		int l=n-(2*k);
		while(l>=1){
		System.out.print("*");
		l--;
		}
	System.out.println();
	k++;}
	
	}
}
