package module6Programs;

import java.util.Scanner;

public class Program52TemaOfAP {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
int count=0;
		int n=1;
		int AP;
		while(n<=1000)
		{
			
				AP=3*n+2;if(AP%4!=0&&count<x) { 
				
					System.out.println(AP);
					count++;
				}
			n++;
		}
	}

}
