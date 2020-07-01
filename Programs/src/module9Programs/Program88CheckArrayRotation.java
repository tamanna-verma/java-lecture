package module9Programs;

import java.util.Scanner;

public class Program88CheckArrayRotation {
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
	public static int CheckRotation(int Array[]) {
		int n=Array.length;int i=0;
		int Smallest=Integer.MAX_VALUE;
for( i=0;i<n;i++) {
			if(Array[i]<Smallest) {
				Smallest=Array[i];
				
			}
			
		}

		return i;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Arr[]=Input();
		int Ans=CheckRotation(Arr);
		System.out.print(Ans);

	}

}
