package module9Programs;

import java.util.Scanner;

public class Program90SumOfArray {
	public static int[]Input()
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int Array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			Array[i]=scan.nextInt();
		}return Array;
	}
	public static int[] SumOfArray(int Array1[],int Array2[])
	{
		int n=Array1.length;
		int m=Array2.length;
		int x;int Sum;
		if(n>m)
		{
			x=n+1;
		}else
		{
			x=m+1;
		}
		int Array[]=new int[x];
		int Carry=0;int j=m-1,i=n-1;int Num;
		for(Num=x-1;i>=0&&Num>0&&j>=0;i--,Num--,j--)
		{
			Sum=Array1[i]+Array2[j]+Carry;
			int rem=Sum%10;
			Array[Num]=rem;
			Carry=Sum/10;
		}
		while(n>0)
		{
			for(int l=Num;l>0;l--) 
			{
				Sum=Array1[l]+Carry;
				int rem=Sum%10;
				Array[l]=rem;//yaha kya h p ki error?kya
				Carry=Sum/10;
				n--;
			}
		}while(m>0) {

			for(int p=Num;p>0;p--) 
			{
				Sum=Array1[p]+Carry;
				int rem=Sum%10;
				Array[p]=rem;
				Carry=Sum/10;
				m--;
			}	Array[0]=Carry;
		}return Array;
	} public static void print(int Array[]) {
		int x=Array.length;
		for(int i=0;i<x;i++) {
			System.out.print(Array[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Arr1[]=Input();
		int Arr2[]=Input();
		int Arr3[]=SumOfArray(Arr1,Arr2);
		print(Arr3);
	}
}
