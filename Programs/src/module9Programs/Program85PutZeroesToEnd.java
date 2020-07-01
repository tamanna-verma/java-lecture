package module9Programs;
import java.util.Scanner;
public class Program85PutZeroesToEnd
{
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
	public static int[] PutZeroesToEnd (int Array[])
	{
		int n=Array.length;
		int end=n-1;int temp=0;int j;
		for(int i=0;i<=end;i++)
		{
			if(Array[i]==0)
			{
				for( j=i+1;j<=end;j++)
				{if(Array[j]!=0&&Array[i]==0) 
			 	{
					temp=Array[j];
					Array[j]=Array[i];
					Array[i]=temp;

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
		Scanner scan=new Scanner (System.in);
		int Arr[]=Input();
		int Ans[]=PutZeroesToEnd(Arr);
		print(Ans);
	}

}
