package lecture9;
import java.util.Scanner;
public class BinarySearch {
	public static int[] Input() {
Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}return arr;
	}
	public static int BinarySearch (int arr[],int Num) {
		int n=arr.length;int start=0;int end=n-1;
		 	while(start<=end)	{
		int mid=(start+end)/2;
		if(Num==arr[mid])
		{
		return mid;	
		}
		else if(arr[mid]>Num) {
		end=mid-1;
		}else if(arr[mid]<Num) {
			start=mid+1;
		}
	}return-1; }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Array[]=Input();
		int NOQ=scan.nextInt();
		for(int i=0;i<NOQ;i++) {
			int Num=scan.nextInt();
			
		int BS=	BinarySearch(Array,Num);
		System.out.print(BS);
		}

	}

}
