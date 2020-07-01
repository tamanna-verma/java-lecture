package module9Programs;
import java.util.Scanner;
public class Program81BinarySearch {
	public static int[]Input(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int Array[]=new int[n];
		for(int i=0;i<n;i++) {
			Array[i]=scan.nextInt();
		}return Array;
	}
	public static int BinarySearch(int Array[],int x) {
		int n=Array.length;
		int Start=0;
		int end=n-1;
	
	while(Start<=end)
	{
		int mid=(Start+end)/2;
		if(x==Array[mid]) {
			return mid;
		}else if(Array[mid]<x) {
			Start=mid+1;
			
		}else if(Array[mid]>x) {
			end=mid-1;
		}}return -1;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Arr[]=Input();
		int Noq=scan.nextInt();
		for(int i=0;i<Noq;i++) {
		int x=scan.nextInt();
		int Ans=BinarySearch(Arr,x);
		System.out.print(Ans);}
		
	}

}
