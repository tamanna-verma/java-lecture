package module9Programs;

import java.util.Scanner;

public class Program83InsertionSort {
	public static int[]Input(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int Array[]=new int[n];
		for(int i=0;i<n;i++) {
			Array[i]=scan.nextInt();
		}return Array;
	}
	
	public static int[] InsertionSort(int Array[]) {
	int n=Array.length;
	for(int i=0;i<n;i++) {
	for(int j=i+1;j<n;j++) {
	for(int k=i;k<j;k++) {
	if(Array[k]>Array[k+1]) {
		int temp=Array[k];
		Array[k]=Array[k+1];
		Array[k+1]=temp;
	}
	}
	}
	}
	return Array;
	}
	public static void print(int Array[]) {
		int x=Array.length;
		for(int i=0;i<x;i++) {
			System.out.print(Array[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Noq=scan.nextInt();
		for(int i=0;i<Noq;i++) {
			int ARR[]=Input();
			int Ans[]=InsertionSort(ARR);
			print(Ans);
		}
			}

	
}
