package Array;
import java.util.Scanner;
public class ArraysIntersection {
	public static int[] input1() {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr1[i]=scan.nextInt();
		}return arr1;
	}
	public static int[] input2() {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int arr2[]=new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=scan.nextInt();
		}return arr2;
	}
	public static int ArrayIntersection(int arr1[],int arr2[])
	{
		int x=arr1.length;int y=arr2.length;
		for(int i=0;i<x;i++) 
		{
		
			for(int j=0;j<y;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
					arr2[j]=Integer.MIN_VALUE; 
					break;
				}
				
			
			}
		}	return Integer.MIN_VALUE;

	}
	public static void main(String[] args) {
int arrx[]=input1();
int arry[]=input2();
		ArrayIntersection(arrx,arry);
	
	}

}
