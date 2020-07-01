package lecture9;
import java.util.Scanner;
public class SecondLargest {
	public static int[] input() {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	public static  void SecondLargest(int arr[]) {
		
	int n=arr.length;int count;int max=Integer.MIN_VALUE;
	int Count=0;int i;int max2=0;
	for(i=0;i<n;i++) {
	if(arr[i]>max) {
		max=arr[i];
		Count++;
	}}
	for(int j=0;j<n;j++) {
		if(arr[j]>max2&&arr[j]<max) {
			max2=arr[j];
		}
	}System.out.print(max2);
	
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int NOQ=scan.nextInt();
		for(int i=0;i<NOQ;i++) {
			int Array[]=input();
	SecondLargest(Array);
			}
	    

	}

}
