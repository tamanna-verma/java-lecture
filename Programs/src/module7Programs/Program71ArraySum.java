package module7Programs;

import java.util.Scanner;
public class Program71ArraySum {
	public static int[] Input(int x) {
		Scanner scan=new Scanner(System.in);
		
		int Array[]=new int[x];
		for(int i=0;i<x;i++) {
			Array[i]=scan.nextInt();
		}return Array;
	}
	public static int add(int Array[]) {
		int n=Array.length;
		int Sum=0;
		for(int i=0;i<n;i++) {
			Sum=Sum+Array[i];
		}return Sum;
	}
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int x=scan.nextInt();
			
		int ARR[]=	Input(x);
			int added=add(ARR);
	System.out.println(added);
	}
	
}
