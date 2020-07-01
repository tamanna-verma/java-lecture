package module9Programs;

import java.util.Scanner;

public class Program84Merge2SortedArray {
	public static int[]Input(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int Array[]=new int[n];
		for(int i=0;i<n;i++) {
			Array[i]=scan.nextInt();
		}return Array;
	}
	public static int[] MergeSort(int Array1[],int Array2[]) {
		int n=Array1.length;
		int m=Array2.length;int x=0;
		int Array[]=new int[n+m];int i=0,j=0;
		while(i<n&&j<m)
		{
			if(Array1[i]<Array2[j]) 
			{
				Array[x]=Array1[i];
				i++;
				x++;
			}else //if(Array[i]>Array[j])
			{
				Array[x]=Array2[j];
				j++;
				x++;
			}}
		while(i<n)
		{
			Array[x]=Array1[i];
			i++;
			x++;}
		while(j<m)
		{
			Array[x]=Array2[j];
			j++;
			x++;
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
			int ARR1[]=Input();
			int ARR2[]=Input();
			int Ans[]=MergeSort(ARR1,ARR2);
			print(Ans);
		}

	}

}
