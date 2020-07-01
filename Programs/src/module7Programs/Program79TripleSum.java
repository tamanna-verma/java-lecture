package module7Programs;

import java.util.Scanner;

public class Program79TripleSum {
	public static int[]Input(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int Array[]=new int[n];
		for(int i=0;i<n;i++) {
			Array[i]=scan.nextInt();
		}return Array;
	}
	public static int TripleSum(int Array[],int x) {
		int n=Array.length;
		int count=0;
		for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
		for(int k=j+1;k<n;k++) {
		if(Array[i]+Array[j]+Array[k]==x) {
			count++;
			
		}}
		}}return count;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Noq=scan.nextInt();
		for(int i=0;i<Noq;i++) {
			int Arr1[]=Input();
			int x=scan.nextInt();
			int tripleSum=TripleSum(Arr1,x);
			System.out.print(tripleSum);
		}
			

	}

}
