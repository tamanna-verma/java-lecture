package module9Programs;
import java.util.Scanner;
public class Program86RotateArray {
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
	public static void RotateArray(int Array[],int x) {
		int n=Array.length;
		for(int i=x;i<n;i++) {
			System.out.print(Array[i]+" ");
		}
		for(int i=0;i<x;i++) {
			System.out.print(Array[i]+" ");
		}
		
		
		
	}
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int Arr[]=Input();
	int x=scan.nextInt();
	RotateArray(Arr,x);

	}

}
