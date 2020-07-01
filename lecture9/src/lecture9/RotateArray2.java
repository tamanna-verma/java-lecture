package lecture9;

import java.util.Scanner;

public class RotateArray2 {
	public static int[] input() {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	public static int [] ReverseArray(int arr[]) {
		int temp;
	int n=arr.length;
	for(int i=0,j=n-1;i<=n/2&&j>=n/2;i++,j--)
	{
	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	}
	
	return arr;}
	public static int[] RotateArray(int arr[],int Rotate) {
		int n=arr.length;
		int firstarraylength=(n-1-Rotate);int temp;
		for(int i=0,j=n-1-Rotate;i<=((n-1-Rotate)/2)&&j>=((n-1-Rotate)/2);j--,i++) {
	    temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
		}
		for(int i=firstarraylength+1,j=n-1;i<=(firstarraylength)+(Rotate/2)&&j>=(firstarraylength)+(Rotate/2);i++,j--)
		{temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}return arr;
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
			int array[]=ReverseArray(Array);
			int Rotate=scan.nextInt();
			int arr[]=RotateArray(array,Rotate);
			print(arr);
			}

	}

}
