package lecture9;
import java.util.Scanner;
public class MergeSort {
public static int[] input1() {
	Scanner scan= new Scanner(System.in);
	int n=scan.nextInt();
	int arr1[]=new int[n];
	for(int i=0;i<n;i++) {
	arr1[i]=scan.nextInt();
	}
	return arr1;
}
public static int[] input2() {
	Scanner scan= new Scanner(System.in);
	int n=scan.nextInt();
	int arr2[]=new int[n];
	for(int i=0;i<n;i++) {
	arr2[i]=scan.nextInt();
	}
	return arr2;
}
	public static int[] Merging(int arr1[],int arr2[]) {
		int n=arr1.length;
		int m=arr2.length;
		int Array[]=new int[n+m];
		for(int i=0;i<n;i++) {
			Array[i]=arr1[i];
		}
		for(int i=n;i<n+m;i++) {
		
		Array[i]=arr2[(i)-n];
		}
		
		return Array;
	}
	public static int[] Sort (int Array[]) {
		int n=Array.length;int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n-1;j++)
			{
			if(Array[i]>Array[j]) {
				temp=Array[i];
				Array[i]=Array[j];
				Array[j]=temp;
				
			}
			}
		}
		return Array;
	}
	public static  void print(int Array[]) {
		int n=Array.length;
		for(int i=0;i<n;i++) {
			System.out.print(Array[i]+" ");
		}
		
	}
public static void main(String[] args) {
	int Array1[]=input1();
	int Array2[]=input2();
	Merging(Array1,Array2);
Sort(Merging(Array1,Array2));
print(Sort(Merging(Array1,Array2)));
	}

}
