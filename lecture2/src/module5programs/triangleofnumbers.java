package module5programs;
import java.util.Scanner;
public class triangleofnumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if((n>=0)&&(n<=50)) {
		int i=1;
		while(i<=n) {
			int space =1;
			while(space<=n-i) {
				System.out.print(" ");
				space=space+1;
			}
			int j=1;
			int val=i;
			while(j<=i)
			{System.out.print(val);
			val=val+1;
			j=j+1;
			}
			
			int  r=1;
	int decval=2*i-2;
			while(r<=i-1) {
				System.out.print(decval);
				
				decval=decval-1;
				r=r+1;
				
			}	
			System.out.println();
			i=i+1;
		}
			}
	}
}