package lecture9;

import java.util.Scanner;

public class RotateArrray {
	public static int[] input() {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	public static int[] RotateArray (int arr[]) {
		Scanner scan=new Scanner(System.in);
		int n=arr.length;int temp;
		int Rotate=scan.nextInt();
		for(int i=0;i<Rotate;i++ ) {
		for(int j=0;j<n-1;j++) {
		temp=arr[j+1];
		arr[j+1]=arr[j];
		arr[j]=temp;
		
		}}return arr;
	}
	public static  void print(int arr[]) {
		int k=arr.length;
		for(int i=0;i<k;i++) {
			System.out.print(arr[i]+" ");
		}

	}	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int NOQ=scan.nextInt();
		for(int i=0;i<NOQ;i++) {
			int Array[]=input();
			int arr[]=RotateArray(Array);
			print(arr);
			}
	    
	}

}
