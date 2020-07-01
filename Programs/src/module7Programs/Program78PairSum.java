package module7Programs;

import java.util.Scanner;

public class Program78PairSum {
	public static int[]Input(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int Array[]=new int[n];
		for(int i=0;i<n;i++) {
			Array[i]=scan.nextInt();
		}return Array;
	}
	public static int pairSum(int Array[],int x) {
		int n=Array.length;
		int count=0;
		for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
		if(i==j) {
			continue;
		}
		if(Array[i]+Array[j]==x) {
			count++;
			
		}
		}}return count;
	}
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int Noq=scan.nextInt();
for(int i=0;i<Noq;i++) {
	int Arr1[]=Input();
	int x=scan.nextInt();
	int PairSum=pairSum(Arr1,x);
	System.out.print(PairSum);
}
	}
}
