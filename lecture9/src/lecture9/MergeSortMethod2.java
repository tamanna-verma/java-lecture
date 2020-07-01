package lecture9;
import java.util.Scanner;
public class MergeSortMethod2 {
	public static int[] input1() {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=scan.nextInt();
		}
		return arr1;
	}
	public static int[] MergeSort(int arr1[],int arr2[]) {
		int n=arr1.length;
		int m=arr2.length;
		int Array[]=new int[n+m];
		int k=0;int i=0;int j=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])			
			{
				Array[k]=arr1[i];
				k++;
				i++;
			}
			else
			{
				Array[k]=arr2[j];
				k++;
				j++;
			}
		}
		while(i<arr1.length)
		{
			Array[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length)
		{
			Array[k]=arr2[j];
			k++;
			j++;
		}
		return Array;
	}
	public static  void print(int Array[]) {
		int k=Array.length;
		for(int i=0;i<k;i++) {
			System.out.print(Array[i]+" ");
		}

	}	
	public static void main(String[] args) {
		int Array1[]=input1();
		int Array2[]=input1();
		int Array3[]=MergeSort(Array1,Array2);	
		print(Array3);
	}
}
