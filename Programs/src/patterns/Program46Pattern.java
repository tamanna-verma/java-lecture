package patterns;

import java.util.Scanner;

public class Program46Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int n=scan.nextInt();
		int i=1;
		while(i<=n) {
			int space=1;

			while(space<=n-i)
			{System.out.print(" ");
			space++;
			}
			int j= 1;int val=i;
			while(j<=i) {
				System.out.print(val);
				val++;
				j++;
			}

			int k=1;int value=2*i-2;
			while(k<=i-1) {
				System.out.print(value);
				value--;
				k++;

			}	System.out.println();
			i++;
		}
	}

}
