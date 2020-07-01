package module9Programs;

import java.util.Scanner;

public class Program89Sort012 {
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
	public static int [] Sort012(int Array[]) {
		Scanner scan=new Scanner(System.in);
		int n=Array.length;
		int start=0;
		int end=n-1;
		//		int temp=0;
		//		int temp1=0;
		for(int i=0;i<end;) 
		{
			if(Array[i]==0)
			{
				int temp=Array[i];
				Array[i]=Array[start];
				Array[start]=temp;
				start++;
				i++;
			}
			else if(Array[i]==2)//yar sort012 h ques u there?ok lemme check
			{
				int temp1=Array[i];
				Array[i]=Array[end];
				Array[end]=temp1;
				end=end-1;
			}
			else
			{
				i++;
			}
//ye likhne ki kya jroorat h ,ok smjgyi
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
		int Arr[]=Input();
		int ANS[] =Sort012(Arr);
		print(ANS);
	}
}
