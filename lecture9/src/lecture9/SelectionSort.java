package lecture9;
import java.util.Scanner;
public class SelectionSort {
public static int[] Input() {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int Array[]=new int[n];
	for(int i=0;i<n;i++) {
	 Array[i]=scan.nextInt();
	}return Array;
}
public static int[] SelectionSort(int Array[]) {
	int n=Array.length;int min=Integer.MIN_VALUE;int temp;
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
			if(Array[i]>Array[j]) {
				temp=Array[i];
				Array[i]=Array[j];
				Array[j]=temp;
				}
		}
	}return Array;
}
public static void Print(int Array[]){
	int n=Array.length;
	for(int i=0;i<n;i++) {
	System.out.print(Array[i]+" ");
	}
	
}
	public static void main(String[] args) {
		int arr[]=Input();
SelectionSort(arr);
Print(SelectionSort(arr));
	}

}
