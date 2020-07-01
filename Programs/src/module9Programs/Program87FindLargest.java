package module9Programs;
import java.util.Scanner;
public class Program87FindLargest {
	public static int[]Input()
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int Array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			Array[i]=scan.nextInt();
		}return Array;
	}public static int SecondLargest(int Array[]) {
		int n=Array.length;int max=Integer.MIN_VALUE;int Ans=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(Array[i]>max) {
				max=Array[i];
			}
		}
		for(int i=0;i<n;i++) {
		if(Array[i]>Ans&&Array[i]<max) {
		Ans=Array[i];
		}
		}
		return Ans;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Arr[]=Input();
		int Ans=SecondLargest(Arr);
		System.out.print(Ans);

	}

}
