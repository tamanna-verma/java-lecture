import java.util.Scanner;
public class OddnumberspatternSir {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int i =1;

		while(i<=n) {

			int j=1;int val=2*i-1;
			while(j<=n-i)
			{
				System.out.print(val);

				val=val+2;
				j=j+1;

			}
			int k=1;int value=1;
			while(k<=i-1) {
				
			
			System.out.print(value);
			value=value+2; 
			k=k+1;
			}	
			System.out.println();
			i=i+1;

		}
	}
}
