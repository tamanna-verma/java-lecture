package module9Programs;
import java.util.Scanner;
public class Program82BubbleSort {
	public static int[]Input(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int Array[]=new int[n];
		for(int i=0;i<n;i++) {
			Array[i]=scan.nextInt();
		}return Array;
	}
	public static int[] BubbleSort(int Array[]) {
		int n=Array.length;int temp;
		for(int i=n;i>0;i--) {
			for(int j=0;j<n-1 ;j++) {
				if(Array[j]>Array[j+1]) {
			temp=Array[j];
			Array[j]=Array[j+1];
			Array[j+1]=temp;
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
	int Ans[]=BubbleSort(ARR);
	print(Ans);
}
	}

}
