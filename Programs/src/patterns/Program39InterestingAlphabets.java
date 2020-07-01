package patterns;

import java.util.Scanner;

public class Program39InterestingAlphabets {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			char ch=(char)(65+n-i);
			while(j<=i) {
			System.out.print(ch);
		ch++;
			j++;
			}
			System.out.println();
			i++;
		}
	}
}
